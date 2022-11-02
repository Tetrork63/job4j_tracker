package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Пушкин", 500);
        Book book2 = new Book("Толстой", 100);
        Book book3 = new Book("Clean code", 200);
        Book book4 = new Book("Дюма", 300);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getNameBook() + " - " + pr.getNumOfPages());
        }

        Book[] bookRev = new Book[1];
        bookRev[0] = books[0];
        books[0] = books[2];
        books[2] = bookRev[0];
        System.out.println();
        System.out.println("Меняем 1 и 3 книгу местами");

        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getNameBook() + " - " + pr.getNumOfPages());
        }

        System.out.println();
        System.out.println("Shown only book name Clean code");
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            if (Objects.equals(pr.getNameBook(), "Clean code")) {
                System.out.println(pr.getNameBook() + " - " + pr.getNumOfPages());
            }
        }
    }
}
