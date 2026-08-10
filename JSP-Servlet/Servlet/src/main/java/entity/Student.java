package entity;

public class Student {
    private int id;
    private String name;
    private String email;
    private String redgNo;

    public Student() {
    }

    public Student(int id, String name, String email, String redgNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.redgNo = redgNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRedgNo() {
        return redgNo;
    }

    public void setRedgNo(String redgNo) {
        this.redgNo = redgNo;
    }

}
