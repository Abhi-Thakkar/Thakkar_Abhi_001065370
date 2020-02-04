/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.p.pkg2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sun.management.resources.agent;

/**
 *
 * @author Abhi
 */
public class Mainmenu {
    Scanner scan = new Scanner(System.in);
     patient_details patient[];
   void Menu(){
       
        int a= 1;
        while(a==0){
            System.out.println("1.CREATE");
            System.out.println("2.HISTORY");
            System.out.println("3.CHECK FOR ABNORMAL VITAL SIGNS");
            System.out.println("4.UPDATE");
            System.out.println("5.EXIT");
            int i=scan.nextInt();
            if(i==1){
                int index=0;
                index++;
                NewEntry(index);
            }
            
        }
        
    }
    void  NewEntry(int n){
    List<Integer> Age= new ArrayList<>();
    List<Integer> Respiratory_Rate= new ArrayList<>();
    List<Integer> Heart_Rate= new ArrayList<>();
    List<Integer> Blood_Pressure= new ArrayList<>();
    List<Integer> Weight_Killos= new ArrayList<>();
    List<Integer> Weight_Pounds= new ArrayList<>();
        
        patient[n] = new patient_details();
        System.out.println("ENTER THE NAME OF THE PERSON");
        patient[n].setName(scan.next());
        

    
        System.out.println("ENTER THE AGE OF THE PERSON");
        Age.add(scan.nextInt());
        patient[n].setAge(Age);
        
        

        
        
    }
    
}
