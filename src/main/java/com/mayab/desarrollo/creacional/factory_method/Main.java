package com.mayab.desarrollo.creacional.factory_method;

public class Main {
    public static void main( String[] args )
    {
        System.out.println("Test for MySQL");
        DB_Creator db_0 = new DB_relacional("MySQL");
        ReporteA reporte_0 = new ReporteA(db_0);
        reporte_0.verReporte();
        System.out.println("Test for Oracle");
        DB_Creator db_1 = new DB_relacional("Oracle");
        ReporteA reporte_1 = new ReporteA(db_1);
        reporte_1.verReporte();
        System.out.println("Test for MongoDB");
        DB_Creator db_2 = new DB_no_relacional("MongoDB");
        ReporteA reporte_2 = new ReporteA(db_2);
        reporte_2.verReporte();
        System.out.println("Test for CouchDB");
        DB_Creator db_3 = new DB_no_relacional("CouchDB");
        ReporteA reporte_3 = new ReporteA(db_3);
        reporte_3.verReporte();

    }

}
