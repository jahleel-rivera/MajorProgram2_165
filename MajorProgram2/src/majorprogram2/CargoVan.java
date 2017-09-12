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
public class CargoVan extends Van {//creation of variable and encapsulated to make getters and setters
    private float maxLoad;
    private float cargoArea;

public CargoVan(){//setting to java defaults
    maxLoad = 0.0f;
    cargoArea = 0.0f;
}

public CargoVan(float maxLoad, float cargoArea){
    this.maxLoad = maxLoad;
    this.cargoArea= cargoArea;
}

    /**
     * @return the maxLoad
     */
    public float getMaxLoad() {
        return maxLoad;
    }

    /**
     * @param maxLoad the maxLoad to set
     */
    public void setMaxLoad(float maxLoad) {
        this.maxLoad = maxLoad;
    }

    /**
     * @return the cargoArea
     */
    public float getCargoArea() {
        return cargoArea;
    }

    /**
     * @param cargoArea the cargoArea to set
     */
    public void setCargoArea(float cargoArea) {
        this.cargoArea = cargoArea;
    }
    
    public String toString() {// to string method
         String s = "C" + System.lineSeparator() +super.toString() + System.lineSeparator() + maxLoad + System.lineSeparator() + cargoArea;
         
         return s;
    }
    
    
    
}
