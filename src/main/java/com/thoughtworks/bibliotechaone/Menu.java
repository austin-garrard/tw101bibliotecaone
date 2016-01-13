package com.thoughtworks.bibliotechaone;

import java.io.PrintStream;

public class Menu {
    private PrintStream printStream;

    public Menu(PrintStream printStream, Library library, OptionReader optionReader) {

        this.printStream = printStream;
    }

    public void display() {
        printStream.println("Welcome");
        printStream.println("Select an option: ");
        printStream.println("A. List Books");

    }


}
