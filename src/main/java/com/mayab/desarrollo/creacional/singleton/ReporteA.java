package com.mayab.desarrollo.creacional.singleton;

public class ReporteA {

    String info;

    public ReporteA() {
        DBConnect.getInstance();
    }

    public String update (String query) {
        return "Query: " + query + " updated";
    }



}
