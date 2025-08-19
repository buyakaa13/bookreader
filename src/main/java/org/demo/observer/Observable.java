package org.demo.observer;

public interface Observable {
    void addObserver(Observer o);
    void notifyObservers();
}
