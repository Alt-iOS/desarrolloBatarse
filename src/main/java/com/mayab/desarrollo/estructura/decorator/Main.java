package com.mayab.desarrollo.estructura.decorator;

public class Main {

    public static void main(String args[]){
        //Prueba Recibo Base
        Recibo TEST = new ReciboBase("12/02/2023");
        System.out.println(TEST.descr());
        System.out.println("Con un costo de "+TEST.costo());
        //Prueba de cada decorator, uno encima de otro
        Recibo ConDisney = new Disney(TEST);
        System.out.println(ConDisney.descr());
        System.out.println("Con un costo de "+ConDisney.costo());
        Recibo ConPrime = new Prime(ConDisney);
        System.out.println(ConPrime.descr());
        System.out.println("Con un costo de "+ConPrime.costo());
        Recibo ConHBO = new HBO(ConPrime);
        System.out.println(ConHBO.descr());
        System.out.println("Con un costo de "+ConHBO.costo());
    }
}
