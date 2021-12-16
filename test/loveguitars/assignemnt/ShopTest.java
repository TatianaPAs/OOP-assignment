/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveguitars.assignemnt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tatiana
 */
public class ShopTest {
    
    public ShopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws ParseException {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of searchGuitarById method, of class Shop.
     */
    @Test
    public void testSearchGuitarById() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        staff.addGuitar(g1,shop1);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("searchGuitarById1");
        String id = g1.getSerialNumber();
        Shop instance = shop1;
        Guitar expResult = g1;
        Guitar result = instance.searchGuitarById(id);
        assertEquals(expResult, result);
 
    }
    
      /**
     * Test of searchGuitarById method, of class Shop.
     */
    @Test
    public void testSearchGuitarById2() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        staff.addGuitar(g1,shop1);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("searchGuitarById2");
        String id = "101010";
        Shop instance = shop1;
        Guitar expResult = g1;
        Guitar result = instance.searchGuitarById(id);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of searchCustomerById1 method, of class Shop.
     */
    @Test
    public void test2SearchCustomerById1() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        staff.addCustomer(s,shop1);
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("searchCustomerById1");
        String id = s.getId();
        Shop instance = shop1;
        Customer expResult = s;
        Customer result = instance.searchCustomerById(id);
        assertEquals(expResult, result);

    }
    
     @Test
    public void test3SearchCustomerById2() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        staff.addCustomer(s,shop1);
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        System.out.println("searchCustomerById2");
        String id = "1000";
        Shop instance = shop1;
        Customer expResult = s;
        Customer result = instance.searchCustomerById(id);
        assertNotEquals(expResult, result);

    }

    /**
     * Test of searchRecord1 method, of class Shop.
     */
    @Test
    public void testSearchRecord1() throws ParseException {
          Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        staff.addRentalRecord(r1, shop1);
        System.out.println("searchRecord1");
        String id = g1.getSerialNumber();
        Shop instance = shop1;
        RentalRecord expResult =r1;
        RentalRecord result = instance.searchRecord(id);
        assertEquals(expResult, r1);

    }
     @Test
    public void testSearchRecord2() throws ParseException {
          Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        staff.addRentalRecord(r1, shop1);
        System.out.println("searchRecord2");
        String id = "1";
        Shop instance = shop1;
        RentalRecord expResult =r1;
        RentalRecord result = instance.searchRecord(id);
         assertNull(result);

    }

    /**
     * Test of searchRecordbyDate method, of class Shop.
     */
    @Test
    public void testSearchRecordbyDate1() throws ParseException {
          Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        staff.addCustomer(s,shop1);
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        staff.addRentalRecord(r1, shop1);
        System.out.println("searchRecordbyDate1");
        Date dateStar = dateFormat.parse("03/09/2021");
        Date dateEnd = dateFormat.parse("04/09/2021");
        Shop instance = shop1;
        RentalRecord expResult = r1;
        RentalRecord result = instance.searchRecordbyDate(dateStar, dateEnd);
        assertEquals(expResult, r1);
 
    }
    @Test
     public void testSearchRecordbyDate2() throws ParseException {
          Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        staff.addCustomer(s,shop1);
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        staff.addRentalRecord(r1, shop1);
        System.out.println("searchRecordbyDate2");
        Date dateStar = dateFormat.parse("03/08/2021");
        Date dateEnd = dateFormat.parse("04/08/2021");
        Shop instance = shop1;
        RentalRecord expResult = r1;
        RentalRecord result = instance.searchRecordbyDate(dateStar, dateEnd);
         assertNull(result);
 
    }

    /**
     * Test of searchEmployeeById method, of class Shop.
     */
    @Test
    public void testSearchEmployeeById1() throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee admin=new Employee("Admin");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        admin.addEmployee(m, shop1);
        System.out.println("searchEmployeeById1");
        String id = "102";
        Shop instance = shop1;
        Employee expResult = m;
        Employee result = instance.searchEmployeeById(id);
        assertEquals(expResult, result);
   
    }
     @Test
    public void testSearchEmployeeById2() throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee admin=new Employee("Admin");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        admin.addEmployee(m, shop1);
        System.out.println("searchEmployeeById2");
        String id = m.getId();
        Shop instance = shop1;
        Employee expResult = m;
        Employee result = instance.searchEmployeeById(id);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setName method, of class Shop.
     */
    @Test
    public void testSetName()  {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        System.out.println("setName");
        String name = "Office";
        Shop instance = shop1;
        instance.setName(name);

    }

    /**
     * Test of setAddress method, of class Shop.
     */
    @Test
    public void testSetAddress() {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        System.out.println("setAddress");
        String address = "5 Papatoetoe";
        Shop instance = shop1;
        instance.setAddress(address);

    }

    /**
     * Test of setPhone method, of class Shop.
     */
    @Test
    public void testSetPhone(){
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        System.out.println("setPhone");
        String phone = "0222222";
        Shop instance = shop1;
        instance.setPhone(phone);
  
    }

    /**
     * Test of getName method, of class Shop.
     */
    @Test
    public void testGetName()  {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        System.out.println("getName");
        Shop instance = shop1;
        String expResult = "Main";
        String result = instance.getName();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of getAddress method, of class Shop.
     */
    @Test
    public void testGetAddress1(){
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        System.out.println("getAddress1");
        Shop instance = shop1;
        String expResult = "20 Manukau road";
        String result = instance.getAddress();
        assertEquals(expResult, result);
   
    }
    @Test
    public void testGetAddress2(){
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        System.out.println("getAddress2");
        Shop instance = shop1;
        String expResult = "1 Manukau road";
        String result = instance.getAddress();
        assertNotEquals(expResult, result);
   
    }

    /**
     * Test of getPhone method, of class Shop.
     */
    @Test
    public void testGetPhone1() {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        System.out.println("getPhone1");
        Shop instance = shop1;
        String expResult = "0911111";
        String result = instance.getPhone();
        assertEquals(expResult, result);
  
    }
    @Test
    public void testGetPhone2() {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        System.out.println("getPhone2");
        Shop instance = shop1;
        String expResult = shop1.getPhone();
        String result = instance.getPhone();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of getGuitars method, of class Shop.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetGuitars1() throws ParseException {
          Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        m.addGuitar(g1, shop1);
        System.out.println("getGuitars1");
        Shop instance = shop1;
        ArrayList<Guitar> expResult = new ArrayList();
        expResult.add(g1);
        ArrayList<Guitar> result = instance.getGuitars();
        assertEquals(expResult, result);

    }
    
      @Test
    public void testGetGuitars2() throws ParseException {
          Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Guitar g2=new Guitar("101020", 2021, 17.50, "Blue", 104.10, 38, 51.3, "510e", Build.GIBSON, GuitarType.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        m.addGuitar(g1, shop1); m.addGuitar(g2, shop1);
        System.out.println("getGuitars2");
        Shop instance = shop1;
        ArrayList<Guitar> expResult = new ArrayList();
        expResult.add(g1);
        ArrayList<Guitar> result = instance.getGuitars();
        assertNotEquals(expResult, result);

    }

    /**
     * Test of getCustomers method, of class Shop.
     */
    @Test
    public void testGetCustomers1() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        m.addCustomer(s, shop1);
        System.out.println("getCustomers1");
        Shop instance = shop1;
        ArrayList<Customer> expResult = new ArrayList();
        expResult.add(s);
        ArrayList<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetCustomers2() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Customer w=new Customer("WER456", 36, dateFormat.parse("31/12/2023"), 'F', "1002", "Wendy Colins", dateFormat.parse("15/07/1985"), "1 Alexandra place", "0833333");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        System.out.println("getCustomers2");
        Shop instance = shop1;
        m.addCustomer(s, shop1);
        m.addCustomer(w, shop1);
        ArrayList<Customer> expResult = new ArrayList();
        expResult.add(s);
        ArrayList<Customer> result = instance.getCustomers();
        assertNotEquals(expResult, result);

    }

    /**
     * Test of getEmployees method, of class Shop.
     */
    @Test
    public void testGetEmployees() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee admin= new Employee("Admin");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        Employee j=new Employee(111, "JJonston", "Password01", "staff", "101", "Jenny Johnston", dateFormat.parse("15/04/1980"), "20 Manukau road", "09245612");
        admin.addEmployee(m, shop1); admin.addEmployee(j, shop1);
        System.out.println("getEmployees");
        Shop instance = shop1;
        ArrayList<Employee> expResult = new ArrayList();
        expResult.add(m); expResult.add(j);
        ArrayList<Employee> result = instance.getEmployees();
        assertEquals(expResult, result);

    }

    /**
     * Test of getRentals method, of class Shop.
     */
    @Test
    public void testGetRentals1() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee admin= new Employee("Admin");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        admin.addRentalRecord(r1, shop1);
        System.out.println("getRentals1");
        Shop instance = shop1;
        ArrayList<RentalRecord> expResult = new ArrayList();
        expResult.add(r1);expResult.add(null);
        ArrayList<RentalRecord> result = instance.getRentals();
        assertNotEquals(expResult, result);

    }
      @Test
    public void testGetRentals2() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee admin= new Employee("Admin");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, dateFormat.parse("04/09/2021"));
        admin.addRentalRecord(r1, shop1);
        System.out.println("getRentals2");
        Shop instance = shop1;
        ArrayList<RentalRecord> expResult = new ArrayList();
        expResult.add(r1);
        ArrayList<RentalRecord> result = instance.getRentals();
        assertEquals(expResult, result);

    }

    /**
     * Test of returnGuitar method, of class Shop.
     */
    @Test
    public void testReturnGuitar1() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r2=new RentalRecord(g1, s, dateFormat.parse("30/08/2021"), dateFormat.parse("10/08/2021"), m, null);
        m.addGuitar(g1, shop1);
        m.addCustomer(s, shop1);
        m.addRentalRecord(r2, shop1);
        System.out.println("returnGuitar1");
        String guitarID = g1.getSerialNumber();
        Date returnDate = dateFormat.parse("30/08/2021");
        Shop instance = shop1;
        String expResult = "Guitar returned";
        String result = instance.returnGuitar(guitarID, returnDate);
        assertEquals(expResult, result);

    }
      @Test
    public void testReturnGuitar2() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r=new RentalRecord(g1, s, dateFormat.parse("14/09/2021"));
        m.addGuitar(g1, shop1);
        m.addCustomer(s, shop1);
        m.addRentalRecord(r, shop1);
        System.out.println("returnGuitar2");
        String guitarID = "100";
        Date returnDate = dateFormat.parse("13/09/2021");
        Shop instance = shop1;
        String expResult = "Sorry, guitar is not in the systsem";
        String result = instance.returnGuitar(guitarID, returnDate);
        assertEquals(expResult, result);

    }
      @Test
    public void testReturnGuitar3() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        RentalRecord r=new RentalRecord(g1, s, dateFormat.parse("14/09/2021"));
        m.addGuitar(g1, shop1);
        m.addCustomer(s, shop1);
        m.addRentalRecord(r, shop1);
        System.out.println("returnGuitar3");
        String guitarID = g1.getSerialNumber();
        Date returnDate = dateFormat.parse("13/08/2021");
        Shop instance = shop1;
        String expResult = "Return date can not be before rent date";
        String result = instance.returnGuitar(guitarID, returnDate);
        assertEquals(expResult, result);

    }
    /**
     * Test of borrowGuitar method, of class Shop.
     */
    @Test
    public void testBorrowGuitar1() throws ParseException, Exception {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        m.addGuitar(g1, shop1);
        m.addCustomer(s, shop1);
        System.out.println("borrowGuitar1");
        String customerID = s.getId();
        String guitarID = g1.getSerialNumber();
        Date returnDueDate = dateFormat.parse("04/10/2021");
        Shop instance = shop1;
        String expResult = "Guitar rented sucessfully";
        String result = instance.borrowGuitar(customerID, guitarID, returnDueDate);
        assertEquals(expResult, result);

    }
      @Test
    public void testBorrowGuitar2() throws ParseException, Exception {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        m.addGuitar(g1, shop1);
        m.addCustomer(s, shop1);
        System.out.println("borrowGuitar2");
        String customerID = "1";
        String guitarID = g1.getSerialNumber();
        Date returnDueDate = dateFormat.parse("04/10/2021");
        Shop instance = shop1;
        String expResult = "No customer found";
        String result = instance.borrowGuitar(customerID, guitarID, returnDueDate);
        assertEquals(expResult, result);

    }
      @Test
    public void testBorrowGuitar3() throws ParseException, Exception {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        m.addGuitar(g1, shop1);
        m.addCustomer(s, shop1);
        System.out.println("borrowGuitar3");
        String customerID = s.getId();
        String guitarID = "1";
        Date returnDueDate = dateFormat.parse("04/10/2021");
        Shop instance = shop1;
        String expResult = "No guitar found";
        String result = instance.borrowGuitar(customerID, guitarID, returnDueDate);
        assertEquals(expResult, result);

    }
       @Test
    public void testBorrowGuitar4() throws ParseException, Exception {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Employee m=new Employee(122, "MMiles", "Miles03", "staff", "102", "Michael Miles", dateFormat.parse("20/02/1984"), "5 St.George street", "02123123");
        Guitar g1=new Guitar("101010", 2020, 15.50, "Black", 96.50, 36.80, 48.50, "516ce", Build.FENDER, GuitarType.ELECTRIC, Wood.MAPLE, Wood.MAPLE);
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        RentalRecord r1=new RentalRecord(g1, s, dateFormat.parse("04/09/2021"), dateFormat.parse("03/09/2021"), m, null);
        g1.rented();
        m.addGuitar(g1, shop1);
        m.addCustomer(s, shop1);
        m.addRentalRecord(r1, shop1);
        System.out.println("borrowGuitar4");
        String customerID = s.getId();
        String guitarID = g1.getSerialNumber();
        Date returnDueDate = dateFormat.parse("04/10/2021");
        Shop instance = shop1;
        String expResult = "Guitar is not available at the moment";
        String result = instance.borrowGuitar(customerID, guitarID, returnDueDate);
        assertEquals(expResult, result);

    }

    /**
     * Test of calculateYears method, of class Shop.
     */
    @Test
    public void testCalculateYears1() throws ParseException {
        Calendar cal=Calendar.getInstance();
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        System.out.println("calculateYears1");
        LocalDate one = LocalDate.of(2021,9,8);
        Date two = s.getDateOfBirth();
        Shop instance = shop1;
        int expResult = 35;
        int result = instance.calculateYears(one, two);
        assertEquals(expResult, result);
   
    }
    
      @Test
    public void testCalculateYears2() throws ParseException {
        Calendar cal=Calendar.getInstance();
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Customer s=new Customer("RT123", 35, dateFormat.parse("15/04/2023"), 'M', "1001", "John Smith", dateFormat.parse("15/01/2000"), "8 Hill road", "0999999");
        System.out.println("calculateYears2");
        LocalDate one = LocalDate.of(2021,9,8);
        Date two = s.getDateOfBirth();
        Shop instance = shop1;
        int expResult = 21;
        int result = instance.calculateYears(one, two);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of calculateDays method, of class Shop.
     */
    @Test
    public void testCalculateDays1_LocalDate_Date() throws ParseException {
        Calendar cal=Calendar.getInstance();
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("calculateDays1");
        LocalDate one = LocalDate.of(2021,9,8);
        Date two = dateFormat.parse("01/09/2021");
        Shop instance = shop1;
        long expResult = 7;
        long result = instance.calculateDays(one, two);
        assertEquals(expResult, result);
   
    }
     @Test
    public void testCalculateDays2_LocalDate_Date() throws ParseException {
        Calendar cal=Calendar.getInstance();
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("calculateDays2");
        LocalDate one = LocalDate.of(2021,10,10);
        Date two = dateFormat.parse("01/09/2021");
        Shop instance = shop1;
        long expResult = 39;
        long result = instance.calculateDays(one, two);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of calculateDays method, of class Shop.
     */
    @Test
    public void testCalculateDays_Date_LocalDate() throws ParseException {
        Calendar cal=Calendar.getInstance();
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("calculateDays");
        Date one = dateFormat.parse("10/09/2021");
        LocalDate two = LocalDate.of(2021,9,8);
        Shop instance = shop1;
        long expResult =2;
        long result = instance.calculateDays(one, two);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of checkID method, of class Shop.
     */
    @Test
    public void testCheckID() throws ParseException {
        Shop shop1= new Shop("Main", "20 Manukau road", "0911111");
        Employee staff= new Employee("Staff");
        Date d=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Customer s=new Customer("RT123", 35, dateFormat.parse("31/12/2021"), 'M', "1001", "John Smith", dateFormat.parse("30/12/1985"), "8 Hill road", "0999999");
        staff.addCustomer(s,shop1);
        System.out.println("checkID");
        LocalDate today=LocalDate.of(2021,9,8);
        Date expiry =s.getLicenseExpiryDate();
        Shop instance = shop1;
        long result = instance.checkID(expiry);
        assertFalse(result>0);
        
    }
    
}
