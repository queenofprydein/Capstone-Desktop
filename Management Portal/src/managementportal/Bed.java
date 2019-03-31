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
public class Bed {
    private int bedID;              //NOT null
    //private int visitID;          //NOT null
    //private int lockerID;         //NOT null
    private String typeOfBed;       //NOT null
    private String bed_description; //null
    
    public Bed()
    {
        typeOfBed = "";
        bed_description = "";
    }
    
    public Bed(int bID)
    {
        bedID = bID;
        typeOfBed = "";
        bed_description = "";
    }
    //forgot abour this constructor
    public Bed(int bID, String tob)
    {
        bedID = bID;
        typeOfBed = tob;
        bed_description = "";
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
