package com.thoughtworks.bibliotechaone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Library library;
    private Map<String,String> validOptions;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, Library library) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.library = library;
        validOptions = new HashMap<>();
        validOptions.put("A", "List Books");
    }

    public void display() {
        printStream.println("Welcome");
        printStream.println("Select an option: ");

        for(String validOption : validOptions.keySet()) {
            printStream.println(validOption + ". " + validOptions.get(validOption));
        }
    }

    public String readOption() throws IOException {
        return bufferedReader.readLine();
    }

    public String parseOption(String option) {
        if(validOptions.keySet().contains(option)) {
            return option;
        }
        else {
            return "";
        }
    }

    public void execute(String option) {
        if (option.equals("A")) {
            library.listBooks();
        }
    }
}
