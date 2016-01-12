package com.thoughtworks.bibliotechaone;


public class Librarian {
    
    private GreetingPrinter greetingPrinter;
    private Library library;

    public Librarian(GreetingPrinter greetingPrinter, Library library) {
        this.greetingPrinter = greetingPrinter;
        this.library = library;
    }

    public void run() {
        greetingPrinter.printGreeting();
        library.listBooks();
    }
}
