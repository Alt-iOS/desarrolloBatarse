package com.mayab.desarrollo.creacional.singleton;

public class ReporteA {

    String info;

    public ReporteA() {
        //this.info = DBConnect.getInstanceOpen().info;
    }

    public void print(){
         System.out.println(this.info);
    }


}
