package com.epam.designpatterns.observerpattern.subjects;

import com.epam.designpatterns.observerpattern.observers.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
