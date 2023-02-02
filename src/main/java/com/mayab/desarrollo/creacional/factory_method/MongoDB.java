package com.mayab.desarrollo.creacional.factory_method;

public class MongoDB implements DB_connector {
    public MongoDB() {
        System.out.println("MongoDB created");
    }
    @Override
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnected from MongoDB");
    }
    @Override
    public void runQuery(String table) {
        System.out.println("Running query on MongoDB on table:" + table);
    }
    @Override
    public void createQuery() {
        System.out.println("Creating query on MongoDB");
    }
}

