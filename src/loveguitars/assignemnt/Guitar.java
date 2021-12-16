/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveguitars.assignemnt;

import java.util.Date;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Tatiana
 */
public class Guitar extends GuitarModels{
    private String serialNumber;
    private int yearOfManufacture;
    private double rentChanrgePerDay;
    private String colour;
    private double lenght;
    private double width;
    private double height;
    private String status;
    private String dateItRents;
    private String dateDueBack;
    private GuitarModels model;
// contructor for add guitar object
    public Guitar(String serialNumber, int yearOfManufacture, double rentChanrgePerDay, 
           String colour, double lenght, double width, double height, 
            String model, Build builder, GuitarType type, Wood backWood, Wood topWood) {
       super(model, builder, type, backWood, topWood);
        this.serialNumber = serialNumber;
        this.yearOfManufacture = yearOfManufacture;
       this.rentChanrgePerDay = rentChanrgePerDay;
        this.colour = colour;
       this.lenght = lenght;
       this.width = width;
        this.height = height;
       this.status="On the shop";
   }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getRentChanrgePerDay() {
        return rentChanrgePerDay;
    }

    public String getColour() {
        return colour;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getStatus() {
        return status;
    }

    public String getDateItRents() {
        return dateItRents;
    }

    public String getDateDueBack() {
        return dateDueBack;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDateItRents(String dateItRents) {
        this.dateItRents = dateItRents;
    }

    public void setDateDueBack(String dateDueBack) {
        this.dateDueBack = dateDueBack;
    }
    public void rented()
    {
        this.status="Rented out";
    }
     public void maintenance()
    {
        this.status="Under maintenance";
    }
     public void returned()
    {
        this.status="On the shop";
    }
     

    
  

}
