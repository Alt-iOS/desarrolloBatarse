package com.mayab.desarrollo.creacional.factory_method;

public class Main {
    public static void main( String[] args )
    {
        DB_Creator db = new DB_relacional("MySQL");
        ReporteA reporte = new ReporteA(db);
        reporte.verReporte();
    }

}
