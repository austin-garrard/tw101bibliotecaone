package com.thoughtworks.bibliotechaone;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibrarianTest {

    private Menu menu;
    private Library library;
    private Librarian librarian;

    @Before
    public void setup() {
        menu = mock(Menu.class);
        library = mock(Library.class);
        librarian = new Librarian(menu, library);

        librarian.run();
    }

    @Test
    public void shouldDisplayMenuWhenRun() {
        verify(menu).display();
    }

    @Test
    public void shouldListBooksWhenRun() {
        verify(library).listBooks();
    }
}