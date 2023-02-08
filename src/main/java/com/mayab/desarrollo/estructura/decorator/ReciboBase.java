package com.mayab.desarrollo.estructura.decorator;

public class ReciboBase extends Recibo{

    public ReciboBase(String fecha){
        this.fecha=fecha;
        this.costo=200;
        this.descrip= "El servicio incluye: \ntelefonía";
    }

    @Override
    public String descr() {
        return "El servicio se debe antes de " + this.fecha +"\n" +this.descrip ;
    }

    @Override
    public float costo() {
        return this.costo;
    }
}
