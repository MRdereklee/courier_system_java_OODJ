package javaassignment;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author sengk
 */
public class Driver extends User{
    private Vehicle vehicle_used;
    
    private double salary;
    final private String ROLE = "Driver";
    private static AtomicInteger driver_id_incremental = new AtomicInteger(0);

    public Driver(String fName, String lName, int age, int gender, String email, String pNumber, double salary) {
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
       String ID = Integer.toString(driver_id_incremental.incrementAndGet());
       return "D" + ID;
    }
}
