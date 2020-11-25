package javaassignment;

/**
 *
 * @author sengk
 */
public class Staff extends User {
    private double salary;
    final private String ROLE = "Staff";

    public Staff(double salary, String fName, String lName, int age, String email, String pNumber) {
        super(fName, lName, age, email, pNumber);
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
    
    
}
