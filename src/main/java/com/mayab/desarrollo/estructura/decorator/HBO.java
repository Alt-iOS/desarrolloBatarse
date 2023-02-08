package com.mayab.desarrollo.estructura.decorator;

public class HBO extends ReciboDecorator{

    public HBO(){}
    @Override
    public String des(String descripcion) {
        return descripcion + "HBO\n";
    }

    @Override
    public float cost(float costo) {
        return costo + 100;
    }
}
