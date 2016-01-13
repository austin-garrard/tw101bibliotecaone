package com.thoughtworks.bibliotechaone;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void listBooks() {
        for (Book book : books) {
            book.print();
        }
    }

}
