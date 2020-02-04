/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.p.pkg2;

import com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.parser.AttributeList;

/**
 *
 * @author Abhi
 */
public class patient_details {
    
    List<Integer> Age= new ArrayList<>();
    List<Integer> Respiratory_Rate= new ArrayList<>();
    List<Integer> Heart_Rate= new ArrayList<>();
    List<Integer> Blood_Pressure= new ArrayList<>();
    List<Integer> Weight_Killos= new ArrayList<>();
    List<Integer> Weight_Pounds= new ArrayList<>();
    
    

    public List<Integer> getAge() {
        return Age;
    }

    public void setAge(List<Integer> Age) {
        this.Age = Age;
    }

    public List<Integer> getRespiratory_Rate() {
        return Respiratory_Rate;
    }

    public void setRespiratory_Rate(List<Integer> Respiratory_Rate) {
        this.Respiratory_Rate = Respiratory_Rate;
    }

    public List<Integer> getHeart_Rate() {
        return Heart_Rate;
    }

    public void setHeart_Rate(List<Integer> Heart_Rate) {
        this.Heart_Rate = Heart_Rate;
    }

    public List<Integer> getBlood_Pressure() {
        return Blood_Pressure;
    }

    public void setBlood_Pressure(List<Integer> Blood_Pressure) {
        this.Blood_Pressure = Blood_Pressure;
    }

    public List<Integer> getWeight_Killos() {
        return Weight_Killos;
    }

    public void setWeight_Killos(List<Integer> Weight_Killos) {
        this.Weight_Killos = Weight_Killos;
    }

    public List<Integer> getWeight_Pounds() {
        return Weight_Pounds;
    }

    public void setWeight_Pounds(List<Integer> Weight_Pounds) {
        this.Weight_Pounds = Weight_Pounds;
    }
    
    
    
    
}