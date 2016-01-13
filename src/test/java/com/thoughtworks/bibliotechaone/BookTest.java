package com.thoughtworks.bibliotechaone;

import org.junit.Before;
import org.junit.Test;

import java.awt.print.PrinterGraphics;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    private PrintStream printStream;
    private Book book;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        book = new Book("Title", "Author", 1000, printStream);
    }

    @Test
    public void shouldIncludeTitleWhenPrinting() {
        book.print();
        verify(printStream).println(contains("Title"));
    }

    @Test
    public void shouldIncludeAuthorWhenPrinting() {
        book.print();
        verify(printStream).println(contains("Author"));
    }

    @Test
    public void shouldIncludeYearWhenPrinting() {
        book.print();
        verify(printStream).println(contains("1000"));
    }

    @Test
    public void shouldPrintFormattedDetailsWhenPrinting() {
        book.print();
        verify(printStream).println("Title | Author | 1000");
    }
}
