package org.demo.factory;

import org.demo.observer.Observable;

public interface Book extends Observable {
    String getTitle();
    void nextPage();
}
