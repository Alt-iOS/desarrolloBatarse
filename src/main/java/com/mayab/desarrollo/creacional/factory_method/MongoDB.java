package com.mayab.desarrollo.creacional.factory_method;

public class MongoDB implements DB_connector {
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
    public void disconnect() {
        System.out.println("Disconnected from MongoDB");
    }
    public void runQuery() {
        System.out.println("Running query on MongoDB");
    }
    public void createQuery() {
        System.out.println("Creating query on MongoDB");
    }
}

