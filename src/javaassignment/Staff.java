package javaassignment;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;

/**
 *
 * @author sengk
 */
public class Staff extends User {
    private double salary;
    final private String ROLE = "Staff";
    
    private Preferences prefs;
    private static AtomicInteger staff_id_incremental ;

    public Staff( String fName, String lName, int age, int gender, String email, String pNumber, double salary) {
        super(fName, lName, age, gender, email, pNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setSalary(double Salary) {
        this.salary = Salary;
    }

    @Override
    public String toString() {
        return super.toString() + salary + ";" + ROLE;
    }
    
    @Override
    public String id_incremental() {
        prefs = Preferences.userRoot().node(this.getClass().getName());
        staff_id_incremental = new AtomicInteger(prefs.getInt("autoincremental_stafft", 1));
        int id = staff_id_incremental.incrementAndGet();
        prefs.putInt("autoincremental_stafft", staff_id_incremental.get());
        
        String ID = Integer.toString(id);
        return "S" + ID;
    }
}
