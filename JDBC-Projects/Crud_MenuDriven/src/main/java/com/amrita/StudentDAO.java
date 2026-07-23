package com.amrita;
import java.sql.*;
public class StudentDAO {
    Connection con = DBConnection.getConnection();

    // Register Student
    public void register(Student s) {
        try {
            String sql = "insert into student_info(name,email,course) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());
            int i = ps.executeUpdate();
            if (i > 0)
                System.out.println("Student Registered Successfully");
            else
                System.out.println("Registration Failed");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Get Name By ID
    public void getNameById(int id) {
        try {
            String sql = "select name from student_info where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Student Name : " + rs.getString("name"));
            } else {
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Get All
    public void getAllStudents() {
        try {
            String sql = "select * from student_info";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Email : " + rs.getString("email"));
                System.out.println("Course : " + rs.getString("course"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Update
    public void updateStudent(Student s) {
        try {
            String sql = "update student_info set name=?,email=?,course=? where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());
            ps.setInt(4, s.getId());
            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Student Updated Successfully");
            else
                System.out.println("Student Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete
    public void deleteStudent(int id) {
        try {
            String sql = "delete from student_info where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i > 0)
                System.out.println("Student Deleted Successfully");
            else
                System.out.println("Student Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}