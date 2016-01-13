package com.thoughtworks.bibliotechaone;


public class Librarian {

    private Menu menu;
    private Library library;

    public Librarian(Menu menu, Library library) {
        this.menu = menu;
        this.library = library;
    }

    public void run() {
        menu.display();
        library.listBooks();
    }
}
