/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementportal;

import java.text.*;
import java.util.*;
/**
 *
 * @author Lupe
 */
public class Visit {
    private int visitID;                //NOT null
    private int residentID;             //NOT null
    Resident resident;
    private int bedID;
    Bed bed;
    private String date_CheckIn;        //NOT null
    private String date_CheckOut;       //NOT null
    private String refer_other_org;     //NOT null
    private String relastionship_head;  //NOT null
    private String disability_con;      //NOT null
    private String disabilityType;      //NOT null
    private String disability_longT;    //NOT null
    private String disability_dep;      //NOT null
    private String recieve_disab;       //NOT null
    private String insurance_con;       //NOT null
    private String insuranceType;       //NOT null
    private String homeless_history;    //NOT null
    private String length_stay_prior;   //NOT null
    private String homeless_start;      
    private int numOfTimes_homeless;    //NOT null
    private String house_status;        //NOT null
    private String last_zip;            
    private String coc_code;
    private String NC_county_serv;
    private String residentCounty;
    private String residentCity;
    private String shelter_cat;         //NOT null
    private String recieving_income;    //NOT null
    private String source_income;       //NOT null
    private String source_nonIncome_name;//NOT null
    private String form_sharingPlan;    //NOT null
    
    public Visit()
    {           
        date_CheckIn = "";        
        date_CheckOut = "";       
        refer_other_org = "";     
        relastionship_head = "";  
        disability_con = "";      
        disabilityType = "";      
        disability_longT = "";    
        disability_dep = "";
        recieve_disab = "";
        insurance_con = "";
        insuranceType = "";
        homeless_history = "";
        length_stay_prior = "";
        homeless_start = "";
        numOfTimes_homeless = 1;
        house_status = "";
        last_zip = "";
        coc_code = "";
        NC_county_serv = "";
        residentCounty = "";
        residentCity = "";
        shelter_cat = "";
        recieving_income = "";
        source_income = "";
        source_nonIncome_name = "";
        form_sharingPlan = "";
    }
    
    public Visit(int visID)
    {
        visitID = visID;
        date_CheckIn = "";        
        date_CheckOut = "";       
        refer_other_org = "";     
        relastionship_head = "";  
        disability_con = "";      
        disabilityType = "";      
        disability_longT = "";    
        disability_dep = "";
        recieve_disab = "";
        insurance_con = "";
        insuranceType = "";
        homeless_history = "";
        length_stay_prior = "";
        homeless_start = "";
        numOfTimes_homeless = 1;
        house_status = "";
        last_zip = "";
        coc_code = "";
        NC_county_serv = "";
        residentCounty = "";
        residentCity = "";
        shelter_cat = "";
        recieving_income = "";
        source_income = "";
        source_nonIncome_name = "";
        form_sharingPlan = "";
    }
    //Consturctor with resident ID
    public Visit(int visID, int rID, int bID)
    {
        visitID = visID;
        resident = new Resident(rID);
        bed = new Bed(bID);
        date_CheckIn = "";        
        date_CheckOut = "";       
        refer_other_org = "";     
        relastionship_head = "";  
        disability_con = "";      
        disabilityType = "";      
        disability_longT = "";    
        disability_dep = "";
        recieve_disab = "";
        insurance_con = "";
        insuranceType = "";
        homeless_history = "";
        length_stay_prior = "";
        homeless_start = "";
        numOfTimes_homeless = 1;
        house_status = "";
        last_zip = "";
        coc_code = "";
        NC_county_serv = "";
        residentCounty = "";
        residentCity = "";
        shelter_cat = "";
        recieving_income = "";
        source_income = "";
        source_nonIncome_name = "";
        form_sharingPlan = "";
    }

    public int getVisitID() {
        return visitID;
    }

    public void setVisitID(int visitID) {
        this.visitID = visitID;
    }

    public String getDate_CheckIn() {
        return date_CheckIn;
    }

    public void setDate_CheckIn(String date_CheckIn) {
        this.date_CheckIn = date_CheckIn;
    }

    public String getDate_CheckOut() {
        return date_CheckOut;
    }

    public void setDate_CheckOut(String date_CheckOut) {
        this.date_CheckOut = date_CheckOut;
    }

    public String getRefer_other_org() {
        return refer_other_org;
    }

