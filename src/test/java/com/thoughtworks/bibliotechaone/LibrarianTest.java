package com.thoughtworks.bibliotechaone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibrarianTest {

    private GreetingPrinter greetingPrinter;
    private Library library;
    private Librarian librarian;

    @Before
    public void setup() {
        greetingPrinter = mock(GreetingPrinter.class);
        library = mock(Library.class);
        librarian = new Librarian(greetingPrinter, library);

        librarian.run();
    }

    @Test
    public void shouldGreetWhenRun() {
        verify(greetingPrinter).printGreeting();
    }

    @Test
    public void shouldListBooksWhenRun() {
        verify(library).listBooks();
    }
}