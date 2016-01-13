package com.thoughtworks.bibliotechaone;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

public class LibraryTest {

    private ArrayList<Book> books;
    private Book bookOne;
    private Book bookTwo;
    private Library library;

    @Before
    public void setup() {
        books = new ArrayList<>();
        bookOne = mock(Book.class);
        bookTwo = mock(Book.class);
        library = new Library(books);
    }

    @Test
    public void shouldPrintBookListWithOneBook() {
        books.add(bookOne);
        library.listBooks();
        verify(bookOne).print();
    }

    @Test
    public void shouldPrintNoBooksWithNoBooks() {
        library.listBooks();
        verifyZeroInteractions(bookOne);
    }

    @Test
    public void shouldPrintBookListWithTwoBook() {
        books.add(bookOne);
        books.add(bookTwo);
        library.listBooks();
        verify(bookOne).print();
        verify(bookTwo).print();
    }
}
