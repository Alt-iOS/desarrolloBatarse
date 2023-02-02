package com.mayab.desarrollo.creacional.factory_method;

public class MySQL implements DB_connector {

    public MySQL() {
        System.out.println("MySQL created");
    }
    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL");
    }
    @Override
    public void runQuery(String table) {
        System.out.println("Running query on MySQL on table:" + table);
    }
    @Override
    public void createQuery() {
        System.out.println("Creating query on MySQL");
    }
}
