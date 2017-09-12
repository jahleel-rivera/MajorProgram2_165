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
public class Automobile extends Vehicle {//creation of variables and encapsulation
    private boolean hybrid;
    private int maxPassenger;
    private float trunkSpace;
    
public Automobile(){//setting to java defaults
    hybrid = false;
    maxPassenger = 0;
    trunkSpace= 0.0f;
}
public Automobile(boolean hybrid, int maxPassenger, float trunkSpace){
    this.hybrid = hybrid;
    this.maxPassenger = maxPassenger;
    this.trunkSpace = trunkSpace;
}

    /**
     * @return the hybrid
     */
    public boolean isHybrid() {
        return hybrid;
    }

    /**
     * @param hybrid the hybrid to set
     */
    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }

    /**
     * @return the maxPassenger
     */
    public int getMaxPassenger() {
        return maxPassenger;
    }

    /**
     * @param maxPassenger the maxPassenger to set
     */
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    /**
     * @return the trunkSpace
     */
    public float getTrunkSpace() {
        return trunkSpace;
    }

    /**
     * @param trunkSpace the trunkSpace to set
     */
    public void setTrunkSpace(float trunkSpace) {
        this.trunkSpace = trunkSpace;
    }

    @Override
    public String toString() {//toString Method
        String s = "A" + System.lineSeparator() + super.toString() + System.lineSeparator();
        int i = 0;
        if (hybrid == true) {
            i = 1;
        } else {
            i = 0;
        }

        s = i + System.lineSeparator() + maxPassenger + System.lineSeparator() + trunkSpace;

        return s;
    }
}