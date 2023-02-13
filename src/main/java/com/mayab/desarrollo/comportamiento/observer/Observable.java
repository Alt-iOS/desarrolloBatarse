package com.mayab.desarrollo.comportamiento.observer;

import java.util.ArrayList;

public interface Observable {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void updateObservers(ArrayList<Observer> observers);

}
