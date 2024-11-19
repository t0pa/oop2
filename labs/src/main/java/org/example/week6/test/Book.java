package org.example.week6.test;

import java.util.ArrayList;

public class Book {

    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public int year() {
        return year;
    }

    public String publisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return title + "\t" + publisher + "\t" + year;
    }



}


class Library {

    private ArrayList<Book> books;


    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book thing) {
        books.add(thing);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : books) {
            if(StringUtils.included(book.title(), title)) {
                found.add(book);
                }

        }
        return found;
    }


    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : books) {
            if(StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }

        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : books) {
            if (book.year() == year) {
                found.add(book);
            }

        }
        return found;

    }
}

class StringUtils {

    // Static method to check if 'searched' is contained in 'word', case-insensitive and ignoring whitespaces
    public static boolean included(String word, String searched) {
        // If either word or searched is null, return false
        if (word == null || searched == null) {
            return false;
        }

        // Trim whitespace from searched string and convert both to uppercase for case-insensitive comparison
        String trimmedSearched = searched.trim().toUpperCase();
        String upperWord = word.toUpperCase();

        // Check if the trimmed and uppercased 'searched' string is contained in the uppercased 'word' string
        return upperWord.contains(trimmedSearched);
    }
}

class Mymain{
    public static void main(String[] args) {
        Library Library = new Library();


        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));


        for (Book book: Library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }


        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }


    }
}
