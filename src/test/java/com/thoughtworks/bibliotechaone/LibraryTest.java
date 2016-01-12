package com.thoughtworks.bibliotechaone;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

/**
 * Created by adobley on 1/12/16.
 */
public class LibraryTest {

    private ArrayList<String> books;
    private PrintStream printStream;

    @Before
    public void setup() {
        books = new ArrayList<String>();
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintBookListWithOneBook() {
        books.add("one");
        Library library = new Library(printStream, books);
        library.listBooks();
        verify(printStream).println("one");
    }

    @Test
    public void shouldPrintNoBooksWithNoBooks() {
        Library library = new Library(printStream, books);
        library.listBooks();
        verifyZeroInteractions(printStream);
    }

    @Test
    public void shouldPrintBookListWithTwoBook() {
        books.add("one");
        books.add("two");
        Library library = new Library(printStream, books);
        library.listBooks();
        verify(printStream).println("one");
        verify(printStream).println("two");
    }
}
