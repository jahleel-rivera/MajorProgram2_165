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
public class Van extends Vehicle {//creation of variables along with encapsulation
    protected float clearanceHeight;
    protected int numWindows;
    
public Van(){//setting variables to java defaults
    clearanceHeight = 0.0f;
    numWindows = 0;
}

public float getMaxLoad(){
    return getClearanceHeight();
}

public void setMaxLoad(float clearanceHeight){
    this.setClearanceHeight(clearanceHeight);
}

public Van(float clearanceHeight, int numWindows){
    this.clearanceHeight = clearanceHeight;
    this.numWindows = numWindows;
    
}
    
    

    /**
     * @return the clearanceHeight
     */
    public float getClearanceHeight() {
        return clearanceHeight;
    }

    /**
     * @param clearanceHeight the clearanceHeight to set
     */
    public void setClearanceHeight(float clearanceHeight) {
        this.clearanceHeight = clearanceHeight;
    }

    /**
     * @return the numWindows
     */
    public int getNumWindows() {
        return numWindows;
    }

    /**
     * @param numWindows the numWindows to set
     */
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }
    @Override
    public String toString(){//toString method
        String s = super.toString() + System.lineSeparator() + clearanceHeight + System.lineSeparator() + numWindows;
        
        return s;
    }
    
}
