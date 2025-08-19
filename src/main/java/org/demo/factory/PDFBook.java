package org.demo.factory;

import java.util.List;
import java.util.ArrayList;

import org.demo.observer.*;

public class PDFBook implements Book {
    private String title;
    private int page = 0;
    private List<Observer> observers = new ArrayList<>();
    PDFBook(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

    public void nextPage(){
        page++;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(page);
        }
    }
}
