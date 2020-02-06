/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.p.pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chief_kmv
 */
public class Lab2P2 { 
    static int index=0;
    static Scanner scan=new Scanner(System.in);
    static information patient[]=new information[100];
    
    
    public static void main(String[] args) {
        Menu();
    }
    
    static void Menu(){
        
        int i=1;
        
        while(i==1){
            System.out.println(" ");
            System.out.println("1)Create patient ");
            System.out.println("2)History of the patient");
            System.out.println("3)Check Abnormal Vital Signs of the patient");
            System.out.println("4)Update new Vital Signs of the patient");
            System.out.println("5)Quit");
            System.out.println(" ");
            int a=scan.nextInt();
            if(a==1){
                index++;
                CreatePatient(index);
            }else if(a==5){
                i=4;
            }else if(a==2){
                History();
            }else if(a==4){
                updateInformation();
            }else if(a==3){
                Abnormal();
            }
            
        }
    }
    
    static void CreatePatient(int m){
        
      
        
        patient[m]=new information();
        System.out.println("Enter Name of Patient:");
        patient[m].setName(scan.next());
       
        System.out.println("Enter the age of Person:");
        patient[m].setAge(scan.nextInt());
        
        
        System.out.println("Enter the Respiratory Rate:");
        patient[m].setRespiratory_rate(scan.nextInt());
        
        System.out.println("Enter the Blood Pressure:");
        patient[m].setBlood_pressure(scan.nextInt());
        
        System.out.println("Enter the Heart Rate:");
        patient[m].setHeart_rate(scan.nextInt());
        
        System.out.println("Enter the Weight(Killos):");
        patient[m].setWeight_killos(scan.nextDouble());
        
        System.out.println("Enter the Weight(pounds):");
        patient[m].setWeight_pounds(scan.nextDouble());
        
        
        if(PatientStatus(m)==false){
            System.out.println("CONDITION IS ABNORMAL");
        }else if(PatientStatus(m)==true){
            System.out.println("CONDITION IS NORMAL");
        }
       
        
    }
    
    static void History(){
        for(int i=1;i<=index;i++){
            
        String s=patient[i].getName();
        System.out.println(i+" "+s);
                         
        }
        System.out.println("Enter Patient's Index:");
            int k=scan.nextInt();
            
            Information(k);
        
    }
    
    static void Information(int i){
        System.out.println(patient[i].getName());
           for(int l=0;l<patient[i].age.size();l++){
               System.out.println(" ");
               System.out.println("Visit number:"+(l+1));
                System.out.println("Age:"+patient[i].age.get(l));
                System.out.println("Heart Rate:"+patient[i].heartrate.get(l));
                System.out.println("Respirotary Rate:"+patient[i].respiratoryrate.get(l));
                System.out.println("Blood Pressure:"+patient[i].bloodpressure.get(l));
                System.out.println("Weight in KGs:"+patient[i].weightkillos.get(l));
                System.out.println("VisitWeight in LBs:"+patient[i].weightpounds.get(l));
                System.out.println(" ");
            }   
        
        
    }
    
    static void updateInformation(){
        int k;
            for(int i=1;i<=index;i++){
            
            
            System.out.println(i+" "+patient[i].getName());
  
            
        }       
            System.out.println("Enter Patient's Index:");
             k=scan.nextInt();
            updatePatient(k);
    }
    
    static void updatePatient(int m){
        System.out.println("Enter the new age of Person:");
        patient[m].setAge(scan.nextInt());
        
        System.out.println("Enter the new Respiratory Rate:");
        patient[m].setRespiratory_rate(scan.nextInt());
        
        System.out.println("Enter the new Blood Pressure:");
        patient[m].setBlood_pressure(scan.nextInt());
        
        System.out.println("Enter the new Heart Rate:");
        patient[m].setHeart_rate(scan.nextInt());
        
        System.out.println("Enter the new Weight in killos:");
        patient[m].setWeight_killos(scan.nextDouble());
        
        System.out.println("Enter the new Weight in pounds:");
        patient[m].setWeight_pounds(scan.nextDouble());
    
        
        if(PatientStatus(m)==false){
            System.out.println("Abnormal");
        }else if(PatientStatus(m)==true){
            System.out.println("Normal");
        }
        
    }
    
    static void Abnormal(){
        int k;
          for(int i=1;i<=index;i++){
            System.out.println(i+" "+patient[i].getName());
            }
          System.out.println("Enter Patient's Index:");
             k=scan.nextInt();
             VitalSigns(k);
          
    }
    
