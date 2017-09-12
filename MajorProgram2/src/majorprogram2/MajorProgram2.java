/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author exchange
 */
public class MajorProgram2 {// main method with code to run each class through and display needed information

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Automobile automobile = new Automobile();
//        
//        automobile.setHybrid(true);
//        automobile.setMake("Acura");
//        automobile.setMaxPassenger(5);
//        automobile.setTrunkSpace(8);
//        automobile.setModel("TLX");
//        automobile.setVin("4HYFR3F91HA987128");
//        automobile.setYear(2016);
//        JOptionPane.showMessageDialog(null, automobile.toString());
//        
//        
//        PassengerVan passengerVan = new PassengerVan();
//        
//        passengerVan.setClearanceHeight(1);
//        passengerVan.setDvdPlayer(true);
//        passengerVan.setMake("Ford");
//        passengerVan.setMaxPassengers(9);
//        passengerVan.setModel("Connect");
//        passengerVan.setNumSeatRows(2);
//        passengerVan.setNumWindows(6);
//        passengerVan.setVin("4IYTLJGHUF888948");
//        passengerVan.setYear(2017);
//        //JOptionPane.showMessageDialog(null, passengerVan.toString());
//        
//        CargoVan cargoVan = new CargoVan();
//        
//        cargoVan.setCargoArea(4);
//        cargoVan.setClearanceHeight(60);
//        cargoVan.setMake("Jeep");
//        cargoVan.setMaxLoad(80);
//        cargoVan.setModel("Cherooke");
//        cargoVan.setNumWindows(4);
//        cargoVan.setVin("67AGFHUCUFU3456AGGFW");
//        cargoVan.setYear(2017);
//        //JOptionPane.showMessageDialog(null, cargoVan.toString());

//        Fleet fleet = new Fleet();
//        String load = "";
//        String save = "";
//        
//        if(args.length > 0){
//            load = args[0];
//            save = args[1];
//        }else{
//            JFileChooser jFile = new JFileChooser();
//            if(jFile.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
//                load = jFile.getSelectedFile().getAbsolutePath();
//            }
//            if(jFile.showSaveDialog(null)== JFileChooser.APPROVE_OPTION){
//                save = jFile.getSelectedFile().getAbsolutePath();
//            }
//        }
        
//        System.out.print(load);
//        System.out.print(save);
        

      // fleet.loadFleet(load);
       //fleet.saveFleet(save);
       new FleetFX().start(); 
    }
    
}
