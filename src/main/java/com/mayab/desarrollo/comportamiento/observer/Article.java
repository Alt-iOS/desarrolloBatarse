package com.mayab.desarrollo.comportamiento.observer;

import java.util.List;

public class Article implements Subject{
    protected List<ObserverV> observers;
    @Override
    public void registerObserver(ObserverV o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverV o) {
        observers.remove(o);
    }

    @Override
    public void updateObservers(List<ObserverV> observers) {
        for (ObserverV o: observers){


        }
    }
}
