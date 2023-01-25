package com.mayab.desarrollo.creacional.factory_method;

public interface DB_connector {
    void connect();
    void disconnect();
    void runQuery(String table);
    void createQuery();
}
