/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

public class Order {
    
    private String OrderID;
    private String ODelDate;
    private String ORecDate;
    private String OStatus;
    private String OWeight;
    private String ORecName;
    private String ORecAdd;
    private String OSendName;
    private String OSendAdd;
    private Payment OPayment;
    private Driver ODriver;
    private final String ONoDriver = "Not Assigned";
    
    public Order(String OrderID, String ODelDate, String ORecDate, String OStatus, String OWeight, String ORecName, String ORecAdd, String OSendName, String OSendAdd) {
        this.OrderID = OrderID;
        this.ODelDate = ODelDate;
        this.ORecDate = ORecDate;
        this.OStatus = OStatus;
        this.OWeight = OWeight;
        this.ORecName = ORecName;
        this.ORecAdd = ORecAdd;
        this.OSendName = OSendName;
        this.OSendAdd = OSendAdd;
    }
    public Order(String OID, String PayDate, String PayMethod, String PayAmount) {
        this.OPayment = new Payment(OID, PayDate, PayMethod, PayAmount);
        System.out.println();
    }
    public Order(String OrderID, String ODelDate, String ORecDate, String OStatus, String OWeight, String ORecName, String ORecAdd, String OSendName, String OSendAdd, Driver ODriver) {
        this.OrderID = OrderID;
        this.ODelDate = ODelDate;
        this.ORecDate = ORecDate;
        this.OStatus = OStatus;
        this.OWeight = OWeight;
        this.ORecName = ORecName;
        this.ORecAdd = ORecAdd;
        this.OSendName = OSendName;
        this.OSendAdd = OSendAdd;
        this.ODriver = ODriver;
    }

    
    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getODelDate() {
        return ODelDate;
    }

    public void setODelDate(String ODelDate) {
        this.ODelDate = ODelDate;
    }

    public String getORecDate() {
        return ORecDate;
    }

    public void setORecDate(String ORecDate) {
        this.ORecDate = ORecDate;
    }

    public String getOStatus() {
        return OStatus;
    }

    public void setOStatus(String OStatus) {
        this.OStatus = OStatus;
    }

    public String getOWeight() {
        return OWeight;
    }

    public void setOWeight(String OWeight) {
        this.OWeight = OWeight;
    }

    public String getORecName() {
        return ORecName;
    }

    public void setORecName(String ORecName) {
        this.ORecName = ORecName;
    }

    public String getORecAdd() {
        return ORecAdd;
    }

    public void setORecAdd(String ORecAdd) {
        this.ORecAdd = ORecAdd;
    }

    public String getOSendName() {
        return OSendName;
    }

    public void setOSendName(String OSendName) {
        this.OSendName = OSendName;
    }

    public String getOSendAdd() {
        return OSendAdd;
    }

    public void setOSendAdd(String OSendAdd) {
        this.OSendAdd = OSendAdd;
    }
    
    public String getOID() {
        return OPayment.getOID();
    }
    public String getPayDate() {
        return OPayment.getPayDate();
    }
    
    public String getPayMethod() {
        return OPayment.getPayMethod();
    }
    
    public String getPayAmount() {
        return OPayment.getPayAmount();
    }

    public Driver getODriver() {
        return ODriver;
    }

    public void setODriver(Driver ODriver) {
        this.ODriver = ODriver;
    }

    public String getONoDriver() {
        return ONoDriver;
    }
    
    

    



}
