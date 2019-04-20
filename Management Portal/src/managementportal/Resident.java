/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementportal;

import java.sql.*;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Lupe
 */
public class Resident {
    private int residentID;     //NOT null
    private String firstName;   //NOT null
    private String lastName;    //NOT null
    private String addressLn1;  //null
    private String addressLn2;  //null
    private String city;        //null
    private String state;       //null
    private String zip;         //null
    private String phone;       //null
    private String phoneAlt;    //null
    private String res_email;   //null
    private String birthDate;   //null
    private String socialSN;    //NOT null
    private String gender;      //NOT null
    private String emContPhone; //null
    private String emContName;  //null
    private String usVet;       //NOT null
    private String race;        //NOT null
    private String ethnicity;   //NOT null
    
    public Resident()
    {
        firstName = "";
        lastName = "";
        addressLn1 = "";
        addressLn2 = "";
        city = "";
        state = "";
        zip = "";
        phone = "";
        phoneAlt = "";
        res_email = "";
        birthDate = null;
        socialSN = "";
        gender = "";
        emContPhone = "";
        usVet = "";
        race = "";
        ethnicity = "";
    }
    public Resident(int rID)
    {
        residentID = rID;
        firstName = "";
        lastName = "";
        addressLn1 = "";
        addressLn2 = "";
        city = "";
        state = "";
        zip = "";
        phone = "";
        phoneAlt = "";
        res_email = "";
        birthDate = null;
        socialSN = "";
        gender = "";
        emContPhone = "";
        usVet = "";
        race = "";
        ethnicity = "";
    }
    
    public Resident(String fn, String ln, String ssn, String gen, String vet, String r, String eth)
    {
        firstName = fn;
        lastName = ln;
        socialSN = ssn;
        gender = gen;
        usVet = vet;
        race = r;
        ethnicity = eth;
    }

    public int getResidentID() {
        return residentID;
    }

