package model;

public class User {
    int id;
    String name;
    String email;
    String password;
    String adress;

    public User(int id, String adress, String email, String name, String password) {
        this.id = id;
        this.adress = adress;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "adress='" + adress + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}