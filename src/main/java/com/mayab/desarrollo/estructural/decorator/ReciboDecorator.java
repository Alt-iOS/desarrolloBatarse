package com.mayab.desarrollo.estructural.decorator;

public abstract class ReciboDecorator extends Recibo {

    public Recibo recibo;
    public abstract String descr();
    public abstract float costo();
}
