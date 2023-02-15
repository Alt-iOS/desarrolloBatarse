package com.mayab.desarrollo.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Article implements Subject{

    private int price;
    private List<ObserverV> observers = new ArrayList<ObserverV>();
    @Override
    public void setFlag(Object price) {
        this.price = (int)price;
        updateObservers();
    }
    @Override
    public Object getFlag() {
        return price;
    }

    @Override
    public void registerObserver(ObserverV o) {
        this.observers.add(o);
    }


    @Override
    public void removeObserver(ObserverV o) {
        this.observers.remove(o);
    }

    @Override
    public void updateObservers() {
        for (ObserverV o: this.observers){
            o.update();
        }
    }
}
