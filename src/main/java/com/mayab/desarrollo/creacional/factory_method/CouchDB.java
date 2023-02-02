package com.mayab.desarrollo.creacional.factory_method;

public class CouchDB implements DB_connector{
    public CouchDB() {
        System.out.println("CouchDB created");
    }
    @Override
    public void connect(){System.out.println("Connected to CouchDB");}
    @Override
    public void disconnect(){System.out.println("Disconnected to CouchDB");}
    @Override
    public void runQuery(String table) {
        System.out.println("Running query on CouchDB on table:" + table);
    }
    @Override
    public void createQuery(){
        System.out.println("Creating query on CouchDB");
    }
}
