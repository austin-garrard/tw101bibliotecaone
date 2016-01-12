package com.thoughtworks.bibliotechaone;

import java.io.PrintStream;

/**
 * Created by adobley on 1/12/16.
 */
public class GreetingPrinter {

    private PrintStream printStream;

    public GreetingPrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printGreeting() {
        printStream.println("Greetings!");
    }
}
