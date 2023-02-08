package com.mayab.desarrollo.estructura.decorator;

public class ReciboBase extends Recibo{

    public ReciboBase(String fecha){
        this.fecha=fecha;
        this.costo=200;
        this.descrip= "El servicio incluye: \n" +
                "telefonía(200) \n" + "para un total de:" +
                this.costo + "\n";
    }

    @Override
    public String descr() {
        return this.descrip+ "que se debe antes del " + this.fecha;
    }

    @Override
    public float costo() {
        return costo;
    }
}
