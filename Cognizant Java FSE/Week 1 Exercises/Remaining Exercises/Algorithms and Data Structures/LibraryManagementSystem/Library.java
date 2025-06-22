import java.util.Arrays;
import java.util.Comparator;

public class Library {
    Book[] books;
    int size;
    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
            System.out.println("Book added.");
        } else {
            System.out.println("Library full.");
        }
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, size, Comparator.comparing(b -> b.title));
        int left = 0, right = size - 1;
        title = title.toLowerCase();

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = books[mid].title.compareTo(title);
            if (compare == 0) return books[mid];
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    public void displayBooks() {
        if (size == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < size; i++) {
                books[i].display();
            }
        }
    }
}
