package com.thoughtworks.bibliotechaone;

import java.io.PrintStream;

public class Menu {
    private PrintStream printStream;

    public Menu(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void display() {
        printStream.println("Welcome");
    }
}
