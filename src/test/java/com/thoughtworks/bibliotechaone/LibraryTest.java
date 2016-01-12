package com.thoughtworks.bibliotechaone;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

public class LibraryTest {

    private ArrayList<Book> books;
    private Book bookOne;
    private Book bookTwo;
    private PrintStream printStream;

    @Before
    public void setup() {
        books = new ArrayList<>();
        bookOne = new Book("BookOneName", "BookOneAuthor", 2000);
        bookTwo = new Book("BookTwoName", "BookTwoAuthor", 1000);
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintBookListWithOneBook() {
        books.add(bookOne);
        Library library = new Library(printStream, books);
        library.listBooks();
        verify(printStream).println("BookOneName");
    }

    @Test
    public void shouldPrintNoBooksWithNoBooks() {
        Library library = new Library(printStream, books);
        library.listBooks();
        verifyZeroInteractions(printStream);
    }

    @Test
    public void shouldPrintBookListWithTwoBook() {
        books.add(bookOne);
        books.add(bookTwo);
        Library library = new Library(printStream, books);
        library.listBooks();
        verify(printStream).println("BookOneName");
        verify(printStream).println("BookTwoName");
    }
}
