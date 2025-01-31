package BookTrackerInJava;
import java.util.ArrayList;
import java.util.List;
import BookTrackerInJava.Book;

public class Admin {
    private String name;
    private String adminId;
    private List<Book> books; 

    public Admin(String name, String adminId) {
        this.name = name;
        this.adminId = adminId;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public List<Book> getBooks() {
        return books;
    }
    
}