/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementportal;

import java.sql.*;
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
    private String middleName;  //null
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
        middleName = "";
        addressLn1 = "";
        addressLn2 = "";
        city = "";
        state = "";
        zip = "";
        phone = "";
        phoneAlt = "";
        res_email = "";
        birthDate = "";
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
        middleName = "";
        addressLn1 = "";
        addressLn2 = "";
        city = "";
        state = "";
        zip = "";
        phone = "";
        phoneAlt = "";
        res_email = "";
        birthDate = "";
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
    
    public boolean isPhoneValid(String phone)
    {
        if(phone.equals(""))
        {
            return true;
        }
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
    
    public boolean isFullNameValid(String fullN)
    {
        if(fullN.equals(""))
        {
            return true;
        }
        return fullN.matches("^[a-zA-Z\\\\s]+");
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
        if(birthD.equals(""))
        {
            return true;
        }
        //bith date mm/dd/yyyy with leading zeroes
        return birthD.matches("^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$");
    }
    
    public Date turnStringToDate(String bDay)
    {
        Date birthD;
        try 
        {
            birthD = (Date) new SimpleDateFormat("MM/dd/yyyy").parse(birthDate);
        } 
        catch (ParseException ex) 
        {
            birthD = null;
        }
        return birthD;
    }
    
    public boolean isSSNValid(String ssn)
    {
        return ssn.matches("[1-9]\\\\d{2}-[1-9]\\\\d{2}-\\\\d{4}");
    }
    
    public boolean isGenderValid(String gen)
    {
        //are we just excepting males or not?
        return gen.equals("Male");
    }
    
    public boolean isUSVetValid(String vet)
    {
        //One letter only
        if(vet.equals("Y") || vet.equals("N"))
        {
            return true;
        }
        
        return false;
    }
    
    public boolean isRaceValid(String race)
    {
        return race.matches("[A-Z][a-zA-Z]*");
    }
    
    public boolean isEthnicityValid(String ethnic)
    {
        return ethnic.matches("[A-Z][a-zA-Z]*");
    }
    
    public void AddNewResident(Connection conn, Statement statement, String fName, String lName, String ssn, String gen, String vet, String r, String eth)
    {
        
        if(isFirstNameValid(fName) == true)
        {
            firstName = fName;
        }
        if(isLastNameValid(lName) == true)
        {
            lastName = lName;
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
            String sql = "INSERT INTO [dbo].[Resident]([Last_Name],[First_Name],[SSN],[Gender],[US_Military_Veteran],[Race],[Ethnicity]) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1, lastName);
            pstatement.setString(2, firstName);
            pstatement.setString(3, socialSN);
            pstatement.setString(4, gender);
            pstatement.setString(5, usVet);
            pstatement.setString(6, race);
            pstatement.setString(7, ethnicity);
            pstatement.executeUpdate(sql);
            pstatement.close();
            statement.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    
    public void AddNewResident(Connection conn, Statement statement, String fName, String lName, String add,String add2, String c, String st, String zp, String phne, String phneAlt, String email, String bDate, String ssn, String gen, String emergencyP, String emergencyN, String vet, String r, String eth)
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
            birthDate = bDate;
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
}
