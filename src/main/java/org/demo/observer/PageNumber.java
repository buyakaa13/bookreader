package org.demo.observer;

public class PageNumber implements Observer {

    @Override
    public void update(int page) {
        System.out.println("Now reading page: " + page);
    }
}
