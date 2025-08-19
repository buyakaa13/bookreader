package org.demo.adapter;

import org.demo.factory.Book;
import org.demo.observer.Observer;

import java.util.*;

public class MobiBookAdapter implements Book {
    private ExternalMobiBook mobiBook;
    private int page = 0;
    private List<Observer> observers = new ArrayList<>();

    public MobiBookAdapter(ExternalMobiBook mobiBook) {
        this.mobiBook = mobiBook;
    }

    @Override
    public String getTitle() {
        return mobiBook.fetchTitle();
    }

    @Override
    public void nextPage() {
        mobiBook.turnPage();
        page++;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(page);
        }
    }
}