    static void VitalSigns(int o){
        String sign=new String();
        int abc=0;
        System.out.println("Available options are:\n1)Respitory_Rate\n2)Heart_Rate\n3)Weight_in_Kgs\n4)Weight_in_Pounds  ");
        while(abc==0){
        System.out.println("Enter Vital Sign you want to check:");
        sign=scan.next();
        if (sign.equals("Respiratory_Rate")==true) {
            System.out.println("Enter Respiratory Rate to check:");
            int res_rate=scan.nextInt();
            if(Respiratoryrate(patient[o].getAge(),res_rate)==false){
                System.out.println("CONDITION IS ABNORMAl");
                abc++;
            }else if(Respiratoryrate(patient[o].getAge(),res_rate)==true){
                System.out.println("CONDITION IS NORMAL");
                abc++;
            }          
        }else  if (sign.equals("Heart_Rate")==true) {
            System.out.println("Enter Heart Rate to check:");
            int heart_rate=scan.nextInt();
            if(Heartrate(patient[o].getAge(),heart_rate)==false){
                System.out.println("CONDITION IS ABNORMAL");
                abc++;
            }else if(Heartrate(patient[o].getAge(),heart_rate)==true){
                System.out.println("CONDITION IS NORMAL");
                abc++;
            }          
        }else  if (sign.equals("Blood_Pressure")==true) {
            System.out.println("Enter Respiratory Rate to check:");
            int bp=scan.nextInt();
            if(bloodpressure(patient[o].getAge(),bp)==false){
                System.out.println("CONDITION IS ABNORMAL");
                abc++;
            }else if(bloodpressure(patient[o].getAge(),bp)==true){
                System.out.println("CONDITION IS NORMAL");
                abc++;
            }          
        }else  if (sign.equals("Weight_in_Kgs")==true) {
            System.out.println("Enter Weigth in KG to check:");
            int weight=scan.nextInt();
            if(weightkillos(patient[o].getAge(),weight)==false){
                System.out.println("CONDITION IS ABNORMAL");
                abc++;
            }else if(weightkillos(patient[o].getAge(),weight)==true){
                System.out.println("CONDITION IS NORMAL");
                abc++;
            }          
        }else  if (sign.equals("Weight_in_Pounds")==true) {
            System.out.println("Enter Respiratory Rate to check:");
            int weight_lbs=scan.nextInt();
            if(weightpounds(patient[o].getAge(),weight_lbs)==false){
                System.out.println("CONDITION ISABNORMAL");
                abc++;
            }else if(weightpounds(patient[o].getAge(),weight_lbs)==true){
                System.out.println("CONDITION IS NORMAL");
                abc++;
            }          
        }else{
            System.out.println("Enter valid input");
        }
    }
    }
    
