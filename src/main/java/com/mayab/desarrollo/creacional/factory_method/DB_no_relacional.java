package com.mayab.desarrollo.creacional.factory_method;
public class DB_no_relacional extends DB_Creator{
    public DB_no_relacional(String type) {
        this.type = type;
    }
    @Override
    public DB_connector create_DB(String type) {
        if(type.equals("MongoDB")) {
            return new MongoDB();
        }
        else if(type.equals("CouchDB")) {
            return new CouchDB();
        }
        else {
            return null;
        }
    }
}
