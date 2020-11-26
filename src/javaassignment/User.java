package javaassignment;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author sengk
 */
public class User {
    private String id;
    private String username;
    private String password;
    private String fName;
    private String lName;
    private int age;
    private int gender;
    private String email;
    private String pNumber;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public User(String fName, String lName, int age, int gender, String email, String pNumber) {
        this.id = id_incremental();
        this.username = fName + lName;
        this.password = age + email;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.pNumber = pNumber;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }
    
    public String getEmail() {
        return email;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    @Override
    public String toString() {
        return id + ";" +
                username + ";" +
                password + ";" +
                fName + ";" +
                lName + ";" +
                age + ";" +
                gender + ";" +
                email + ";" +
                pNumber + ";";
    }
    
    public String id_incremental() {
       String ID = Integer.toString(atomicInteger.incrementAndGet());
       return ID;
    }
}

