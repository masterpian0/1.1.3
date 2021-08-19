package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static Connection connection;

    final static String DB_URL = "jdbc:mysql://localhost:3306/my_db";
    final static String DB_USERNAME = "root";
    final static String DB_PASSWORD = "springcourse";

    public static Connection getConnection() {
       if (connection == null) {
           try {
               connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
           } catch (SQLException e) {
               System.out.println("Не удалось создать соединение с БД");
           }
       }
       return connection;
    }
}