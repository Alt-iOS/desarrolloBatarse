package com.mayab.desarrollo.estructural.proxy;

public class Page implements Access{
    @Override
    public void open(String nombre, User usuario) {
        System.out.println("El usuario " + usuario.getName() + " quiere acceder a esta página "+ nombre);
    }
}
