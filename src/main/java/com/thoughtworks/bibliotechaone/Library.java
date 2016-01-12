package com.thoughtworks.bibliotechaone;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by adobley on 1/12/16.
 */
public class Library {
    private ArrayList<String> books;
    private PrintStream printStream;

    public Library(PrintStream printStream, ArrayList<String> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void listBooks() {
        for(int i = 0; i < books.size(); i++) {
            printStream.println(books.get(i));
        }
    }
}
