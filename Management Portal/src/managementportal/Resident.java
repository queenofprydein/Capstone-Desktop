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
    private String usVet;         //NOT null
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
    public Resident(int resID)
    {
        residentID = resID;
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
    public Resident(int resID, String fn, String ln, String ssn, String gen, String vet, String r, String eth)
    {
        residentID = resID;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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
    
    
}
