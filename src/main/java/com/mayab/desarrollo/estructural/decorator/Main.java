package com.mayab.desarrollo.estructural.decorator;

public class Main {

    public static void main(String args[]){
        //Prueba Recibo Base
        Recibo test = new ReciboBase("12/02/2023");
        System.out.println(test.descr());
        System.out.println("Con un costo de "+ test.costo());
        //Prueba de cada decorator, uno encima de otro, uno a la vez
        Recibo conDisney = new Disney(test);
        System.out.println(conDisney.descr());
        System.out.println("Con un costo de "+ conDisney.costo());
        Recibo conPrime = new Prime(conDisney);
        System.out.println(conPrime.descr());
        System.out.println("Con un costo de "+ conPrime.costo());
        Recibo conHBO = new HBO(conPrime);
        System.out.println(conHBO.descr());
        System.out.println("Con un costo de "+ conHBO.costo());
    }
}
