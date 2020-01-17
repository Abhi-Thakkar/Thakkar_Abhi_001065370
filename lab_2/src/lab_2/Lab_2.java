/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import java.util.Set;
import lab_2.Address;
import lab_2.PersonDetails;

/**
 *
 * @author Abhi
 */
public class Lab_2 {

    /**
     * @param args the command line arguments
     */
    PersonDetails PersonA=new PersonDetails();
    Address workaddress=new Address();
    Address homeaddress=new Address();
    Address localaddress=new Address();
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Lab_2 lab=new Lab_2();
        lab.displaydetails();
        lab.displayhomeaddress();
        lab.displayworkaddress();
        lab.displaylocaladdress();   
    }
    public void displaydetails(){
        String firstname=new String("Firstname:\tAbhi");
        PersonA.setFirstname(firstname);
        System.out.println(PersonA.getFirstname());
        
        String lastname=new String("Lastname:\tThakkar");
        PersonA.setLastname(lastname);
        System.out.println(PersonA.getLastname());
        
        String Dateofbirth=new String("Date of Birth:\tmm/dd/yyyy");
        PersonA.setDateofbirth(Dateofbirth);
        System.out.println(PersonA.getDateofbirth());
        
    }
 
    public void displayhomeaddress(){
        String homeaddress1=new String("\nHomeaddress:\t11/A Akshardham Soc");
        homeaddress.setAddress1(homeaddress1);
        String homeaddress2=new String("\t\told ahmedabad road");
        homeaddress.setAddress2(homeaddress2);
        String city=new String("City:\t\tAhmedabad");
        homeaddress.setCity(city);
        String state=new String("State:\t\tgujarat");
        homeaddress.setState(state);
        String pincode=new String("Pincode:\t382425");
        homeaddress.setPincode(pincode);
        String country=new String("Country:\tIndia");
        homeaddress.setCountry(country);
        
        PersonA.setHomeaddress(homeaddress);
        System.out.println(PersonA.homeaddress.getAddress1());
        System.out.println(PersonA.homeaddress.getAddress2());
        System.out.println(PersonA.homeaddress.getCity());
        System.out.println(PersonA.homeaddress.getState());
        System.out.println(PersonA.homeaddress.getPincode());
        System.out.println(PersonA.homeaddress.getCountry());
        
    }
 
    
    public void displayworkaddress(){
        String workaddress1=new String("\nWorkAddress:\tAbc");
        workaddress.setAddress1(workaddress1);
        String workaddress2=new String("\t\tXyz");
        workaddress.setAddress2(workaddress2);
        String city=new String("City:\t\tAhmedabad");
        workaddress.setCity(city);
        String state=new String("State:\t\tgujarat");
        workaddress.setState(state);
        String pincode=new String("Pincode:\t1234");
        workaddress.setPincode(pincode);
        String country=new String("Country:\tIndia");
        workaddress.setCountry(country);
        
        PersonA.setWorkaddress(workaddress);
        System.out.println(PersonA.workaddress.getAddress1());
        System.out.println(PersonA.workaddress.getAddress2());
        System.out.println(PersonA.workaddress.getCity());
        System.out.println(PersonA.workaddress.getState());
        System.out.println(PersonA.workaddress.getPincode());
        System.out.println(PersonA.workaddress.getCountry());
        
    }
    
    public void displaylocaladdress(){
        String localaddress1=new String("\nLocalAddress:\tXYZ");
        localaddress.setAddress1(localaddress1);
        String localaddress2=new String("\t\tABC");
        localaddress.setAddress2(localaddress2);
        String city=new String("City:\t\tBoston");
        localaddress.setCity(city);
        String state=new String("State\t\tMA");
        localaddress.setState(state);
        String pincode=new String("Pincode\t\t4321");
        localaddress.setPincode(pincode);
        String country=new String("State\t\tMassachusetts");
        localaddress.setCountry(country);
        
        PersonA.setLocaladdress(localaddress);
        System.out.println(PersonA.localaddress.getAddress1());
        System.out.println(PersonA.localaddress.getAddress2());
        System.out.println(PersonA.localaddress.getCity());
        System.out.println(PersonA.localaddress.getState());
        System.out.println(PersonA.localaddress.getPincode());
        System.out.println(PersonA.localaddress.getCountry());
    
    }
}