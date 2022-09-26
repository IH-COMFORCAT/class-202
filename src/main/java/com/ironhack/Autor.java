package com.ironhack;

import java.util.List;

public class Autor {

    private String name;
    private String lastName;
    private List<Book> books;

    public Autor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Autor(String name, String lastName, List<Book> books) {
        this.name = name;
        this.lastName = lastName;
        this.books = books;
    }

    public Autor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
