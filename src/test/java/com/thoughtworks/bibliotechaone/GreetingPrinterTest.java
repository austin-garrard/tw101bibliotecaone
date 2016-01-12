package com.thoughtworks.bibliotechaone;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adobley on 1/12/16.
 */
public class GreetingPrinterTest {

    @Test
    public void shouldPrintGreeting() {
        PrintStream printStream = mock(PrintStream.class);
        GreetingPrinter greetingPrinter = new GreetingPrinter(printStream);

        greetingPrinter.printGreeting();

        verify(printStream).println("Greetings!");
    }
}
