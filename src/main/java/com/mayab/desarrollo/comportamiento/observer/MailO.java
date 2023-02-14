package com.mayab.desarrollo.comportamiento.observer;

public class MailO implements ObserverV{
    private Subject s;
    private int price;
    public MailO(Subject s, int price) {
        this.s =s;
        s.registerObserver(this);
        this.price = price;

    }
    @Override
    public void update() {
        if ((int)s.getFlag()<this.price){
            System.out.println("Mail dice: El articulo ha bajado a menos de "+ this.price);
        }
    }
}
