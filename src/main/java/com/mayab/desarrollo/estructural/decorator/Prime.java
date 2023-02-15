package com.mayab.desarrollo.estructural.decorator;

public class Prime extends ReciboDecorator{

    public Prime(Recibo recibo){
        this.recibo=recibo;
        this.costo = 50;
        this.descrip =  "\nPrime";
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
