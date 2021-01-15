package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    public Connection connection;

    public  Connection getConnection(){


        String dbName="g_et";
        String userName="root";
        String password="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);


        } catch (Exception e) {
            e.printStackTrace();
        }


        return connection;
    }
}
