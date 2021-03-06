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
public class Shift {
    private int shiftID;        //NOT null
    private String description;  //NOT null
    private String start_date;  //NOT null
    private String end_date;    //NOT null
    private int max_volunteer;  //null
    private int min_volunteer;  //NOT null
    private String males_only;  //null
    private int min_age;        //NOT null
    
    public Shift()
    {
        description = "";
        start_date = "";
        end_date = "";
        max_volunteer = 1;
        min_volunteer = 1;
        males_only = "";
        min_age = 13;
    }
    
    public Shift(int sID)
    {
        shiftID = sID;
        description = "";
        start_date = "";
        end_date = "";
        max_volunteer = 1;
        min_volunteer = 1;
        males_only = "";
        min_age = 13;
    }
    
    public Shift(int sID, String des, String sDate, String eDate, int minVol, int minAge)
    {
        shiftID = sID;
        description = des;
        start_date = sDate;
        end_date = eDate;
        max_volunteer = minVol + 5;
        min_volunteer = minVol;
        males_only = "";
        min_age = minAge;
    }

    public int getShiftID() {
        return shiftID;
    }

    public void setShiftID(int shiftID) {
        this.shiftID = shiftID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getMax_volunteer() {
        return max_volunteer;
    }

    public void setMax_volunteer(int max_volunteer) {
        this.max_volunteer = max_volunteer;
    }

    public int getMin_volunteer() {
        return min_volunteer;
    }

    public void setMin_volunteer(int min_volunteer) {
        this.min_volunteer = min_volunteer;
    }

    public String getMales_only() {
        return males_only;
    }

    public void setMales_only(String males_only) {
        this.males_only = males_only;
    }

    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }
    
    
}
