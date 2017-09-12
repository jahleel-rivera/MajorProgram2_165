/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author exchange
 */
public class Fleet {//creation and ecapsulation of variables
    private String fleetName;
    ArrayList<Vehicle> fleetList;
    
public Fleet(){//setting to java defaults
    fleetList = new ArrayList();
    fleetName = "";
    
}

public Fleet(String fleetName){
    this.fleetName = fleetName;
    
}

    /**
     * @return the fleetName
     */
    public String getFleetName() {
        return fleetName;
    }

    /**
     * @param fleetName the fleetName to set
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }
    
    public int getNumVehicles(){
        return fleetList.size();
    }
    
    public Vehicle getVehicle(int index){
        return fleetList.get(index);
    }
    
    public void setVehicle(int index, Vehicle vehicle){
        fleetList.set(index, vehicle);
    }
    
    public void addVehicle(Vehicle item){
        fleetList.add(item);
        
    }
    
    public Vehicle deleteVehicle(int index){
        return fleetList.remove(index);
        
    }
    
    public void loadFleet(String fileName) {//load method
        try{
            Scanner sr = new Scanner(new File(fileName));
            fleetName = sr.nextLine();
            
            while(sr.hasNextLine()){
                String data = sr.nextLine();
                if(data.equals("A")){
                    Automobile mob = new Automobile();
                    mob.setMake(sr.nextLine());
                    mob.setModel(sr.nextLine());
                    mob.setVin(sr.nextLine());
                    mob.setYear(Integer.parseInt(sr.nextLine()));
                    int hy = Integer.parseInt(sr.nextLine());
                    if(hy == 0){
                        mob.setHybrid(false);
                    }
                    else if(hy == 1){
                        mob.setHybrid(true);
                    }
                    mob.setMaxPassenger(Integer.parseInt(sr.nextLine()));
                    mob.setTrunkSpace(Float.parseFloat(sr.nextLine()));
                    fleetList.add(mob);
                }else if(data.equals("P")){
                    PassengerVan vP = new PassengerVan();
                    vP.setMake(sr.nextLine());
                    vP.setModel(sr.nextLine());
                    vP.setVin(sr.nextLine());
                    vP.setYear(Integer.parseInt(sr.nextLine()));
                    vP.setClearanceHeight(Float.parseFloat(sr.nextLine()));
                    vP.setNumWindows(Integer.parseInt(sr.nextLine()));
                    vP.setNumSeatRows(Integer.parseInt(sr.nextLine()));
                    vP.setMaxPassengers(Integer.parseInt(sr.nextLine()));
                    int dvd = Integer.parseInt(sr.nextLine());
                    if(dvd == 0){
                        vP.setDvdPlayer(false);
                    }
                    else if(dvd == 1){
                        vP.setDvdPlayer(true);
                    }
                    fleetList.add(vP);
                
                }else if(data.equals("C")){
                    CargoVan vC = new CargoVan();
                    vC.setMake(sr.nextLine());
                    vC.setModel(sr.nextLine());
                    vC.setVin(sr.nextLine());
                    vC.setYear(Integer.parseInt(sr.nextLine()));
                    vC.setClearanceHeight(Float.parseFloat(sr.nextLine()));
                    vC.setNumWindows(Integer.parseInt(sr.nextLine()));
                    vC.setMaxLoad(Float.parseFloat(sr.nextLine()));
                    vC.setCargoArea((int) Float.parseFloat(sr.nextLine()));
                    fleetList.add(vC);
                }
            }
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }
    }
    
    public void saveFleet(String outputFileName){//save method
        try{
            PrintWriter doodle = new PrintWriter(new File(outputFileName));
            doodle.print(toString());
            doodle.close();
            
        }catch(Exception e){
            System.err.println("File was not found");
        }
    }
    
    public ArrayList<Vehicle> getVehicleList(Class vehicleClass){//handeling of arraylist
        ArrayList<Vehicle> vehicle = new ArrayList();
        
        if(vehicleClass == Automobile.class){
            for(int i = 0; i < fleetList.size(); i++){
                fleetList.get(i);
                Vehicle word = fleetList.get(i);
                if(word instanceof Automobile){
                    vehicle.add(word);
                }
                
            }
        }else if (vehicleClass == Van.class){
            for(int i = 0; i < fleetList.size(); i++){
                fleetList.get(i);
                Vehicle word = fleetList.get(i);
                if(word instanceof Van){
                    vehicle.add(word);
                }
            }
        }else if(vehicleClass == PassengerVan.class){
            for(int i = 0; i < fleetList.size(); i++){
                fleetList.get(i);
                Vehicle word = fleetList.get(i);
                if(word instanceof PassengerVan){
                    vehicle.add(word);
                }
            }
        }else if(vehicleClass == CargoVan.class){
            for(int i = 0; i < fleetList.size(); i++){
                fleetList.get(i);
                Vehicle word = fleetList.get(i);
                if(word instanceof CargoVan){
                    vehicle.add(word);
                }
            }
        }
        return vehicle;
    }
    
    @Override
    public String toString(){//toString method
        String fleet = fleetName;
        for(int i = 0; i < fleetList.size(); i++){
            fleet += System.lineSeparator() + fleetList.get(i).toString();
        }
        return fleet;
    }
}