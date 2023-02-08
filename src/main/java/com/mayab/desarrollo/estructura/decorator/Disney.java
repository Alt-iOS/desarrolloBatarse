package com.mayab.desarrollo.estructura.decorator;

public class Disney extends ReciboDecorator{

    public Disney(Recibo recibo){
        this.recibo=recibo;
        this.costo = 100;
        this.descrip =  "\nDisney";
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
