package javaBasics.catalog;

public class UserInterface {
    private LibraryCatalog catalog;

    public UserInterface(LibraryCatalog catalog) {
        this.catalog = catalog;
    }

    public void interact() {
        // FILL IN CODE - time permitting, write code to allow the user to
        // see all available books, checkout a book or return a book
        System.out.println("1. Check out a book");
        System.out.println("2. Return a book");
        System.out.println("3. Print the list of available books");
        System.out.println("4. Exit the program");

    }
}
