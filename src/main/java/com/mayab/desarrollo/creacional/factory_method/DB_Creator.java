package com.mayab.desarrollo.creacional.factory_method;

public abstract class DB_Creator {

    public String type;
    public abstract DB_connector create_DB(String type);

    public void consultar_reporte(String tabla){
        DB_connector db = create_DB(this.type);
        db.connect();
        db.createQuery();
        db.runQuery(tabla);
        db.disconnect();
    }
}
