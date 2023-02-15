package com.mayab.desarrollo.comportamiento.observer;

public class WhatsAppO implements ObserverV{
    private Subject s;
    private int price;
    public WhatsAppO(Subject s, int price) {
        this.s =s;
        s.registerObserver(this);
        this.price = price;
    }
    @Override
    public void setFlag(Object price) {
        this.price = (int)price;
    }
    @Override
    public void update() {
        if ((int)s.getFlag()<this.price){
            System.out.println("WhatssApp dice: El articulo ha bajado a menos de "+ this.price);
        }
    }
}
