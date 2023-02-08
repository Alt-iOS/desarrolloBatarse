package com.mayab.desarrollo.estructura.decorator;

public class Prime extends ReciboDecorator{

    public Prime(){}

    @Override
    public String des(String descripcion) {
        return descripcion + "PRIME\n";
    }

    @Override
    public float cost(float costo) {
        return costo + 50;
    }
}
