package com.mayab.desarrollo.creacional.factory_method;

public class ReporteA {
    DB_Creator db;
    public ReporteA(DB_Creator db){
        this.db =db;
    }

    public void verReporte(){
        this.db.consultar_reporte("TablaTest");
    }
}
