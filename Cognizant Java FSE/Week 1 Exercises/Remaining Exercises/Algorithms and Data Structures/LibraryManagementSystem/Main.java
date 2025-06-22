public class Main {
    public static void main(String[] args) {
        Library lib = new Library(5);

        lib.addBook(new Book(101, "Harry Potter", "J.K. Rowling"));
        lib.addBook(new Book(102, "The Hobbit", "J.R.R. Tolkien"));
        lib.addBook(new Book(103, "Pride and Prejudice", "Jane Austen"));
        lib.addBook(new Book(104, "1984", "George Orwell"));

        System.out.println("\n All Books:");
        lib.displayBooks();

        System.out.println("\n Linear Search for 'The Hobbit':");
        Book found1 = lib.linearSearchByTitle("The Hobbit");
        if (found1 != null) found1.display();
        else System.out.println(" Book not found.");

        System.out.println("\n Binary Search for 'Pride and Prejudice':");
        Book found2 = lib.binarySearchByTitle("Pride and Prejudice");
        if (found2 != null) found2.display();
        else System.out.println(" Book not found.");
    }
}
