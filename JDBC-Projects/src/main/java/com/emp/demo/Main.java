package com.emp.demo;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_data",
                    "root",
                    "a34862@TKRS"
            );

            PreparedStatement pr = con.prepareStatement("SELECT * FROM student");

//            System.out.println("Enter id  :\n name :\n Domain :");
//            Scanner sc = new Scanner(System.in);

            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                System.out.println ("ID : " + rs.getInt(1) + "\tName : " + rs.getString(2) + "\tDomain : " + rs.getString(3));
            }

//            pr.setInt(1, sc.nextInt());
//            sc.nextLine(); // Clear scanner buffer
//            pr.setString(2, sc.nextLine());
//            pr.setString(3, sc.nextLine());

            // 3. Execute Query
//            int rowsaffect = pr.executeUpdate();
//            System.out.println("Rows affected: " + rowsaffect);
//
//            if (rowsaffect > 0) {
//                System.out.println("Data inserted");
//            }

            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found! Check your dependency.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred!");
            e.printStackTrace();
        }

        System.out.println("Database process finished successfully.");
    }
}