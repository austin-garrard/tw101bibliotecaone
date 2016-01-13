package com.thoughtworks.bibliotechaone;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void listBooks() {
        for (Book book : books) {
            book.print();
        }
    }

}
