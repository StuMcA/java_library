import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book bookTwo;

    @Before
    public void setUp() {
        library = new Library(5);
        book = new Book("The Fellowship of the Ring", "J.R.R. Tolkein", "Fantasy");
        bookTwo = new Book("The Stand", "Stephen King", "Horror");
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void hasBooks() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void maxCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.countBooks());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.countBooks());
    }

    @Test
    public void hashMapWorks() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(bookTwo);
        library.addBook(bookTwo);
        library.addBook(bookTwo);
        assertEquals(2, (int) library.genreCounts.get("Fantasy"));
        assertEquals(3, (int) library.genreCounts.get("Horror"));

    }
}
