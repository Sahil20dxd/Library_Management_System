public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("Java Programming", "John Doe", "123456", true);
        Book book2 = new Book("Data Structures", "Jane Smith", "789012", true);
        ReferenceBook refBook1 = new ReferenceBook("Design Patterns", "Erich Gamma", "345678", true, "Software Engineering");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(refBook1);

        // Listing all available books
        System.out.println("Available books in the library:");
        library.listAvailableBooks();

        // Removing a book
        library.removeBook("789012");

        // Listing all available books after removal
        System.out.println("\nAvailable books after removal:");
        library.listAvailableBooks();

        // Finding a specific book by ISBN
        Book foundBook = library.findBookByISBN("345678");
        if (foundBook != null) {
            System.out.println("\nFound book: " + foundBook);
        }

        System.out.println();

        // Attempt to remove a non-existent book
        library.removeBook("000000");
    }
}
