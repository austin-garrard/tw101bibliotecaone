package com.thoughtworks.bibliotechaone;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {

    @Test
    public void shouldDisplayGreetingWhenRun() {
        PrintStream printStream = mock(PrintStream.class);
        Menu menu = new Menu(printStream);

        menu.display();

        verify(printStream).println(contains("Welcome"));
    }
}
