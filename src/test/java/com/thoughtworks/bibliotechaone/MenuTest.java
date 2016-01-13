package com.thoughtworks.bibliotechaone;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private BufferedReader bufferedReader;
    private Library library;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        library = mock(Library.class);
        menu = new Menu(printStream, bufferedReader, library);
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
    public void shouldGetStringWhenReadingLine() throws IOException {
        when(bufferedReader.readLine()).thenReturn("testy");
        String option = menu.readOption();

        assertThat(option, is("testy"));
    }

    @Test
    public void shouldAcceptStringWhenCorrectOptionEntered() throws IOException {
        when(bufferedReader.readLine()).thenReturn("A");
        String option = menu.readOption();
        assertThat(menu.parseOption(option), is("A"));
    }

    @Test
    public void shouldRejectStringWhenIncorrectOptionEntered() throws IOException {
        when(bufferedReader.readLine()).thenReturn("not an option");
        String option = menu.readOption();
        assertThat(menu.parseOption(option), is(""));
    }

    @Test
    public void shouldListBooksWhenOptionIsA() {
        menu.execute("A");

        verify(library).listBooks();
    }
}
