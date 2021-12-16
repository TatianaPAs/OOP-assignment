/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveguitars.assignemnt;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class RentalRecord {
    private Guitar guitar;
    private Customer customer;   
    private Employee employee;
    private Date rentDate;
    private Date returnDueDate;
    private Date returnDate;
//contructor for rentalRecord
    public RentalRecord(Guitar guitar, Customer customer, Date returnDueDate) {
        this.guitar = guitar;
        this.customer = customer;
        this.rentDate = new Date();
        this.returnDueDate = returnDueDate;
        this.returnDate = null;
    }
    
    //full constructor for testing purpose.Can create old rental records, can assign salesman for the records.
    public RentalRecord(Guitar guitar, Customer customer, Date returnDueDate, Date rentDate, Employee employee, Date returnDate)
    {
        this.guitar = guitar;
        this.customer = customer;
        this.employee=employee;
        this.rentDate = rentDate;
        this.returnDueDate = returnDueDate;
        this.returnDate = returnDate;
    }

    // this date can be set only during guitar renting process
    public Date getRentDate() {
        return rentDate;
    }

    // this date can be set only during guitar renting process
    public Date getReturnDueDate() {
        return returnDueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        if (returnDate.after(rentDate)) {
         this.returnDate = returnDate;}  
        else{
            System.out.println("message");
        }
    }

    public Guitar getGuitar() {
        return guitar;
    }

    public Customer getCustomer() {
        return customer;
    }
// can be used to track who was logged in the system while renting/returnign guitars
    public Employee getEmployee() {
        return employee;
    }
 
    
}
