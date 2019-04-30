/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementportal;

import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Lupe
 */
public class Visit {

    private int visitID;                //NOT null
    private int residentID;             //NOT null
    private int bedID;                  //NOT null
    private java.sql.Timestamp date_CheckIn;        //NOT null

    final String myDBURL = "jdbc:sqlserver://sql5008.site4now.net:1433;DatabaseName=DB_A47087_smgroup;user=DB_A47087_smgroup_admin;password=ftccgroup1";
    private static Connection conn = null;

    public Visit() {
        residentID = -1;
        bedID = -1;
    }

    // Constructor all information available
    public Visit(int visitID, int residentID, int bedID, java.sql.Timestamp date_CheckIn) {
        this.visitID = visitID;
        this.residentID = residentID;
        this.bedID = bedID;
        this.date_CheckIn = date_CheckIn;
    }

    // constructor with just a resident ID, no bed or visit ID
    public Visit(int residentID, java.sql.Timestamp date_CheckIn) {
        this.residentID = residentID;
        this.date_CheckIn = date_CheckIn;
        this.bedID = -1;

        // get the first available bed, provided the resident doesn't have a bed from the previous night 
        try {
            conn = DriverManager.getConnection(myDBURL);
            Statement statement = conn.createStatement(); 
            String sql; 

            PreparedStatement search = conn.prepareStatement("SELECT Bed_ID FROM Visit WHERE Resident_ID = ? AND Date_Check_In >= DATEADD(HOUR, -30, GetDate()) AND Date_Check_In <= DATEADD(HOUR, -10, GetDate())");
            
            search.setInt(1, this.residentID);
            ResultSet rs = search.executeQuery();

            if (!rs.isBeforeFirst()) {
                System.out.println("No previous bed found for resident - assigning empty bed.");
                sql = "Select MIN(Bed_Id) from Bed WHERE Bed_ID NOT IN (SELECT Bed_ID from Visit WHERE Date_Check_In > DATEADD(HOUR, -30, GetDate()));";
                rs =  statement.executeQuery(sql);
                rs.next(); 
                this.bedID = rs.getInt(1);
                
            } else {
                System.out.println("Previous bed found for resident");
                rs.next();
                this.bedID = rs.getInt(1);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    // constructor for new visit, no visit ID found 
    public Visit(int residentID, int bedID, java.sql.Timestamp date_CheckIn) {
        this.residentID = residentID;
        this.bedID = bedID;
        this.date_CheckIn = date_CheckIn;
    }

    public int getVisitID() {
        return visitID;
    }

    public void setVisitID(int visitID) {
        this.visitID = visitID;
    }

    public java.sql.Timestamp getDate_CheckIn() {
        return date_CheckIn;
    }

    public void setDate_CheckIn(java.sql.Timestamp date_CheckIn) {
        this.date_CheckIn = date_CheckIn;
    }

    public int getResidentID() {
        return residentID;
    }

    public int getBedID() {
        return bedID;
    }

    public void setResidentID(int residentID) {
        this.residentID = residentID;
    }

    public void setBedID(int bedID) {
        this.bedID = bedID;
    }

//Validation
    public boolean isDateValid(String date) {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        format.setLenient(false);
        try {
            java.sql.Timestamp dateForm = (java.sql.Timestamp) format.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;

    }

    public boolean ValidateYesOrNo(String str) {
        if (str.equals("Y") || str.equals("N")) {
            return true;
        }

        return false;
    }

    public boolean NotNullIsFilled(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void AddNewVisit(){
        // add new visit with details in this instance of a visit
        try {
            conn = DriverManager.getConnection(myDBURL);

            PreparedStatement ps = conn.prepareStatement("INSERT INTO [dbo].[Visit]([Resident_ID],[Bed_ID],[Date_Check_In]) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, residentID);
            ps.setInt(2, bedID);
            ps.setTimestamp(3, date_CheckIn);
            
            ps.executeUpdate();
            
            ResultSet tableKeys = ps.getGeneratedKeys();
            tableKeys.next();
            int visitKey = tableKeys.getInt(1);
            this.visitID = visitKey;
            TestOptionPane11 dbg = new TestOptionPane11("Visit ID is: " + visitID);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "\nEXCEPTION LOGGED AT AddNewVisit");
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManagementPortal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
