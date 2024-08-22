package javaBasics.catalog;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private List<Book> books;
    // TODO: add a hash map that maps title to a book

    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }

    /**
     * Find the book by title and if it's available, check it out and return true.
     * If the book is not found or not available, return false
     * @param title title of the book
     * @return true if we could check out the book, and false otherwise
     */
    public boolean checkoutBook(String title) {
        // FILL IN CODE
        return false;
    }

    /**
     * Find the book by title, and if it's currently checked out, return it to the library and return true.
     * If the book is not found or not checked out, return false.
     * @param title title of the book
     * @return true if we could return the book to the library, and false otherwise
     */
    public boolean returnBook(String title) {
        // FILL IN CODE

        return false;
    }

    /**
     * Print books that are not checked out
     */
    public void printAvailableBooks() {
        // FILL IN CODE
    }
}
