package com.mayab.desarrollo.estructura.decorator;

public class HBO extends ReciboDecorator{

    public HBO(Recibo recibo){
        this.recibo=recibo;
        this.costo = 100;
        this.descrip =  "\nHBO";
    }

    @Override
    public String descr() {
        return recibo.descr()+ this.descrip;
    }

    @Override
    public float costo() {
        return recibo.costo()+ this.costo;
    }
}
