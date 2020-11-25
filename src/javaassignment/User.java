package javaassignment;

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
    private String email;
    private String pNumber;

    public User(String fName, String lName, int age, String email, String pNumber) {
        this.id = "hi";
        this.username = fName + lName;
        this.password = age + email;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
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
                email + ";" +
                pNumber + ";";
    }
    
    
}

