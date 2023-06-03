package org.example;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDatabase {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver:LAPTOP-T267R1MD\\SQLEXPRESS01;databaseName=Students_j;integratedSecurity=true;authenticationScheme=nativeAuthentication";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Встановлення з'єднання з базою даних
            Connection connection = DriverManager.getConnection(url);

            // Виконання запиту на отримання студентів, які народилися в певному місяці
            String month = "03"; // Заданий місяць
            String query = "SELECT * FROM Students WHERE MONTH(Birth_Date) =" + month;
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, month);
            ResultSet resultSet = statement.executeQuery();

            // Виведення результатів запиту
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String lastName = resultSet.getString("Last_Name");
                String firstName = resultSet.getString("First_Name");
                String middleName = resultSet.getString("Middle_Name");
                Date birthDate = resultSet.getDate("Birth_Date");
                String studentID = resultSet.getString("Student_ID");

                System.out.println("Last Name: " + lastName);
                System.out.println("First Name: " + firstName);
                System.out.println("Middle Name: " + middleName);
                System.out.println("Birth Date: " + birthDate);
                System.out.println("Student ID: " + studentID);
                System.out.println("ID: " + id);
                System.out.println("--------------------");
            }

            // Закриття ресурсів
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        /* try (Connection connection = DriverManager.getConnection(url)) {
            String month = "03"; // Пошук студентів, які народилися в обраному місяці
            String query = "SELECT * FROM Students WHERE MONTH(Birth_Date) = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, month);
                ResultSet resultSet = statement.executeQuery();

                // resultSet.next();

                while (resultSet.next()) {
                    String lastName = resultSet.getString("Last_Name");
                    String firstName = resultSet.getString("First_Name");
                    String middleName = resultSet.getString("Middle_Name");
                    Date birthDate = resultSet.getDate("Birth_Date");
                    String studentID = resultSet.getString("Student_ID");
                    int id = resultSet.getInt("ID");

                    System.out.println("Last Name: " + lastName);
                    System.out.println("First Name: " + firstName);
                    System.out.println("Middle Name: " + middleName);
                    System.out.println("Birth Date: " + birthDate);
                    System.out.println("Student ID: " + studentID);
                    System.out.println("ID: " + id);
                    System.out.println("--------------------");
                }
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
