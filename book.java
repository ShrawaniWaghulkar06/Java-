import java.util.ArrayList;

// Book class
class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

// Library class
class Library {
    ArrayList<Book> list = new ArrayList<>();

    void addBook(Book b) {
        list.add(b);
    }

    void removeBook(String isbn) {
        for (Book b : list) {
            if (b.isbn.equals(isbn)) {
                list.remove(b);
                System.out.println("Book removed");
                return;
            }
        }
        System.out.println("Book not found");
    }

    void displayBooks() {
        for (Book b : list) {
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Library l = new Library();

        l.addBook(new Book("Java", "ABC", "1"));
        l.addBook(new Book("Python", "XYZ", "2"));

        l.displayBooks();

        l.removeBook("1");

        l.displayBooks();
    }
}