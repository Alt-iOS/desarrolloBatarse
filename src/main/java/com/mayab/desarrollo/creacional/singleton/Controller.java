package com.mayab.desarrollo.creacional.singleton;

public class Controller {
    public static void main(String[] args) {
        DBConnect db = DBConnect.getInstanceOpen();
        System.out.println(db);
    }
}
