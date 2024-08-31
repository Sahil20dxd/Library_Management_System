public class Library {
    private Book[] books;
    private int bookCount;

    // Constructor to initialize the book array
    public Library() {
        books = new Book[10]; // Fixed size array for storing books
        bookCount = 0;
    }

    // Method to add a new book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("No more space to add new books.");
        }
    }

    // Method to remove a book using its ISBN
    public void removeBook(String ISBN) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                books[i] = books[bookCount - 1]; // Replace with the last book
                books[bookCount - 1] = null; // Remove the last book
                bookCount--;
                found = true;
                System.out.println("Book with ISBN " + ISBN + " removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }

    // Method to find and return a book using its ISBN
    public Book findBookByISBN(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                return books[i];
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
        return null;
    }

    // Method to list all available books
    public void listAvailableBooks() {
        boolean anyAvailable = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i]);
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No books available.");
        }
    }
}
