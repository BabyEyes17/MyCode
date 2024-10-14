// "Book" class

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = isBorrowed;
    }

    // An alternate constructor so a book object can be initialized
    // without setting the isBorrowed boolean
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getISBN() {return ISBN;}
    public boolean isBorrowed() {return isBorrowed;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setISBN(String ISBN) {this.ISBN = ISBN;}
    public void setBorrowed(boolean borrowed) {this.isBorrowed = borrowed;}

    public boolean borrowBook(String s) {
        return isBorrowed = true;
    }

    public boolean returnBook() {
        return isBorrowed = false;
    }

    public void displayInfo() {

        String s = "Title: " + title;
        s += "\nAuthor: " + author;
        s += "\nISBN: " + ISBN;
        s += "\nBorrowed: " + isBorrowed;

        System.out.println(s);
    }

    public String toString() {

        String s = "Book{ ";
        s += "title = '" + title + '\'';
        s += ", author = '" + author + '\'';
        s += ", ISBN = '" + ISBN + '\'';
        s += ", isBorrowed = " + isBorrowed;
        s += " }";

        return s;
    }
}