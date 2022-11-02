package ru.job4j.pojo;

public class Book {
    private String nameBook;
    private int numOfPages;

    public Book (String nameBook, int numOfPages) {
        this.nameBook = nameBook;
        this.numOfPages = numOfPages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
