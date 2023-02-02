package com.mayab.desarrollo.comportamiento.adapter;

public class DeptA implements Dept{
    private String name;
    private int age;
    public DeptA(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void print() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: "+ age);
    }

    @Override
    public String getNombre() {return name;}

    @Override
    public int getEdad() {
        return age;
    }
}
