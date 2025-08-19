package org.demo;

import org.demo.builder.ReaderSettings;
import org.demo.adapter.*;
import org.demo.factory.*;
import org.demo.observer.*;
import org.demo.singleton.BookReader;

public class Main {
    public static void main(String[] args) {
        ReaderSettings settings = new ReaderSettings.Builder()
                .theme("Dark")
                .fontSize(16)
                .lineSpacing(2.0)
                .build();
        Book pdf = BookFactory.createBook("pdf", "Design Patterns in Java");
        pdf.addObserver(new ProgressBar());
        pdf.addObserver(new PageNumber());

        BookReader reader = BookReader.getInstance();
        reader.openBook(pdf);
        reader.nextPage();
        reader.nextPage();

        Book mobi = new MobiBookAdapter(new ExternalMobiBook("Patterns in MOBI"));
        mobi.addObserver(new PageNumber());
        reader.openBook(mobi);
        reader.nextPage();
    }
}