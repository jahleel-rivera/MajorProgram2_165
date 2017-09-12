/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

/**
 *
 * @author exchange
 */
public class Vehicle {//creation of variables and encapsulation
    private String make;
    private String model;
    private String vin;
    private int year;
    
public Vehicle(){//setting to java defaults
    make = "";
    model = "";
    vin = "";
    year = 0;
}

public Vehicle(String make, String model, String vin, int year){
    this.make = make;
    this.model = model;
    this.vin = vin;
    this.year = year;
}

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin the vin to set
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    public String toString(){//toString method
        return make + System.lineSeparator() + model + System.lineSeparator() + vin + System.lineSeparator() + year;
    }
    
}
