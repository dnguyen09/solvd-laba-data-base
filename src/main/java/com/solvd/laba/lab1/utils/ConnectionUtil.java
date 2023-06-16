package com.solvd.laba.lab1.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionUtil {
    private static final String FILE_PATH = "src/main/resources/properties/database.properties";
    private static final int POOL_SIZE = 7;
    private static BlockingQueue<Connection> connectionPool;

    static {
        initializeConnectionPool();
    }

    private static void initializeConnectionPool() {
        connectionPool = new ArrayBlockingQueue<>(POOL_SIZE);
        Properties prop = new Properties();

        try (InputStream inputStream = new FileInputStream(FILE_PATH)) {
            prop.load(inputStream);

            String dbUrl = prop.getProperty("db.url");
            String dbUserName = prop.getProperty("db.username");
            String dbPassword = prop.getProperty("db.password");

            for (int i = 0; i < POOL_SIZE; i++) {
                Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
                connectionPool.offer(connection);
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws InterruptedException {
        return connectionPool.take();
    }

    public static void releaseConnection(Connection connection) {
        connectionPool.offer(connection);
    }


}
