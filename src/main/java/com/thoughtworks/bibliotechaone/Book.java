package com.thoughtworks.bibliotechaone;

/**
 * Created by adobley on 1/12/16.
 */
public class Book {

    private final String author;

    private final int yearPublished;

    private final String name;

    public int getYearPublished() {
        return yearPublished;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {

        return author;
    }

    public Book(String name, String author, int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }
}
