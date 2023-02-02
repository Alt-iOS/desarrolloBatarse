package com.mayab.desarrollo.creacional.factory_method;

public class Oracle implements DB_connector {

    public Oracle() {
        System.out.println("Oracle created");
    }
    @Override
    public void connect() {
        System.out.println("Connected to Oracle");
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnected from Oracle");
    }
    @Override
    public void runQuery(String table) {
        System.out.println("Running query on Oracle on table:" + table);
    }
    @Override
    public void createQuery() {
        System.out.println("Creating query on Oracle");
    }

}
