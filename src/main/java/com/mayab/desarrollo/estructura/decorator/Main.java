package com.mayab.desarrollo.estructura.decorator;

public class Main {

    public static void main(String args[]){
        Recibo TEST12 = new ReciboBase("12/02/2023");
        ReciboDecorator HBO = new HBO();
        ReciboDecorator Prime = new Prime();
        ReciboDecorator Disney = new Disney();
        System.out.println("El costo es: " +Prime.cost(Disney.cost(HBO.cost(TEST12.costo()))));
        System.out.println(Prime.des(Disney.des(HBO.des(TEST12.descr()))));

    }
}
