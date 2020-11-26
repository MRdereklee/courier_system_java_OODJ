/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author sengk
 */
public class Admin extends User{
    private double salary;
    final private String ROLE = "Admin";
    private static AtomicInteger admin_id_incremental = new AtomicInteger(0);

    public Admin(String fName, String lName, int age, int gender, String email, String pNumber, double salary ) {
        super(fName, lName, age, gender, email, pNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + salary + ";" + ROLE;
    }
    
    @Override
    public String id_incremental() {
       String ID = Integer.toString(admin_id_incremental.incrementAndGet());
       return "A" + ID;
    }
}
