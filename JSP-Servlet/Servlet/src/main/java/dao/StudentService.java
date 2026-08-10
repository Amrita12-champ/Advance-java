package dao;

import entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentService {
    Connection con;
    public StudentService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student",
                    "root",
                    "a34862@TKRS"
            );

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int register(Student student) {
        String sql = "INSERT INTO studentdata VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement prt = con.prepareStatement(sql);

            prt.setInt(1, student.getId());
            prt.setString(2, student.getName());
            prt.setString(3, student.getEmail());
            prt.setString(4, student.getRedgNo());

            return prt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}