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
public class Employee extends Person {
    private int phoneExtensionNumber;
    private String username;
    private String password;
    private String role;
// constructor for test purpose
    public Employee(String name) {
        super(name);
    }
// constructor for Employee object
    public Employee(int phoneExtensionNumber, String username, String password, String role, String id, String name, Date dateOfBirth, String address, String phoneNumber) {
        super(id, name, dateOfBirth, address, phoneNumber);
        this.phoneExtensionNumber = phoneExtensionNumber;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int getPhoneExtensionNumber() {
        return phoneExtensionNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPhoneExtensionNumber(int phoneExtensionNumber) {
        this.phoneExtensionNumber = phoneExtensionNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
  
    public Guitar searchGuitar(String ID, Shop name)
{
     Guitar found=name.searchGuitarById(ID);
     return found;
}
    public Customer searchCustomer(String ID, Shop name)
{
     Customer found=name.searchCustomerById(ID);
     return found;
}
    public Employee searchEmployee(String ID, Shop name)
{
     Employee found=name.searchEmployeeById(ID);
     return found;
}
    //employee adds guitar
   public String addGuitar(Guitar g, Shop name)
        {
           Guitar gu=name.searchGuitarById(g.getSerialNumber());
           if( gu==null)
           {
               name.getGuitars().add(g);
               return "Guitar added succesfully";
           }else
           {
               return "sorry, Guitar with this ID already in the system";
           }
        } 
 //employee adds customer  
 public String addCustomer(Customer c,Shop name)
 {
     Customer cu=name.searchCustomerById(c.getId());
             {
                 if (cu==null)
                 {
                     name.getCustomers().add(c);
                     return "Customer added sucessfully";
                 }else
                 {
                     return "Sorry, Costomer with this ID already in the system";
                 }
             }
 }
 //admin staff adds employee
 public String addEmployee(Employee e,Shop name)
 {
     Employee em=name.searchEmployeeById(e.getId());
             {
                 if (em==null)
                 {
                     name.getEmployees().add(e);
                     return "Employee added sucessfully";
                 }else
                 {
                     return "Sorry, Employee with this ID already in the system";
                 }
             }
 }
 //for testing purpose add rental records from past
 public void addRentalRecord(RentalRecord record, Shop name)
 {   
     name.getRentals().add(record);
 }
 //to send guitar under maintenace
 public void repairGuitar(Guitar g, Shop name)
 {
     g.maintenance();
 }
 //employee rents guitar
 public String rentGuitar(String customerID,String guitarID, Shop name, Date returnDueDate) 
 {
    return name.borrowGuitar(customerID, guitarID, returnDueDate);
 }
 
 // employee returns guitar
 public String returnGuitar(String guitarID, Date returnDate, Shop name)
 {
    String message=name.returnGuitar(guitarID, returnDate);
    return message;
 }
 
}
