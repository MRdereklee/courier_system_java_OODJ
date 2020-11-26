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
    private String OPrice;
    private String ORemarks;
    private String ORecName;
    private String ORecAdd;
    private String OSendName;
    private String OSendAdd;
    private String PayDate;
    private String PayMethod;
    private String PayAmount;
    
      public Order(String OrderID, String ODelDate, String ORecDate, String OStatus, String OWeight, String OPrice, String ORemarks, String ORecName, String ORecAdd, String OSendName, String OSendAdd, String PayDate, String PayMethod, String PayAmount) {
        this.OrderID = OrderID;
        this.ODelDate = ODelDate;
        this.ORecDate = ORecDate;
        this.OStatus = OStatus;
        this.OWeight = OWeight;
        this.OPrice = OPrice;
        this.ORemarks = ORemarks;
        this.ORecName = ORecName;
        this.ORecAdd = ORecAdd;
        this.OSendName = OSendName;
        this.OSendAdd = OSendAdd;
        this.PayDate = PayDate;
        this.PayMethod = PayMethod;
        this.PayAmount = PayAmount;
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

    public String getOPrice() {
        return OPrice;
    }

    public void setOPrice(String OPrice) {
        this.OPrice = OPrice;
    }

    public String getORemarks() {
        return ORemarks;
    }

    public void setORemarks(String ORemarks) {
        this.ORemarks = ORemarks;
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

    public String getPayDate() {
        return PayDate;
    }

    public void setPayDate(String PayDate) {
        this.PayDate = PayDate;
    }

    public String getPayMethod() {
        return PayMethod;
    }

    public void setPayMethod(String PayMethod) {
        this.PayMethod = PayMethod;
    }

    public String getPayAmount() {
        return PayAmount;
    }

    public void setPayAmount(String PayAmount) {
        this.PayAmount = PayAmount;
    }
}
