/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveguitars.assignemnt;

import java.util.Date;

/**
 *
 * @author Tatiana
 */
public class Customer extends Person{
    private String licenseNumber;
    private int age;
    private Date licenseExpiryDate;
    private char gender;

    public Customer(String licenseNumber, int age, Date licenseExpiryDate, char gender,
            String id, String name, Date dateOfBirth, String address, String phoneNumber) {
        super(id, name, dateOfBirth, address, phoneNumber);
        this.licenseNumber = licenseNumber;
        this.age = age;
        this.licenseExpiryDate = licenseExpiryDate;
        this.gender=gender;
    }
    public char getGender() {
        return gender;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Date getLicenseExpiryDate() {
        return licenseExpiryDate;
    }
    public void setLicenseExpiryDate(Date licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
   
    
}
