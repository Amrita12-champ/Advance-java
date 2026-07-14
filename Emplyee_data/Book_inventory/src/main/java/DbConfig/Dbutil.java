package Dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
    private static Connection con;
    public void getdbConnection(){
        try {
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/EmpDB",
                    "root",
                    "a34862@TKRS");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}