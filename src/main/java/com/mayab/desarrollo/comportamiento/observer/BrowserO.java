package com.mayab.desarrollo.comportamiento.observer;

public class BrowserO implements ObserverV{
    private Subject s;
    private int price;
    public BrowserO(Subject s, int price) {
        this.s =s;
        s.registerObserver(this);
        this.price = price;
    }


    @Override
    public void update() {
        if ((int)s.getFlag()<this.price){
            System.out.println("Navegador dice: El articulo ha bajado a menos de "+ this.price);
        }
    }

    @Override
    public void setFlag(Object price) {
        this.price = (int)price;
    }
}
