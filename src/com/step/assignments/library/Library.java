package com.step.assignments.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books;
    private List<String> readers;

    public Library(List<String> books, List<String> readers) {
        this.books = books;
        this.readers = readers;
    }

    public void addNewBook(String book){
        this.books.add(book);
    }

    public void removeBook(String book){
        this.books.remove(this.books.indexOf(book));
    }

}