    public void setRefer_other_org(String refer_other_org) {
        this.refer_other_org = refer_other_org;
    }

    public String getRelastionship_head() {
        return relastionship_head;
    }

    public void setRelastionship_head(String relastionship_head) {
        this.relastionship_head = relastionship_head;
    }

    public String getDisability_con() {
        return disability_con;
    }

    public void setDisability_con(String disability_con) {
        this.disability_con = disability_con;
    }

    public String getDisabilityType() {
        return disabilityType;
    }

    public void setDisabilityType(String disabilityType) {
        this.disabilityType = disabilityType;
    }

    public String getDisability_longT() {
        return disability_longT;
    }

    public void setDisability_longT(String disability_longT) {
        this.disability_longT = disability_longT;
    }

    public String getDisability_dep() {
        return disability_dep;
    }

    public void setDisability_dep(String disability_dep) {
        this.disability_dep = disability_dep;
    }

    public String getRecieve_disab() {
        return recieve_disab;
    }

    public void setRecieve_disab(String recieve_disab) {
        this.recieve_disab = recieve_disab;
    }

    public String getInsurance_con() {
        return insurance_con;
    }

    public void setInsurance_con(String insurance_con) {
        this.insurance_con = insurance_con;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getHomeless_history() {
        return homeless_history;
    }

    public void setHomeless_history(String homeless_history) {
        this.homeless_history = homeless_history;
    }

    public String getLength_stay_prior() {
        return length_stay_prior;
    }

    public void setLength_stay_prior(String length_stay_prior) {
        this.length_stay_prior = length_stay_prior;
    }

    public String getHomeless_start() {
        return homeless_start;
    }

    public void setHomeless_start(String homeless_start) {
        this.homeless_start = homeless_start;
    }

    public int getNumOfTimes_homeless() {
        return numOfTimes_homeless;
    }

    public void setNumOfTimes_homeless(int numOfTimes_homeless) {
        this.numOfTimes_homeless = numOfTimes_homeless;
    }

    public String getHouse_status() {
        return house_status;
    }

    public void setHouse_status(String house_status) {
        this.house_status = house_status;
    }

    public String getLast_zip() {
        return last_zip;
    }

    public void setLast_zip(String last_zip) {
        this.last_zip = last_zip;
    }

    public String getCoc_code() {
        return coc_code;
    }

    public void setCoc_code(String coc_code) {
        this.coc_code = coc_code;
    }

    public String getNC_county_serv() {
        return NC_county_serv;
    }

    public void setNC_county_serv(String NC_county_serv) {
        this.NC_county_serv = NC_county_serv;
    }

    public String getResidentCounty() {
        return residentCounty;
    }

    public void setResidentCounty(String residentCounty) {
        this.residentCounty = residentCounty;
    }

    public String getResidentCity() {
        return residentCity;
    }

    public void setResidentCity(String residentCity) {
        this.residentCity = residentCity;
    }

    public String getShelter_cat() {
        return shelter_cat;
    }

    public void setShelter_cat(String shelter_cat) {
        this.shelter_cat = shelter_cat;
    }

    public String getRecieving_income() {
        return recieving_income;
    }

    public void setRecieving_income(String recieving_income) {
        this.recieving_income = recieving_income;
    }

    public String getSource_income() {
        return source_income;
    }

    public void setSource_income(String source_income) {
        this.source_income = source_income;
    }

    public String getSource_nonIncome_name() {
        return source_nonIncome_name;
    }

    public void setSource_nonIncome_name(String source_nonIncome_name) {
        this.source_nonIncome_name = source_nonIncome_name;
    }

    public String getForm_sharingPlan() {
        return form_sharingPlan;
    }

    public void setForm_sharingPlan(String form_sharingPlan) {
        this.form_sharingPlan = form_sharingPlan;
    }
    
    //Validation
    public boolean isDateValid(String date)
    {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        format.setLenient(false);
        try
        {
            Date dateForm = format.parse(date);
        }
        catch(ParseException e)
        {
            return false;
        }
        return true;
        
    }
    
    public boolean ValidateYesOrNo(String str)
    {
        if(str.equals("Y") || str.equals("N"))
        {
            return true;
        }
        
        return false;
    }
    
    public boolean NotNullIsFilled(String str)
    {
        if(str != null && !str.isEmpty())
        {
            return true;
        }
        return false;
    }
}   

