package org.demo.adapter;

public class ExternalMobiBook {
    private String name;
    public ExternalMobiBook(String name) { this.name = name; }
    public String fetchTitle(){
        return name;
    }
    public void turnPage(){
        System.out.println("MOBI page turned.");
    }
}
