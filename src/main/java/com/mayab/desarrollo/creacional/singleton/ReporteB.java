package com.mayab.desarrollo.creacional.singleton;

public class ReporteB {
    String info;

    public ReporteB() {
        this.info = DBConnect.getInstanceOpen().info;
    }

    public void print(){
        System.out.println(this.info);
    }

}
