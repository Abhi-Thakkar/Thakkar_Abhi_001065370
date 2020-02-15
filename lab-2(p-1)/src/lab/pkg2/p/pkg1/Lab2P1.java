/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.p.pkg1;
import java.util.Scanner;
import lab.pkg2.p.pkg1.patient_info;

/**
 *
 * @author Abhi
 */
public class Lab2P1 {
    static patient_info patient = new patient_info();
    static Scanner scan = new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        
        System.out.println("Enter the age of the person");
        patient.setAge_group(scan.nextInt());
        
        System.out.println("Enter the value for respiratory rate");
        patient.setRespiratory_rate(scan.nextInt());
        
        System.out.println("Enter the value for heart rate");
        patient.setHeart_rate(scan.nextInt());
        
        System.out.println("Enter the value for Systolic blood pressure");
        patient.setBlood_pressure(scan.nextInt());
        
        System.out.println("Enter the weight in killos");
        patient.setWeight_killos(scan.nextInt());
        
        System.out.println("Enter the weight in pounds");
        patient.setWeight_pounds(scan.nextInt());
        
          if(patient_normal()==true){
            System.out.println("Condition is Normal");   
        }
        else if(patient_normal()==false){
            System.out.println("Condition is Not Normal");
        }
        
       
        }
         static boolean patient_normal(){
             if(patient.getAge_group()==0 ){
                if(patient.getRespiratory_rate()>=30 && patient.getRespiratory_rate()<=50 &&
                     patient.getHeart_rate()>=120 && patient.getHeart_rate()<=160 &&
                        patient.getBlood_pressure()>=50 && patient.getBlood_pressure()<=70 &&
                        patient.getWeight_killos()>=2 && patient.getWeight_killos()<=3 &&
                        patient.getWeight_pounds()>=4.5 && patient.getWeight_pounds()<=7)
                    
                        return true;
                else{
                    return false;
                }
             }
             else if(patient.getAge_group()>0 && patient.getAge_group()<=1){
                if(patient.getRespiratory_rate()>=20 && patient.getRespiratory_rate()<=30 &&
                     patient.getHeart_rate()>=80 && patient.getHeart_rate()<=140 &&
                        patient.getBlood_pressure()>=70 && patient.getBlood_pressure()<=100 &&
                        patient.getWeight_killos()>=4 && patient.getWeight_killos()<=10 &&
                        patient.getWeight_pounds()>=9 && patient.getWeight_pounds()<=22){
                    
                        return true;
                }
                else{
                    return false;
                }
                
             } else if(patient.getAge_group()>=1 && patient.getAge_group()<=3){
                if(patient.getRespiratory_rate()>=20 && patient.getRespiratory_rate()<=30 &&
                     patient.getHeart_rate()>=80 && patient.getHeart_rate()<=130 &&
                        patient.getBlood_pressure()>=80 && patient.getBlood_pressure()<=110 &&
                        patient.getWeight_killos()>=10 && patient.getWeight_killos()<=14 &&
                        patient.getWeight_pounds()>=22 && patient.getWeight_pounds()<=31){
                    
                        return true;
                }
                else{
                    return false;
                }
                
                  } else if(patient.getAge_group()>=3 && patient.getAge_group()<=5){
                if(patient.getRespiratory_rate()>=20 && patient.getRespiratory_rate()<=30 &&
                     patient.getHeart_rate()>=80 && patient.getHeart_rate()<=120 &&
                        patient.getBlood_pressure()>=70 && patient.getBlood_pressure()<=100 &&
                        patient.getWeight_killos()>=14 && patient.getWeight_killos()<=18 &&
                        patient.getWeight_pounds()>=31 && patient.getWeight_pounds()<=40){
                    
                        return true;
                }
                else{
                    return false;
                }
                
                  } else if(patient.getAge_group()>=6 && patient.getAge_group()<=12){
                if(patient.getRespiratory_rate()>=20 && patient.getRespiratory_rate()<=30 &&
                     patient.getHeart_rate()>=70 && patient.getHeart_rate()<=110 &&
                        patient.getBlood_pressure()>=80 && patient.getBlood_pressure()<=120 &&
                        patient.getWeight_killos()>=20 && patient.getWeight_killos()<=42 &&
                        patient.getWeight_pounds()>=41 && patient.getWeight_pounds()<=92){
                    
                        return true;
                }
                else{
                    return false;
                }
                
                  } else if(patient.getAge_group()>=13){
                if(patient.getRespiratory_rate()>=12 && patient.getRespiratory_rate()<=20 &&
                     patient.getHeart_rate()>=55 && patient.getHeart_rate()<=105 &&
                        patient.getBlood_pressure()>=110 && patient.getBlood_pressure()<=120 &&
                        patient.getWeight_killos()>=50 &&
                        patient.getWeight_pounds()>=110){
                    
                        return true;
                }
                else{
                    return false;
                }
             }     
   return true;
  }
}
         

