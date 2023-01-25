package com.mayab.desarrollo.creacional.factory_method;

public class DB_relacional extends DB_Creator {

    public DB_relacional(String type) {
        this.type = type;
    }
    public DB_connector create_DB(String type) {
        if(type.equals("MySQL")) {
            return new MySQL();
        }
        else if(type.equals("Oracle")) {
            return new Oracle();
       }
        else {
            return null;
        }
    }
}

