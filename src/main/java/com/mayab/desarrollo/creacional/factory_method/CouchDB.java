package com.mayab.desarrollo.creacional.factory_method;

public class CouchDB implements DB_connector{
    public void connect(){System.out.println("Connected to CouchDB");}
    public void disconnect(){System.out.println("Disconnected to CouchDB");}
    public void runQuery(String table) {
        System.out.println("Running query on CouchDB on table:" + table);
    }
    public void createQuery(){
        System.out.println("Creating query on CouchDB");
    }
}
