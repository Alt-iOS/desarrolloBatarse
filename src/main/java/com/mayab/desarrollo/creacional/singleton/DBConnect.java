package com.mayab.desarrollo.creacional.singleton;

public class DBConnect {
    private static DBConnect instance;
    String info;

    private DBConnect() {
        this.info = "One DB instance";
    }

    public static DBConnect getInstanceOpen() {
        if (instance == null) {
            instance = new DBConnect();
        }
        return instance;
    }


}
