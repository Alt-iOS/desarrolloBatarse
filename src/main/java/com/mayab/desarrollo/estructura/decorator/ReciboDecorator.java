package com.mayab.desarrollo.estructura.decorator;

public abstract class ReciboDecorator extends Recibo {

    public Recibo recibo;
    public abstract String descr();
    public abstract float costo();
}
