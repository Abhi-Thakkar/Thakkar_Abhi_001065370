/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.p.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhi
 */
public class information {
    
    List<Integer> age = new ArrayList<Integer>();
    List<Integer> respiratoryrate = new ArrayList<Integer>();
    List<Integer> bloodpressure = new ArrayList<Integer>();
    List<Integer> heartrate = new ArrayList<Integer>();
    List<Double> weightkillos = new ArrayList<Double>();
    List<Double> weightpounds = new ArrayList<Double>();
    

    
    
    
    
    
    
    String name;
    int Age;
    int respiratory_rate;
    int blood_pressure;
    int heart_rate;
    double weight_killos;
    double weight_pounds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        age.add(Age);
        this.Age = Age;
    }

    public int getRespiratory_rate() {
        return respiratory_rate;
    }

    public void setRespiratory_rate(int respiratory_rate) {
        respiratoryrate.add(respiratory_rate);
        this.respiratory_rate = respiratory_rate;
    }

    public int getBlood_pressure() {
        
        return blood_pressure;
    }

    public void setBlood_pressure(int blood_pressure) {
        bloodpressure.add(blood_pressure);
        this.blood_pressure = blood_pressure;
    }

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        heartrate.add(heart_rate);
        this.heart_rate = heart_rate;
    }

    public double getWeight_killos() {
        return weight_killos;
    }

    public void setWeight_killos(double weight_killos) {
        weightkillos.add(weight_killos);
        this.weight_killos = weight_killos;
    }

    public double getWeight_pounds() {
        return weight_pounds;
    }

    public void setWeight_pounds(double weight_pounds) {
        weightpounds.add(weight_pounds);
        this.weight_pounds = weight_pounds;
    }

    
}
