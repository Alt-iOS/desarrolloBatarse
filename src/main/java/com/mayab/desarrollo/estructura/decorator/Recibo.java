package com.mayab.desarrollo.estructura.decorator;

public abstract class Recibo {
    public String fecha;
    public float costo;
    public String descrip;
    public abstract String descr();
    public abstract float costo();
}
