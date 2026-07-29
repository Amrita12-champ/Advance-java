package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/EmployeeDB",
                    "root",
                    "a34862@TKRS");

            String sql="INSERT INTO employee_data VALUES(?,?,?,?)";

            PreparedStatement ps=con.prepareStatement(sql);
//            ps.setInt(1, 43);
//            ps.setString(2, "Amrita Swain");
//            ps.setString(3, "HR");
//            ps.setDouble(4, 250000);
//            ps.addBatch();
//
//            ps.setInt(1, 44);
//            ps.setString(2, "Debapriya Dash");
//            ps.setString(3, "Testing");
//            ps.setDouble(4, 200000);
//            ps.addBatch();

            ps.setInt(1, 46);
            ps.setString(2, "Pratyusha Dhal");
            ps.setString(3, "Training");
            ps.setDouble(4, 45000);

            ps.addBatch();
            ps.setInt(1, 50);
            ps.setString(2, "Satyapriya Paikray");
            ps.setString(3, "Developer");
            ps.setDouble(4, 80000);
            ps.addBatch();

            ps.setInt(1, 26);
            ps.setString(2, "Satyajit Jena");
            ps.setString(3, "Software Engineer");
            ps.setDouble(4, 75000);
            ps.addBatch();

            int[] result = ps.executeBatch();
            System.out.println("Batch added Successfully");

        } catch (Exception e) {
            e.printStackTrace();


        }
    }

}