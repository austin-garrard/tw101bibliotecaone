package com.thoughtworks.bibliotechaone;

import java.util.ArrayList;

public class Main {
    public static void main (String args[]) {
        ArrayList<Book> books = getTestBooks();

        Menu menu = new Menu(System.out);

        Library library = new Library(books);
        Librarian librarian = new Librarian(menu, library);
        librarian.run();
    }

    private static ArrayList<Book> getTestBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("First Title", "Some Author", 1231, System.out));
        books.add(new Book("Second Title", "Another Author", 9583, System.out));
        return books;
    }
}
