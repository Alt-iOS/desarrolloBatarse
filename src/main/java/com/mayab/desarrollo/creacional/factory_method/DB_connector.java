package com.mayab.desarrollo.creacional.factory_method;

public interface DB_connector {
    public void connect();
    public void disconnect();
    public void runQuery();
    public void createQuery();
}
