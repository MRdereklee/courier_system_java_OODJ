package javaassignment;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;

/**
 *
 * @author sengk
 */
public class Driver extends User{
    
    private double salary;
    final private String ROLE = "Driver";
    
    
   private Preferences prefs;
    private static AtomicInteger driver_id_incremental;

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
       prefs = Preferences.userRoot().node(this.getClass().getName());
        driver_id_incremental = new AtomicInteger(prefs.getInt("autoincremental_driver",1));
        int id = driver_id_incremental.incrementAndGet();
        prefs.putInt("autoincremental_driver", driver_id_incremental.get());
        
        String ID = Integer.toString(id);
        return "D" + ID;
    }
}
