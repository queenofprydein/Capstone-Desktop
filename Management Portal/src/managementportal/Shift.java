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
    private String last_Name;   //NOT null
    private String first_Name;  //NOT null
    private String start_date;  //NOT null
    private String end_date;    //NOT null
    private int max_volunteer;  //null
    private int min_volunteer;  //NOT null
    private String males_only;  //null
    private int min_age;        //NOT null
    
    public Shift()
    {
        last_Name = "";
        first_Name = "";
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
        last_Name = "";
        first_Name = "";
        start_date = "";
        end_date = "";
        max_volunteer = 1;
        min_volunteer = 1;
        males_only = "";
        min_age = 13;
    }
    
    public Shift(int sID, String lName, String fName, String sDate, String eDate, int minVol, int minAge)
    {
        shiftID = sID;
        last_Name = lName;
        first_Name = fName;
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
