package com.solvd.laba.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    //fields
    private static Connection connection = null;

    //methods
    public static Connection getConnection() {
        //initialize properties
        Properties prop = new Properties();

        //try with resource using FileInputStream to load input stream to properties
        try (InputStream inputStream = new FileInputStream("src/main/resources/database.properties")) {
            prop.load(inputStream);

            //get values from properties file
            String dbUrl = prop.getProperty("db.url");
            String dbUserName = prop.getProperty("db.username");
            String dbPassword = prop.getProperty("db.password");

            //get connection with DriverManager
            connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
