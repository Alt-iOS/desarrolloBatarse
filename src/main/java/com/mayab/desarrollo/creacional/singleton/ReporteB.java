package com.mayab.desarrollo.creacional.singleton;

public class ReporteB {
    String info;

    public ReporteB() {
        DBConnect.getInstance();
        this.info = "Reporte B";
    }

    public String update (String query) {
        return DBConnect.update(query);
    }

    public String delete (String query) {
        return DBConnect.delete(query);
    }

    public String insert (String query) {
        return DBConnect.insert(query);
    }

    public String select (String query) {
        return DBConnect.select(query);
    }

    public void print(){
        System.out.println(DBConnect.getInstance().info);
        System.out.println(this.info);

    }

}
