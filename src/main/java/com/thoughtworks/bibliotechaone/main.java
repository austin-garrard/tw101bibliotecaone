package com.thoughtworks.bibliotechaone;

import java.util.ArrayList;

public class Main {
    public static void main (String args[]) {
        GreetingPrinter greetingPrinter = new GreetingPrinter(System.out);
        greetingPrinter.printGreeting();
        Library library = new Library(System.out, new ArrayList<Book>());
        Librarian librarian = new Librarian(greetingPrinter, library);
        librarian.run();
    }
}
