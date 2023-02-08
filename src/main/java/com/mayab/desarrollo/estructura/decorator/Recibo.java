package com.mayab.desarrollo.estructura.decorator;

public abstract class Recibo {
    protected String fecha;
    protected float costo;
    protected String descrip;
    public abstract String descr();
    public abstract float costo();
}
