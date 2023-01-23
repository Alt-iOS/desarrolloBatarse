package com.mayab.desarrollo.creacional.singleton;

public class DBConnect {
    private static volatile DBConnect instance;
    public String info;
    private DBConnect() {
        this.info = "Connected to DB";
    }

    public static DBConnect getInstance() {
       synchronized (DBConnect.class){
            if (instance == null) {
                instance = new DBConnect();
            }
        }
        return instance;
    }
    public static String update(String query) {
        return "Query: " + query + " updated";
    }
    public static String delete(String query) {
        return "Query: " + query + " deleted";
    }

    public static String insert(String query) {
        return "Query: " + query + " inserted";
    }

    public static String select(String query) {
        return "Query: " + query + " selected";
    }


    public static void close() {
        instance = null;
        System.out.println("Connection closed");
    }

}
