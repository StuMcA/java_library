import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int countBooks() {
        return books.size();
    }

    public void borrowBook(Book book, Library library) {
        if (library.checkForBook(book)) {
            books.add(library.removeBook(book));
        }
    }
}