    public void setResidentID(int residentID) {
        this.residentID = residentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getAddressLn1() {
        return addressLn1;
    }

    public void setAddressLn1(String addressLn1) {
        this.addressLn1 = addressLn1;
    }

    public String getAddressLn2() {
        return addressLn2;
    }

    public void setAddressLn2(String addressLn2) {
        this.addressLn2 = addressLn2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneAlt() {
        return phoneAlt;
    }

    public void setPhoneAlt(String phoneAlt) {
        this.phoneAlt = phoneAlt;
    }

    public String getRes_email() {
        return res_email;
    }

    public void setRes_email(String res_email) {
        this.res_email = res_email;
    }

    public String getBirthDate() {
        return birthDate; 
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSocialSN() {
        return socialSN;
    }

    public void setSocialSN(String socialSN) {
        this.socialSN = socialSN;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmContPhone() {
        return emContPhone;
    }

    public void setEmContPhone(String emContPhone) {
        this.emContPhone = emContPhone;
    }

    public String getEmContName() {
        return emContName;
    }

    public void setEmContName(String emContName) {
        this.emContName = emContName;
    }

    public String getUsVet() {
        return usVet;
    }

    public void setUsVet(String usVet) {
        this.usVet = usVet;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }
    
    //Vaidation of data
    
    public boolean isFirstNameValid(String name)
    {
        return name.matches("[A-Z][a-zA-Z]*");
    }
    
    public boolean isLastNameValid(String name)
    {
        return name.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }
    
    public boolean isAddressValid(String add)
    {
        if(add.equals(""))
        {
            return true;
        }
        return add.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    public boolean isCityValid(String city)
    {
        if(city.equals(""))
        {
            return true;
        }
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    public boolean isStateValid(String state)
    {
        if(state.equals(""))
        {
            return true;
        }
        //two letter only
        return state.matches("[A-Z][A-Z]");
    }
    
    public boolean isZipValid(String zip)
    {
        if(zip.equals(""))
        {
            return true;
        }
        return zip.matches("\\d{4}-\\d{5}|\\d{5}");
    }
    
    public boolean isFullNameValid(String fullN)
    {
        if(fullN.equals(""))
        {
            return true;
        }
        return fullN.matches("[a-zA-Z\\\\s]*");
    }
    
    public boolean isEmailValid(String email)
    {
        if(email.equals(""))
        {
            return true;
        }
        return email.matches("^(.+)@(.+)$");
    }
    
    public boolean isBirthDateValid(String birthD)
    {
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        if(birthD.equals("")) {
            return true;
        } else {
            try {
                format.parse(birthD);
                return true; 
            } catch (ParseException e) {
                return false; 
            }
        }
    }
    
    public boolean isSSNValid(String ssn)
    {
        return (ssn.matches("\\d{3}-\\d{2}-\\d{4}") || ssn.equals("0") || ssn.equals("1"));
    }
    
    public boolean isGenderValid(String gen)
    {
        // ensure only males are considered valid
        return gen.equals("MA");
    }
    
    public boolean isSelectionFieldValid(String sel)
    {
        //One letter only
        return !sel.trim().equals("");        
    }

    
    public void AddNewResident(Connection conn, Statement statement, String fName, String lName, String add, String add2, String c, String st, String zp, String phne, String phneAlt, String email, String bDate, String ssn, String gen, String emergencyP, String emergencyN, String vet, String r, String eth)
    {
        String sql; 
        String error = "The following fields contain an error: "; 
        int errorCount = 0; 
        
        // check for invalid gender - if not male, refer to another shelter 
        if(isGenderValid(gen) == true)
        {
            gender = "'" + gen + "'";
            
            if(isFirstNameValid(fName) == true)
            {
                firstName = "'" + fName + "'";
            } else {
                error += "\nFirst Name";
                errorCount ++;
            }
            if(isLastNameValid(lName) == true)
            {
                lastName = "'" + lName + "'";
            } else {
                error += "\nLast Name";
                errorCount ++;}
            if(isAddressValid(add) == true)
            {
                if (add.equals("")){
                    addressLn1 = "NULL";
                } else {
                    addressLn1 = "'" + add + "'";
                }
            } else {
                error += "\nAddress Line 1";
                errorCount ++;
            }
            if(isAddressValid(add2) == true)
            {
                if (add2.equals("")) {
                    addressLn2 = "NULL"; 
                } else {
                    addressLn2 = "'" + add2 + "'";
                }
            } else {
                error += "\nAddress Line 2";
                errorCount ++;
            }
            if(isCityValid(c) == true)
            {   if (c.equals("")){
                    city = "NULL";
                } else {
                    city = "'" + c + "'";
                }
            } else {
                error += "\nCity";
                errorCount ++;
            }
            if(isStateValid(st) == true)
            {
                if (st.equals("")) {
                    state = "NULL"; 
                } else {
                    state = "'" + st + "'";
                }
            } else {
                error += "\nState";
                errorCount ++;
            }    
            if(isZipValid(zp) == true)
            {
                if (zp.equals("")) {
                    zip = "NULL"; 
                } else {
                    zip = "'" + zp + "'";
                }
            } else {
                error += "\nZip Code";
                errorCount ++;
            }
           if (phne.equals("")){
                phone = "NULL"; 
            } else {
                phne = phne.replaceAll("[^0-9]","");
                phone = "'" + phne + "'";
            }
            if (phneAlt.equals("")) {
                phoneAlt = "NULL"; 
            } else {
                phneAlt = phneAlt.replaceAll("[^0-9]","");
                phoneAlt = "'" + phneAlt + "'";
            }

            if(isEmailValid(email) == true)
            {
                if (email.equals("")){
                    res_email = "NULL"; 
                } else {
                    res_email = "'" + email + "'";
                }
            } else {
                error += "\nEmail Address - Resident";
                errorCount ++;
            }
            if(isBirthDateValid(bDate) == true)
            {
                if (bDate.equals("")) {
                    birthDate = "NULL"; 
                } else {
                    birthDate = "'" + bDate + "'";
                }
            } else if (bDate.equals("Client doesn't know") || bDate.equals("Client refused")) {
                birthDate = "NULL"; 
            } else {
    //           JOptionPane.showMessageDialog(null, "DOB: " + bDate, "DOB", JOptionPane.INFORMATION_MESSAGE);
                error += "\nDate of Birth";
                errorCount ++;
            }
            if(isSSNValid(ssn) == true)
            {
                if (ssn.equals("") || ssn.equals("Client doesn't know") || ssn.equals("Client refused")) {
                    socialSN = "NULL";
                } else {
                    socialSN = "'" + ssn.replaceAll("-", "") + "'";
                }
            } else {
                error += "\nSSN";
                errorCount ++;
            }

            if (emergencyP.equals("")) {
                emContPhone = "NULL"; 
            } else {
                emergencyP = emergencyP.replaceAll("[^0-9]","");
                emContPhone = "'" + emergencyP + "'";
            }
            if(isFullNameValid(emergencyN) == true)
            {
                if (emergencyN.equals("")){
                    emContName = "NULL";
                } else {
                    emContName = "'" + emergencyN + "'";
                }
            } else {
                error += "\nName - Emergency Contact";
                errorCount ++;
            }
            if(isSelectionFieldValid(vet) == true)
            {
                usVet = "'" + vet + "'";
            } else {
                error += "\nMilitary Veteran";
                errorCount ++;
            }
            if(isSelectionFieldValid(r) == true)
            {
                race = "'" + r + "'";
            } else {
                error += "\nRace";
                errorCount ++;
            }
            if(isSelectionFieldValid(eth) == true)
            {
                ethnicity = "'" + eth + "'";
            } else {
                error += "\nEthnicity";
                errorCount ++;
            }

            if (errorCount == 0){
                try
                {
                    statement = conn.createStatement();
                    sql = "INSERT INTO [dbo].[Resident]([Last_Name],[First_Name],[Address],[AddressLine2],[City],[State],[Zip_Code],[Phone],[Birth_Date],[SSN],[Gender],[Phone_Alternate],[Email],[Emergency_Contact_Phone],[Emergency_Contact_Name],[US_Military_Veteran],[Race],[Ethnicity]) VALUES (" + lastName + "," + firstName + "," + addressLn1 + "," + addressLn2 + "," + city + "," + state + "," + zip + "," + phone + "," + birthDate + "," + socialSN + "," + gender + "," + phoneAlt + "," + res_email + "," + emContPhone + "," + emContName + "," + usVet + "," + race + "," + ethnicity + ")";

                    JOptionPane.showMessageDialog(null, "Sending SQL: " + sql, "SQL", JOptionPane.INFORMATION_MESSAGE);
                    statement.executeQuery(sql); 
                    statement.close();
                }
                catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, error, "Invalid entries", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "This shelter can only accept males.  Please refer to another shelter.", "Gender mismatch", JOptionPane.INFORMATION_MESSAGE);
        }
        

    }
    
/*    public void AddNewResident(Connection conn, Statement statement, String fName, String lName, String add,String add2, String c, String st, String zp, String phne, String phneAlt, String email, String bDate, String ssn, String gen, String emergencyP, String emergencyN, String vet, String r, String eth)
    {
        if(isFirstNameValid(fName) == true)
        {
            firstName = fName;
        }
        if(isLastNameValid(lName) == true)
        {
            lastName = lName;
        }
        if(isAddressValid(add) == true)
        {
            addressLn1 = add;
        } else if (add.equals("")){
            addressLn1 = "NULL";
        }
        if(isAddressValid(add2) == true)
        {
            addressLn2 = add2;
        } else if (add2.equals("")) {
            addressLn2 = "NULL"; 
        }
        if(isCityValid(c) == true)
        {
            city = c;
        } else if (c.equals("")){
            city = "NULL";
        }
        if(isStateValid(st) == true)
        {
            state = st;
        } else if (st.equals("")) {
            state = "NULL"; 
        }    
        if(isZipValid(zp) == true)
        {
            zip = zp;
        } else if (zp.equals("")) {
            zip = "NULL"; 
        }
        if(isPhoneValid(phne) == true)
        {
            phone = phne;
        } else if (phne.equals("")){
            phone = "NULL"; 
        }
        if(isPhoneValid(phneAlt) == true)
        {
            phoneAlt = phneAlt;
        } else if (phneAlt.equals("")) {
            phoneAlt = "NULL"; 
        }
        if(isEmailValid(email) == true)
        {
            res_email = email;
        } else if (email.equals("")) {
            res_email = "NULL"; 
        }
        if(isBirthDateValid(bDate) == true)
        {
            birthDate = bDate;
        }
        if(isSSNValid(ssn) == true)
        {
            socialSN = ssn;
        }
        if(isPhoneValid(emergencyP) == true)
        {
            emContPhone = emergencyP;
        }
        if(isFullNameValid(emergencyN) == true)
        {
            emContName = emergencyN;
        }
        if(isSSNValid(ssn) == true)
        {
            socialSN = ssn;
        }
        if(isGenderValid(gen) == true)
        {
            gender = gen;
        }
        if(isUSVetValid(vet) == true)
        {
            usVet = vet;
        }
        if(isRaceValid(r) == true)
        {
            race = r;
        }
        if(isEthnicityValid(eth) == true)
        {
            ethnicity = eth;
        }
        
        try
        {
            statement = conn.createStatement();
            String sql = "INSERT INTO [dbo].[Resident]([Last_Name],[First_Name],[Address],[AddressLine2],[City],[State],[Zip_Code],[Phone],[Bith_Date],[SSN],[Gender],[Phone_Alternate],[Email],[Emergency_Contact_Phone],[Emergency_Phone_Name],[US_Military_Veteran],[Race],[Ethnicity]) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1, lastName);
            pstatement.setString(2, firstName);
            pstatement.setString(3, addressLn1);
            pstatement.setString(4, addressLn2);
            pstatement.setString(5, city);
            pstatement.setString(6, state);
            pstatement.setString(7, zip);
            pstatement.setString(8, phone);
            pstatement.setDate(9, turnStringToDate(bDate));
            pstatement.setString(10, socialSN);
            pstatement.setString(11, gender);
            pstatement.setString(12, phoneAlt);
            pstatement.setString(13, res_email);
            pstatement.setString(14, emContPhone);
            pstatement.setString(15, emContName);
            pstatement.setString(16, usVet);
            pstatement.setString(17, race);
            pstatement.setString(18, ethnicity);
            pstatement.executeUpdate(sql);
            pstatement.close();
            statement.close();
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void UpdateResident(Connection conn, Statement statement,int rID, String fName, String lName, String add,String add2, String c, String st, String zp, String phne, String phneAlt, String email, String bDate, String ssn, String gen, String emergencyP, String emergencyN, String vet, String r, String eth)
    {
        residentID = rID;
        if(isFirstNameValid(fName) == true)
        {
            firstName = fName;
        }
        if(isLastNameValid(lName) == true)
        {
            lastName = lName;
        }
        if(isAddressValid(add) == true)
        {
            addressLn1 = add;
        }
        if(isAddressValid(add2) == true)
        {
            addressLn2 = add2;
        }
        if(isCityValid(c) == true)
        {
            city = c;
        }
        if(isStateValid(st) == true)
        {
            state = st;
        }
        if(isZipValid(zp) == true)
        {
            zip = zp;
        }
        if(isPhoneValid(phne) == true)
        {
            phone = phne;
        }
        if(isPhoneValid(phneAlt) == true)
        {
            phoneAlt = phneAlt;
        }
        if(isEmailValid(email) == true)
        {
            res_email = email;
        }
        if(isBirthDateValid(bDate) == true)
        {
            birthDate = turnStringToDate(bDate);
        }
        if(isPhoneValid(emergencyP) == true)
        {
            emContPhone = emergencyP;
        }
        if(isFullNameValid(emergencyN) == true)
        {
            emContName = emergencyN;
        }
        if(isSSNValid(ssn) == true)
        {
            socialSN = ssn;
        }
        if(isGenderValid(gen) == true)
        {
            gender = gen;
        }
        if(isUSVetValid(vet) == true)
        {
            usVet = vet;
        }
        if(isRaceValid(r) == true)
        {
            race = r;
        }
        if(isEthnicityValid(eth) == true)
        {
            ethnicity = eth;
        }
        try
        {
            statement = conn.createStatement();
            String sql = "UPDATE [dbo].[Resident]\n" +
                            "\n" +
                            "SET [Last_Name] =?\n" +
                            "\n" +
                            ",[First_Name] = ?\n" +
                            "\n" +
                            ",[Address] = ?\n" +
                            "\n" +
                            ",[AddressLine2] = ?\n" +
                            "\n" +
                            ",[City] = ?\n" +
                            "\n" +
                            ",[State] = ?\n" +
                            "\n" +
                            ",[Zip_Code] = ?\n" +
                            "\n" +
                            ",[Phone] = ?\n" +
                            "\n" +
                            ",[Birth_Date] = ?\n" +
                            "\n" +
                            ",[SSN] = ?\n" +
                            "\n" +
                            ",[Gender] = ?\n" +
                            "\n" +
                            ",[Phone_Alternate] = ?\n" +
                            "\n" +
                            ",[Email] = ?\n" +
                            "\n" +
                            ",[Emergency_Contact_Phone] = ?\n" +
                            "\n" +
                            ",[Emergency_Contact_Name] = ?\n" +
                            "\n" +
                            ",[US_Military_Veteran] = ?\n" +
                            "\n" +
                            ",[Race] = ?\n" +
                            "\n" +
                            ",[Ethnicity] = ?\n" +
                            "\n" +
                            "WHERE Resident_ID = ?"; //ask dee what she called the id column
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1, lastName);
            pstatement.setString(2, firstName);
            pstatement.setString(3, addressLn1);
            pstatement.setString(4, addressLn2);
            pstatement.setString(5, city);
            pstatement.setString(6, state);
            pstatement.setString(7, zip);
            pstatement.setString(8, phone);
            pstatement.setDate(9, turnStringToDate(bDate));
            pstatement.setString(10, socialSN);
            pstatement.setString(11, gender);
            pstatement.setString(12, phoneAlt);
            pstatement.setString(13, res_email);
            pstatement.setString(14, emContPhone);
            pstatement.setString(15, emContName);
            pstatement.setString(16, usVet);
            pstatement.setString(17, race);
            pstatement.setString(18, ethnicity);
            pstatement.setInt(19, residentID);
            pstatement.executeUpdate(sql);
            pstatement.close();
            statement.close();
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
*/
}
