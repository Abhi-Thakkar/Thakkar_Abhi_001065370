/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonProfile;

/**
 *
 * @author Abhi
 */
public class PersonDetails {
    String firstname;
    String Lastname;
    String streetaddress;
    String Dateofbirth;

    Address workaddress=new Address();
    Address homeaddress=new Address();
    Address localaddress=new Address();

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

    public Address getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(Address homeaddress) {
        this.homeaddress = homeaddress;
    }

    public Address getLocaladdress() {
        return localaddress;
    }

    public void setLocaladdress(Address localaddress) {
        this.localaddress = localaddress;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
    }
    
    
}
