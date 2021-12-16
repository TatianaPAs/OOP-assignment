package loveguitars.assignemnt;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatiana
 */
public class Person {
    protected String id;
    protected String name;
    protected Date dateOfBirth;
    protected String address;
    protected String phoneNumber;
// constructor for testing purpose
    public Person(String name) {
        this.name = name;
    }
// constructor to use with employee and customer
    public Person(String id, String name, Date dateOfBirth, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber=phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 
}