    static boolean Respiratoryrate(int age,int rate){
        
            if(age>=0 && age<=1){
                if(rate>=30 && rate<=50){
                    return true;
                }else{
                    return false;
                }
            }else if(age>1 && age<=3){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>3 && age<=5){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>=6 && age<=12){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>12){
                if(rate>=12 && rate<=20){
                    return true;
                }else{
                    return false;
                }
            } 
            return true;
        
    }
    static boolean Heartrate(int age, int heartRate) {

        if (age == 0) {
            if (heartRate >= 120 && heartRate <= 160) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (heartRate >= 80 && heartRate <= 140) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (heartRate >= 80 && heartRate <= 130) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (heartRate >= 20 && heartRate <= 30) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (heartRate >= 70 && heartRate <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 13) {
            if (heartRate >= 55 && heartRate <= 105) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    static boolean bloodpressure(int age, int stolicBP) {

        if (age == 0) {
            if (stolicBP >= 50 && stolicBP <= 70) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (stolicBP >= 70 && stolicBP <= 100) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (stolicBP >= 80 && stolicBP <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (stolicBP >= 80 && stolicBP <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (stolicBP >= 80 && stolicBP <= 120) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 13) {
            if (stolicBP >= 110 && stolicBP <= 120) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    
    static boolean weightkillos(int age, int Weightkgs) {

        if (age == 0) {
            if (Weightkgs >= 2 && Weightkgs <= 3) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (Weightkgs >= 4 && Weightkgs <= 10) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (Weightkgs >= 10 && Weightkgs <= 14) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (Weightkgs >= 14 && Weightkgs <= 18) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (Weightkgs >= 20 && Weightkgs <= 42) {
                return true;
            } else {
                return false;
            }
        } else if (age > 12) {
            if (Weightkgs >= 50) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    
    static boolean weightpounds(int age, int weightPnds) {

        if (age == 0) {
            if (weightPnds >= 4.5 && weightPnds <= 7) {
                return true;
            } else {
                return false;
            }

        } else if (age >= 0 && age <= 1) {
            if (weightPnds >= 9 && weightPnds <= 22) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (weightPnds >= 22 && weightPnds <= 31) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (weightPnds >= 31 && weightPnds <= 40) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (weightPnds >= 41 && weightPnds <= 92) {
                return true;
            } else {
                return false;
            }
        } else if (age > 12) {
            if (weightPnds >= 110) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    
    
    
    
    static boolean PatientStatus(int s){
        
        
       // System.out.println(patient[p].getAge());
        if(patient[s].getAge()==0){
           
            if (patient[s].getRespiratory_rate()>=30 && patient[s].getRespiratory_rate()<=50 && 
                    patient[s].getHeart_rate()>=120 && patient[s].getHeart_rate()<=160 && 
                    patient[s].getBlood_pressure()>=50 && patient[s].getBlood_pressure()<=70 &&
                    patient[s].getWeight_killos()>=2 && patient[s].getWeight_killos()<=3 &&
                    patient[s].getWeight_pounds()>=4.5 && patient[s].getWeight_pounds()<=7) {
                return true;
            }else{
                return false;
            }           
        }else if(patient[s].getAge()==1){
           
            if (patient[s].getRespiratory_rate()>=20 && patient[s].getRespiratory_rate()<=30 && 
                    patient[s].getHeart_rate()>=80 && patient[s].getHeart_rate()<=140 && 
                    patient[s].getBlood_pressure()>=70 && patient[s].getBlood_pressure()<=100 &&
                    patient[s].getWeight_killos()>=4 && patient[s].getWeight_killos()<=10 &&
                    patient[s].getWeight_pounds()>=9 && patient[s].getWeight_pounds()<=22) {
                return true;
            }else{
                return false;
            }           
        }else if(patient[s].getAge()>=1 && patient[s].getAge()<=3){
           
            if (patient[s].getRespiratory_rate()>=20 && patient[s].getRespiratory_rate()<=30 && 
                    patient[s].getHeart_rate()>=80 && patient[s].getHeart_rate()<=130 && 
                    patient[s].getBlood_pressure()>=80 && patient[s].getBlood_pressure()<=110 &&
                    patient[s].getWeight_killos()>=10 && patient[s].getWeight_killos()<=14 &&
                    patient[s].getWeight_pounds()>=22 && patient[s].getWeight_pounds()<=31) {
                return true;
            }else{
                return false;
            }           
            
        }else if(patient[s].getAge()>3 && patient[s].getAge()<=5){
            
            if (patient[s].getRespiratory_rate()>=20 && patient[s].getRespiratory_rate()<=30 && 
                    patient[s].getHeart_rate()>=80 && patient[s].getHeart_rate()<=120 && 
                    patient[s].getBlood_pressure()>=80 && patient[s].getBlood_pressure()<=110 &&
                    patient[s].getWeight_killos()>=14 && patient[s].getWeight_killos()<=18 &&
                    patient[s].getWeight_pounds()>=31 && patient[s].getWeight_pounds()<=40) {
                return true;
            }else{
                return false;
            }           
            
        }else if(patient[s].getAge()>=6 && patient[s].getAge()<=12){
           
            if (patient[s].getRespiratory_rate()>=20 && patient[s].getRespiratory_rate()<=30 && 
                    patient[s].getHeart_rate()>=70 && patient[s].getHeart_rate()<=110 && 
                    patient[s].getBlood_pressure()>=80 && patient[s].getBlood_pressure()<=120 &&
                    patient[s].getWeight_killos()>=20 && patient[s].getWeight_killos()<=42 &&
                    patient[s].getWeight_pounds()>=41 && patient[s].getWeight_pounds()<=92) {
                return true;
                
            }else{
                return false;
            }           
            
        }else if(patient[s].getAge()>12){
            
            
            if (patient[s].getRespiratory_rate()>=12 && patient[s].getRespiratory_rate()<=20 && 
                    patient[s].getHeart_rate()>=55 && patient[s].getHeart_rate()<=105 && 
                    patient[s].getBlood_pressure()>=110 && patient[s].getBlood_pressure()<=120 &&
                    patient[s].getWeight_killos()>=50 &&
                    patient[s].getWeight_pounds()>=110 ) {
                return true;
            }else{
                return false;
            }           
            
        }
        return true;
    }
    
    
}