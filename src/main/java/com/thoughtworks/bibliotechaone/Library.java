package com.thoughtworks.bibliotechaone;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private PrintStream printStream;

    public Library(PrintStream printStream, ArrayList<Book> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void listBooks() {
        for (Book book : books) {
            printStream.println(book.getName());
        }
    }
}
