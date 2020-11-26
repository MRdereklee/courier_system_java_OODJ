package javaassignment;

/**
 *
 * @author sengk
 */
public class Vehicle {
    private String ID;
    private String brand;
    private String plateNumber;
    private String color;
    private double transportation_fee;

    public Vehicle(String ID, String brand, String plateNumber, String color, double transportation_fee) {
        this.ID = ID;
        this.brand = brand;
        this.plateNumber = plateNumber;
        this.color = color;
        this.transportation_fee = transportation_fee;
    }
    
    public String toString(){
        return "";
    }
    
    public String getID() {
        return ID;
    }

    public String getBrand() {
        return brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getColor() {
        return color;
    }

    public double getTransportation_fee() {
        return transportation_fee;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransportation_fee(double transportation_fee) {
        this.transportation_fee = transportation_fee;
    }
    
    
    
}
