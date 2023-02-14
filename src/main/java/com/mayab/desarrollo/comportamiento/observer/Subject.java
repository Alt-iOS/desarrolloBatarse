package com.mayab.desarrollo.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    public void registerObserver(ObserverV o);
    public void removeObserver(ObserverV o);
    public void updateObservers(List<ObserverV> observers);

}
