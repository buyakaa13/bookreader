package org.demo.factory;

import org.demo.observer.EPUBBook;

public class BookFactory {
    public static Book createBook(String type, String title) {
        switch (type.toLowerCase()) {
            case "pdf": return new PDFBook(title);
            case "epub": return new EPUBBook(title);
            default: throw new IllegalArgumentException("Unknown book type: " + type);
        }
    }
}
