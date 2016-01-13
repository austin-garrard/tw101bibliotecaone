package com.thoughtworks.bibliotechaone;


import java.io.IOException;

public class Librarian {

    private Menu menu;
    private Library library;

    public Librarian(Menu menu, Library library) {
        this.menu = menu;
        this.library = library;
    }

    public void run(){
        menu.display();

        String input = "";

        try {
            input = menu.readOption();
        }
        catch(IOException exc) {

        }

        String option = menu.parseOption(input);

        if(!option.equals("")) {
            menu.execute(option);
        }
    }
}
