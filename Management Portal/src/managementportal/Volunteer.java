/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementportal;

/**
 *
 * @author Lupe
 */
public class Volunteer {
    private int volunteerID;            //NOT null
    private String last_Name;           //NOT null
    private String first_Name;          //NOT null
    private String middle_Name;         //null
    private String phone;               //null
    private String email;               //null
    private String pref_cont;           //null
    private String birthDate;           //null
    private String gender;              //NOT null
    private String emerg_cont_phone;    //null
    private String emerg_cont_name;     //null
    private String com_service;         //NOT null
    
    public Volunteer()
    {
        last_Name = "";
        first_Name = "";
        middle_Name = "";
        phone = "";
        email = "";
        pref_cont = "";
        birthDate = "";
        gender = "";
        emerg_cont_phone = "";
        emerg_cont_name = "";
        com_service = "";
    }
    
    public Volunteer(int volID)
    {
        volunteerID = volID;
        last_Name = "";
        first_Name = "";
        middle_Name = "";
        phone = "";
        email = "";
        pref_cont = "";
        birthDate = "";
        gender = "";
        emerg_cont_phone = "";
        emerg_cont_name = "";
        com_service = "";
    }
    
    public Volunteer(int volID, String lName, String fName, String gen, String service)
    {
        volunteerID = volID;
        last_Name = lName;
        first_Name = fName;
        middle_Name = "";
        phone = "";
        email = "";
        pref_cont = "";
        birthDate = "";
        gender = gen;
        emerg_cont_phone = "";
        emerg_cont_name = "";
        com_service = service;
    }

    public int getVolunteerID() {
        return volunteerID;
    }

    public void setVolunteerID(int volunteerID) {
        this.volunteerID = volunteerID;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getMiddle_Name() {
        return middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        this.middle_Name = middle_Name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPref_cont() {
        return pref_cont;
    }

    public void setPref_cont(String pref_cont) {
        this.pref_cont = pref_cont;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmerg_cont_phone() {
        return emerg_cont_phone;
    }

    public void setEmerg_cont_phone(String emerg_cont_phone) {
        this.emerg_cont_phone = emerg_cont_phone;
    }

    public String getEmerg_cont_name() {
        return emerg_cont_name;
    }

    public void setEmerg_cont_name(String emerg_cont_name) {
        this.emerg_cont_name = emerg_cont_name;
    }

    public String getCom_service() {
        return com_service;
    }

    public void setCom_service(String com_service) {
        this.com_service = com_service;
    }
    
    //Insert the Validation
    
}
