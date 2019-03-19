/*
 * Copyright (C) 2019 Marshall Casey <caseym1325@students.forsythtech.edu>
 * Created for the FTCC course CSC-289-900-2019SP.
 * This program can be freely copied and/or distributed.
 */
package management.portal;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 **
 * @author Marshall Casey
 */
public class OldManagementPortal {

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        // Here is a change
    }
    */
    
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
       
        // connecting to the database
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/karnij?useSSL=false", "quinicacid","Mm436yru");
   
           // how to read from the database
        PreparedStatement state = con.prepareStatement("select * from names");
       
        // Resultset takes the data as a iterable array
        ResultSet result = state.executeQuery();
       
        System.out.println("\n reading from the database \n");  
       
        // iterable resultset is printed
        // result.getString(1) implies first column and each loop represents a row
        while(result.next()){
            System.out.println(result.getString(1)+"  " + result.getString(2));
        }
       
       
        // how to write to the database
        Statement stmt = con.createStatement();
       
        // ususal SQL commands as Strings
        //stmt.executeUpdate("INSERT INTO names " +
        //           "VALUES ('Nimal','Perera')");
       
        result = state.executeQuery();
       
        System.out.println("\nAfter writing to the database \n");  
       
        while(result.next()){
            System.out.println(result.getString(1)+"  " + result.getString(2));
        }
       
    }  
    
    public void startScreen() {
        
    }
}
