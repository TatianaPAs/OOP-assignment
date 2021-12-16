/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveguitars.assignemnt;
import GUI.Dashboard;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class Shop {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Guitar> guitars;
    private ArrayList<Customer> customers;
    private ArrayList<Employee> employees;
    private ArrayList<RentalRecord> rentals;
    //set date format to use for 2 funcitons
    DateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    Calendar cal=Calendar.getInstance();
//shop constructor
    public Shop(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
         guitars=new ArrayList<Guitar>();
         customers=new ArrayList<Customer>();
         employees=new ArrayList<Employee>();
         rentals=new ArrayList<RentalRecord>();

    }
 public  Guitar searchGuitarById(String id)
 {
      Guitar  found=null;
        for(Guitar g: getGuitars())
        {
          if (g.getSerialNumber().equals(id))  
          {
              found=g;
              break;
          }
        }return found;
 }
 public Customer searchCustomerById(String id)
 {
     Customer found=null;
     for(Customer c:getCustomers())
     {
         if(c.getId().equals(id))
         {
             found=c;
             break;
         }
     }return found;
 }
 
 public RentalRecord searchRecord(String id)
 {
     RentalRecord found=null;
     for(RentalRecord r:getRentals())
     {
         if(r.getCustomer().getId().equals(id))
         {
             found=r;
             break;
         }
     }return found;
 }
 
 public RentalRecord searchRecordbyDate(Date dateStar, Date dateEnd)
 {
     RentalRecord found=null;
     for(RentalRecord r:getRentals())
     {
         if(!r.getRentDate().after(dateEnd)&&r.getRentDate().after(dateStar))
         {
             found=r;
             break;
         }
     }return found;
 }

  public Employee searchEmployeeById(String id)
 {
     Employee found=null;
     for(Employee e:getEmployees())
     {
         if(e.getId().equals(id))
         {
             found=e;
             break;
         }
     }return found;
 }
 
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Guitar> getGuitars() {
        return guitars;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<RentalRecord> getRentals() {
        return rentals;
    }

    public String returnGuitar(String guitarID, Date returnDate)
            
   {
        Object fee = null;
       String message="Sorry, guitar is not in the systsem";
            for (RentalRecord record: rentals)
      {
          if (record.getGuitar().getSerialNumber().equals(guitarID)&& record.getReturnDate()==null)
              //check if return date past rent date
          {if (record.getRentDate().compareTo(returnDate)>0)
          {
              message= "Return date can not be before rent date";
              break;
          }
        //if guitar being returned after due date, calculating fees
                if(record.getReturnDueDate().compareTo(returnDate)<0)
                      {
                            cal.setTime(returnDate);
                            int year = cal.get(Calendar.YEAR);
                            int month = cal.get(Calendar.MONTH) + 1;
                            int date = cal.get(Calendar.DATE);
                            LocalDate return1 = LocalDate.of(year, month, date);
                          long days=calculateDays( return1,record.getReturnDueDate());
                          fee=record.getGuitar().getRentChanrgePerDay()*days;
                          double total=Double.parseDouble(new DecimalFormat("##.##").format(fee));
                          //set guitar returned and display message with the fees to pay
                          record.setReturnDate(returnDate);
                          record.getGuitar().returned();
                          if (total==0)
                          {
                              message="Guitar returned";
                          }else
                          {
                          message="Customer should pay outstanding fees "+total ;                          
                          break;
                      }
                      }
                      //set guitar returned
               record.setReturnDate(returnDate);
               record.getGuitar().returned();
               message= "Guitar returned";
               break;
      }
      }return message;
   }
   

      
    
   public String borrowGuitar(String customerID,String guitarID, Date returnDueDate)
   {
       //search if guitar in the system first
       Guitar g=searchGuitarById(guitarID);
       if (g==null)
       {
           return "No guitar found";
           //check guitar status
       }else if (!g.getStatus().equals("On the shop"))
           {
               return "Guitar is not available at the moment";
           }else
       {
           //check if customer in the system
           Customer c=searchCustomerById(customerID);
       if(c==null)
       {
           return "No customer found";
       }
       // Checking if Return due date past rent date before borrowing
        LocalDate rentDate=LocalDate.now();
        long days=calculateDays(returnDueDate,rentDate);
        if (days<0)
        {
            return "Return date should be in the future";
        }
               
 
           else 
           {
           //cretae new rental record
          RentalRecord record= new RentalRecord(g, c, returnDueDate);
          rentals.add(record);
          record.getGuitar().rented();
          return "Guitar rented sucessfully"; 
       }
       }  
   }
       
   
   public int calculateYears(LocalDate one, Date two)
{
    // put separatelly calculator for the age
        cal.setTime(two);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        LocalDate birth = LocalDate.of(year, month, date);
        int years=Period.between(birth,one).getYears();
        return years;
} 
   
   
     public long calculateDays(LocalDate today, Date two)
{
    // put separatelly calculator for days between dates from past
        cal.setTime(two);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        LocalDate three = LocalDate.of(year, month, date);
        long days=ChronoUnit.DAYS.between(three,today);
        return days;
} 

         public long calculateDays(Date one, LocalDate two)
{
    // put separatelly calculator for days between dates in the future
        cal.setTime(one);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        LocalDate three = LocalDate.of(year, month, date);
        long days=ChronoUnit.DAYS.between(two,three);
        return days;
} 

  public long checkID(Date expiry)
  {
    LocalDate today=LocalDate.now();
    long days=calculateDays( today, expiry );
    return days;
  }
}