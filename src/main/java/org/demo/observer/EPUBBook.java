package org.demo.observer;

import org.demo.factory.Book;
import java.util.ArrayList;
import java.util.List;

public class EPUBBook implements Book {
    private String title;
    private int page = 0;
    private List<Observer> observers = new ArrayList<>();

    public EPUBBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void nextPage() {
        page++;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(page);
        }
    }
}
