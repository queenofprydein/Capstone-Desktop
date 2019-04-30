/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementportal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lupe
 */
public class Bed {
    private int bedID;              //NOT null
    private String typeOfBed;       //NOT null
    private String bed_description; //null
    
    public Bed()
    {
        // create new bed (find first available) 
        typeOfBed = "";
        bed_description = "";
        
        
    }

    // get bed information from bedID
    public Bed(int bedID) {
        this.bedID = bedID;
        
        Connection conn = null;
        final String myDBURL = "jdbc:sqlserver://sql5008.site4now.net:1433;DatabaseName=DB_A47087_smgroup;user=DB_A47087_smgroup_admin;password=ftccgroup1";

        try {
            conn = DriverManager.getConnection(myDBURL);
            String sql = "SELECT * FROM [dbo].[Bed] WHERE [Bed_ID] = ?";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, this.bedID);
            ResultSet rs = ps.executeQuery(); 
            rs.next();
            typeOfBed = rs.getString("TypeOfBed");
            bed_description = rs.getString("Description");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "" + "No Resident Found", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public int getBedID() {
        return bedID;
    }

    public void setBedID(int bedID) {
        this.bedID = bedID;
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }

    public void setTypeOfBed(String typeOfBed) {
        this.typeOfBed = typeOfBed;
    }

    public String getBed_description() {
        return bed_description;
    }

    public void setBed_description(String bed_description) {
        this.bed_description = bed_description;
    }
    
    
}
