package com.mayab.desarrollo.creacional.factory_method;

public class MySQL implements DB_connector {

    public MySQL() {
        System.out.println("MySQL created");
    }
    public void connect() {
        System.out.println("Connected to MySQL");
    }
    public void disconnect() {
        System.out.println("Disconnected from MySQL");
    }
    public void runQuery() {
        System.out.println("Running query on MySQL");
    }
    public void createQuery() {
        System.out.println("Creating query on MySQL");
    }
}
