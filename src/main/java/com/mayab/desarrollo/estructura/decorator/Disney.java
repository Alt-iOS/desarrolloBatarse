package com.mayab.desarrollo.estructura.decorator;

public class Disney extends ReciboDecorator{

    public Disney(){}

    @Override
    public String des(String descripcion) {
        return descripcion + "DisneyPlus\n";
    }

    @Override
    public float cost(float costo) {
        return costo + 100;
    }
}
