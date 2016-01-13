package com.thoughtworks.bibliotechaone;

import java.io.PrintStream;

public class Book {

    private final String author;

    private final int yearPublished;
    private PrintStream printStream;
    private String sep = " | ";
    private final String name;

    public Book(String name, String author, int yearPublished, PrintStream printStream) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.printStream = printStream;
    }

    public void print() {
        printStream.println(name + sep + author + sep + yearPublished);
    }
}
