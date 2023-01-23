package com.mayab.desarrollo.creacional.singleton;

public class ReporteA {

    String info;

    public ReporteA() {
        DBConnect.getInstance();
        this.info = "Reporte A";
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
