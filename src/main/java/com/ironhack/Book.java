package com.ironhack;

import java.util.List;

public class Book {

    private String title;
    private int numPages;
    private int pagesRead;

    private List<String> categories;





    public Book(String title, int numPages) {
        this.title = title;
        this.numPages = numPages;
    }

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    public void addPagesRead(int numPages) {

         if (numPages >= 0 && pagesRead + numPages >= this.numPages) {
            pagesRead = this.numPages;
        } else if (numPages >= 0){
            pagesRead += numPages;
        }
    }


}
