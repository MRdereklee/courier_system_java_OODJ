
package javaassignment;


public class Payment {
       private String OID;
       private String PayDate;
       private String PayMethod;
       private String PayAmount; 
 
    public Payment(String OID,String PayDate, String PayMethod, String PayAmount) {
        this.OID = OID;
        this.PayDate = PayDate;
        this.PayMethod = PayMethod;
        this.PayAmount = PayAmount;
    }
    
    public String getOID() {
        return OID;
    }

    public void setOID(String OID) {
        this.OID = OID;
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