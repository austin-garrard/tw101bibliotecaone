package com.thoughtworks.bibliotechaone;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OptionReaderTest {

    @Test
    public void shouldReadLineWhenReading() throws IOException {
        BufferedReader buffReader = mock(BufferedReader.class);
        OptionReader reader = new OptionReader(buffReader);

        reader.read();

        verify(buffReader).readLine();

    }

}