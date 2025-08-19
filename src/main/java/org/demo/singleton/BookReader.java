package org.demo.singleton;

import org.demo.factory.Book;

public class BookReader {
    private static BookReader instance;
    private Book currentBook;

    private BookReader() {}

    public static BookReader getInstance() {
        if(instance == null)
            instance = new BookReader();
        return instance;
    }

    public void openBook(Book book) {
        currentBook = book;
        System.out.println("Opened: " + book.getTitle());
    }

    public void nextPage()
    {
        if(currentBook != null)
            currentBook.nextPage();
    }
}
