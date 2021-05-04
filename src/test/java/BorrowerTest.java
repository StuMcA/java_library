import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Borrower borrower;
    private Library library;

    @Before
    public void setUp() {
        book = new Book("The Fellowship of the Ring", "J.R.R. Tolkein", "Fantasy");
        borrower = new Borrower();
        library = new Library(10);
    }

    @Test
    public void canBorrowBook() {
        library.addBook(book);
        borrower.borrowBook(book, library);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void cantBorrowBookNotInStock() {
        Book bookTwo = new Book("The Bell Jar", "Sylvia Plath", "Roman a clef");
        library.addBook(bookTwo);
        borrower.borrowBook(book, library);
        assertEquals(1, library.countBooks());
        assertEquals(0, borrower.countBooks());
    }
}
