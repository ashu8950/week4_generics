package com.practice.junitproject.database_connection;

public class DatabaseConnection {
    private boolean isConnected;
    //to connect data base
    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }
    //to disconnect
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }
    // to return is method connected or not
    public boolean isConnected() {
        return isConnected;
    }
}
