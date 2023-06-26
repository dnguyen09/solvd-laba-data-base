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
    private static boolean initialized = false;

    private static synchronized void initializeConnectionPool() {
        if (!initialized) {
            connectionPool = new ArrayBlockingQueue<>(POOL_SIZE);
            createConnection();
            initialized = true;
        }
    }

    public static synchronized Connection getConnection() throws InterruptedException {
        if (!initialized) {
            initializeConnectionPool();
        } else if (connectionPool.size() < POOL_SIZE) {
            //create a connection and add to connection pool
            createConnection();
        }
        return connectionPool.take();
    }

    public static void releaseConnection(Connection connection) {
        connectionPool.offer(connection);
    }

    public static void createConnection() {
        Properties prop = new Properties();

        try (InputStream inputStream = new FileInputStream(FILE_PATH)) {
            prop.load(inputStream);

            String dbUrl = prop.getProperty("db.url");
            String dbUserName = prop.getProperty("db.username");
            String dbPassword = prop.getProperty("db.password");

            //create a connection and add to connection pool
            Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
            connectionPool.offer(connection);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
