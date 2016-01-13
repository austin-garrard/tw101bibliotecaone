package com.thoughtworks.bibliotechaone;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private Library library;
    private OptionReader optionReader;

    @Before
    public void setup() {
        library = mock(Library.class);
        printStream = mock(PrintStream.class);
        optionReader = mock(OptionReader.class);
        menu = new Menu(printStream, library, optionReader);
    }

    @Test
    public void shouldShowGreetingWhenDisplayed() {
        menu.display();

        verify(printStream).println(contains("Welcome"));
    }

    @Test
    public void shouldShowOptionsWhenDisplayed() {
        menu.display();

        verify(printStream).println(contains("List Books"));
    }

    @Test
    public void shouldShowPromptWhenDisplayed() {
        menu.display();

        verify(printStream).println(contains("Select an option"));
    }

    @Test
    public void shouldGetInput() {
        menu.display();

        verify(optionReader).read();
    }

    @Test
    public void shouldListBooksWhenAsked() {

        menu.display();
//        input = menu.getInput();
//        choice = menu.parseInput(input);
//        menu.act();

        verify(library).listBooks();

    }
}
