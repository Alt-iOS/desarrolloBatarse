package com.mayab.desarrollo.creacional.singleton;

public class DBConnect {
    private static volatile DBConnect instance;

    private DBConnect() { }

    public static DBConnect getInstance() {
       synchronized (DBConnect.class){
            if (instance == null) {
                instance = new DBConnect();
            }
        }
        return instance;
    }
    public String update(String query) {
        return "Query: " + query + " updated";
    }
    public String delete(String query) {
        return "Query: " + query + " deleted";
    }

    public String insert(String query) {
        return "Query: " + query + " inserted";
    }

    public String select(String query) {
        return "Query: " + query + " selected";
    }



}
