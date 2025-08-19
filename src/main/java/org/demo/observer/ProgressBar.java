package org.demo.observer;

public class ProgressBar implements Observer {
    public void update(int page){
        System.out.println("ProgressBar updated: Page" + page);
    }
}
