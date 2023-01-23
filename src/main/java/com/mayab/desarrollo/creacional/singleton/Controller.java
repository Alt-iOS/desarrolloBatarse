package com.mayab.desarrollo.creacional.singleton;

public class Controller {
    public static void main(String[] args) {
        DBConnect.getInstance();
        ReporteA reporteA = new ReporteA();
        reporteA.print();
        System.out.println(reporteA.update("Test update A"));
        System.out.println(reporteA.delete("Test delete A"));
        System.out.println(reporteA.insert("Test insert A"));
        System.out.println(reporteA.select("Test select A"));
        DBConnect.close();
        ReporteB reporteB = new ReporteB();
        reporteB.print();
        System.out.println(reporteB.update("Test update B"));
        System.out.println(reporteB.delete("Test delete B"));
        System.out.println(reporteB.insert("Test insert B"));
        System.out.println(reporteB.select("Test select B"));
        DBConnect.close();
    }
}
