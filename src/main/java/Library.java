import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    HashMap<String, Integer> genreCounts;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
        this.genreCounts = new HashMap<>();
    }

    public int countBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        if (countBooks() < capacity) {
            books.add(book);
            if (genreCounts.containsKey(book.getGenre())){
                genreCounts.put(book.getGenre(), genreCounts.get(book.getGenre())+1);
            } else {
                genreCounts.put(book.getGenre(), 1);
            }
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void removeBook(Book book) {
            books.remove(book);
    }

    public boolean checkForBook(Book book) {
        return books.contains(book);
    }
}
