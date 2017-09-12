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
public class PassengerVan extends Van {//creation of variables and encapsulation of variables
    private int numSeatRows;
    private int maxPassengers;
    private boolean dvdPlayer;
    
public PassengerVan(){//setting to java defaults
    numSeatRows = 0;
    maxPassengers = 0;
    dvdPlayer = false;
    
}

public PassengerVan(int numSeatRows, int maxPassengers, boolean dvdPlayer){
    this.numSeatRows = numSeatRows;
    this.maxPassengers = maxPassengers;
    this.dvdPlayer = dvdPlayer;
}

    /**
     * @return the numSeatRows
     */
    public int getNumSeatRows() {
        return numSeatRows;
    }

    /**
     * @param numSeatRows the numSeatRows to set
     */
    public void setNumSeatRows(int numSeatRows) {
        this.numSeatRows = numSeatRows;
    }

    /**
     * @return the maxPassengers
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * @param maxPassengers the maxPassengers to set
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * @return the dvdPlayer
     */
    public boolean isDvdPlayer() {
        return dvdPlayer;
    }

    /**
     * @param dvdPlayer the dvdPlayer to set
     */
    public void setDvdPlayer(boolean dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
    @Override
    public String toString(){//toString method
          int i = 0;
        if(dvdPlayer == true){
                i = 1;
            }else{
                i = 0;
            }
        String t = "P" + System.lineSeparator() + super.toString() + System.lineSeparator() + numSeatRows + System.lineSeparator() + maxPassengers + System.lineSeparator() + i;
        
            return t;
    }
}
