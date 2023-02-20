package com.mayab.desarrollo.creacional.builder;

public class Main {

    public static void main(String[] args){
        Laptop laptop = Laptop.LaptopBuilder.LaptopBuilder()
                .setCpu("i7")
                .setRam("16 GB")
                .setKb("Mechanical 60%")
                .setOs("Windows")
                .setSsd("512 GB")
                .build();
        System.out.println(laptop.toString());

    }

}
