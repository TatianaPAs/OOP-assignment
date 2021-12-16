/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveguitars.assignemnt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tatiana
 */
public class RentalRecordTest {
    
    public RentalRecordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRentDate method, of class RentalRecord.
     */
    @Test
    public void testGetRentDate() throws ParseException 
    {
       
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getRentDate1");
        RentalRecord instance = r1;
        Date expResult = dateFormat.parse("03/09/2021");
        Date result = instance.getRentDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetRentDate2() throws ParseException 
    {
       
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getRentDate2");
        RentalRecord instance = r1;
        Date expResult = dateFormat.parse("10/09/2021");
        Date result = instance.getRentDate();
        assertNotEquals(expResult, result);
    }


    /**
     * Test of getReturnDueDate method, of class RentalRecord.
     */
    @Test
    public void testGetReturnDueDate() throws ParseException {
         Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getReturnDueDate");
        RentalRecord instance = r1;
        Date expResult = dateFormat.parse("04/09/2021");
        Date result = instance.getReturnDueDate();
        assertEquals(expResult, result);
      
    }
    @Test
    public void testGetReturnDueDate2() throws ParseException {
         Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getReturnDueDate2");
        RentalRecord instance = r1;
        Date expResult = null;
        Date result = instance.getReturnDueDate();
        assertNotEquals(expResult, result);
      
    }

    /**
     * Test of getReturnDate method, of class RentalRecord.
     */
    @Test
    public void testGetReturnDate() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getReturnDate");
        RentalRecord instance = r1;
        Date expResult = dateFormat.parse("04/09/2021");
        Date result = instance.getReturnDate();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testGetReturnDate2() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getReturnDate2");
        RentalRecord instance = r1;
        Date expResult = dateFormat.parse("10/09/2021");
        Date result = instance.getReturnDate();
        assertNotSame(expResult, result);
      
    }

    /**
     * Test of setReturnDate method, of class RentalRecord.
     */
    @Test
    public void testSetReturnDate() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("setReturnDate");
        Date returnDate = dateFormat.parse("05/09/2021");
        RentalRecord instance = r1;
        instance.setReturnDate(returnDate);
     
    }
    
      @Test
    public void testSetReturnDate2() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("setReturnDate2");
        Date returnDate = dateFormat.parse("01/01/2021");
        RentalRecord instance = r1;
        instance.setReturnDate(returnDate);
        Date result=instance.getReturnDate();
        Date expResult = dateFormat.parse("04/09/2021");
        assertEquals(expResult, result);
     
    }
    
       @Test
    public void testSetReturnDate3() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("setReturnDate3");
        Date returnDate = dateFormat.parse("02/10/2021");
        RentalRecord instance = r1;
        instance.setReturnDate(returnDate);
        Date result=instance.getReturnDate();
        Date expResult = dateFormat.parse("04/09/2021");
        assertNotEquals(expResult, result);
     
    }

    /**
     * Test of getGuitar method, of class RentalRecord.
     */
    @Test
    public void testGetGuitar() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getGuitar");
        RentalRecord instance = r1;
        Guitar expResult = g1;
        Guitar result = instance.getGuitar();
        assertEquals(expResult, result);
    
    }
    
     @Test
    public void testGetGuitar2() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Guitar g2=new Guitar("101020", 2021, 17.50, "Blue", 104.10, 38, 51.3, "510e", Build.GIBSON, GuitarType.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getGuitar2");
        RentalRecord instance = r1;
        Guitar expResult = g2;
        Guitar result = instance.getGuitar();
        assertNotEquals(expResult, result);
    
    }

    /**
     * Test of getCustomer method, of class RentalRecord.
     */
    @Test
    public void testGetCustomer() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getCustomer");
        RentalRecord instance = r1;
        Customer expResult = s;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);

    }
    
     @Test
    public void testGetCustomer2() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Customer w=new Customer("WER456", 36, dateFormat.parse("31/12/2023"), 'F', "1002", "Wendy Colins", dateFormat.parse("15/07/1985"), "1 Alexandra place", "0833333");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getCustomer2");
        RentalRecord instance = r1;
        Customer expResult = w;
        Customer result = instance.getCustomer();
        assertNotSame(expResult, result);

    }

    /**
     * Test of getEmployee method, of class RentalRecord.
     */
    @Test
    public void testGetEmployee() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getEmployee");
        RentalRecord instance = r1;
        Employee expResult = m;
        Employee result = instance.getEmployee();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetEmployee2() throws ParseException {
           Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("getEmployee2");
        RentalRecord instance = r1;
        Employee expResult = null;
        Employee result = instance.getEmployee();
        assertNotEquals(expResult, result);

    }
    
}
