package javaassignment;

/**
 *
 * @author sengk
 */
public class Driver extends User{
    private double salary;
    final private String ROLE = "Driver";

    public Driver(double salary, String fName, String lName, int age, String email, String pNumber) {
        super(fName, lName, age, email, pNumber);
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
}
