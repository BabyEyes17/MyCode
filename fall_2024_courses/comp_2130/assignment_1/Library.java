// A manager class for "Book" objects

import java.util.Arrays;

public class Library {
    private int maxBooks;
    private int currentCount;
    private Book[] books;

    public Library(int maxBooks) {
        this.maxBooks = maxBooks;
        currentCount = 0;
        books = new Book[maxBooks];
    }

    public int getCurrentCount() {
        return currentCount;
    }

    // Helper method to find the index of a book by ISBN
    public int findBookIndex(String ISBN) {

        for (int i = 0; i < currentCount; i++) {

            if (books[i].getISBN().equals(ISBN)) {
                return i;
            }
        }

        // Setting the return value to -1 is a sign that
        // the book does not exist based on the entered ISBN
        return -1;
    }

    // Helper method to safely access the private books array
    public Book[] getBooks() {
        return books;
    }

    // Function to add a "Book" object if there's space and the ISBN is unique
    public boolean addBook(Book book) {

        // Checking if the ISBN already exists in the library
        if (findBookIndex(book.getISBN()) != -1) {
            return false;
        }

        // If there's space, add the book
        if (currentCount < maxBooks) {
            books[currentCount] = book;
            currentCount++;
            return true;

        }

        // Library is full
        else {
            System.out.println("The library management system is full. No more books can be added.");
            return false;
        }
    }

    public boolean borrowBook(String ISBN) {

        int bookIndex = findBookIndex(ISBN);

        if (bookIndex != -1) {

            // Check to see if the book is borrowed already or not
            if (books[bookIndex].isBorrowed()) {
                return false;
            }

            else {
                books[bookIndex].setBorrowed(true);
                return true;
            }
        }

        else {return false;}
    }

    public boolean returnBook(String ISBN) {
        int bookIndex = findBookIndex(ISBN);

        if (bookIndex != -1) {

            if (books[bookIndex].isBorrowed()) {
                books[bookIndex].setBorrowed(false);
                return true;
            }

            else {return false;}
        }

        else {return false;}
    }

    public void displayAllBooks() {

        if (currentCount == 0) {
            System.out.println("No books available in the library.");
            return;
        }

        for (int i = 0; i < currentCount; i++) {
            books[i].displayInfo();
            System.out.println();
        }
    }


    public String toString() {

        String s = "Library{ ";
        s += "maxBooks = '" + maxBooks + '\'';
        s += ", currentCount = '" + currentCount + '\'';
        s += ", Book[] = '" + Arrays.toString(books) + '\'';
        s += " }";

        return s;
    }
}