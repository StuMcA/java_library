import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;
    private Library library;

    @Before
    public void setUp() {
        book = new Book("The Fellowship of the Ring", "J.R.R. Tolkein", "Fantasy");
        library = new Library(300);
    }

    @Test
    public void hasName() {
        assertEquals("The Fellowship of the Ring", book.getName());
    }

    @Test
    public void hasAuthor() {
        assertEquals("J.R.R. Tolkein", book.getAuthor());
    }
    @Test
    public void hasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }

}
