import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        // Library instance and imported scanner setup for user input
        // The maximum number of books can only be changed here
        // I set it to 10 for easy testing
        Library library = new Library(10);
        Scanner scanner = new Scanner(System.in);
        String userInput;



        // Running this commented out line will display the library as a single string
        //System.out.println(library.toString());



        // Starting the library with some books so it isn't empty
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "00221-3", true));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "26030-0"));
        library.addBook(new Book("1984", "George Orwell", "28423-4"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "12008-4", true));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", "95356-9"));



        // The main loop of the program. This forces the user back to
        // the main menu after completing each available interaction.
        System.out.println("\nWelcome to Paws & Pages Library Management System!");
        do {

            // Main Menu
            System.out.println(
                    "\n=== Main Menu ===\n" +
                            "1. Add A Book\n" +
                            "2. Borrow A Book\n" +
                            "3. Return A Book\n" +
                            "4. Display All Books\n" +
                            "5. Exit Program\n" +
                            "Enter Your Choice: "
            );

            // User input taken as a string for simplicity
            // The user's input is then put through a switch
            // case to determine the program's next function
            userInput = scanner.next();
            scanner.nextLine();
            System.out.println("");

            switch (userInput) {



                // "Adding A Book"
                case "1":

                    // The user is prompted for each aspect of a book object.
                    // The inputs are assigned to the corresponding variables and relayed to the addBook() function
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter the ISBN: ");
                    String isbn = scanner.nextLine();

                    if (library.addBook(new Book(title, author, isbn))) {

                        System.out.println(title + " was successfully added to the library management system!\n");
                    }

                    if (!library.addBook(new Book(title, author, isbn))) {

                        System.out.println("\nA book with the ISBN " + isbn + " already exists in the library.");
                    }

                    else {

                        System.out.println("The library management system is full. " + title + " could not be added.\n");
                    }

                    break;



                // "Borrow A Book"
                case "2":

                    System.out.print("Enter the ISBN of the book to borrow: ");
                    String borrowIsbn = scanner.nextLine();

                    // Utilizing the findBookIndex() function
                    // This helps to determine if the book actually exists
                    int bookIndex = library.findBookIndex(borrowIsbn);

                    if (bookIndex == -1) {
                        System.out.println("Book with ISBN " + borrowIsbn + " does not exist.");
                    }

                    else if (library.borrowBook(borrowIsbn)) {
                        System.out.println("Enjoy the book!");
                    }

                    else {
                        System.out.println("Book is already borrowed.");
                    }

                    break;



                // "Return A Book"
                case "3":

                    System.out.print("Enter the ISBN of the book to return: ");
                    String returnIsbn = scanner.nextLine();

                    if (library.returnBook(returnIsbn)) {
                        System.out.println("Book returned successfully!");
                    }

                    else {
                        System.out.println("Could not return the book. Either it wasn't borrowed or it doesn't exist.");
                    }

                    break;



                // "Display All Books"
                case "4":

                    System.out.println(
                            "=== Paws & Pages Library ===\n" +
                                    "Catalogue  of " + library.getCurrentCount() + " books:\n"
                    );

                    library.displayAllBooks();
                    break;



                // "Exit Program"
                case "5":
                    //
                    System.out.println(
                            "Thank you for using Paws & Pages Library Management System!" +
                                    "\nExiting Program...");
                    break;



                // Invalid user input
                default:
                    // Invalid option
                    System.out.println("\nInvalid option. Please try again.\n");
                    break;
            }
        }

        // The main menu will be displayed until the user selects "Exit"
        // The program will then close the scanner and end itself
        while (!userInput.equals("5"));
        scanner.close();
    }
}