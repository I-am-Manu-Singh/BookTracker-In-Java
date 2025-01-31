package BookTrackerInJava;

import java.util.List;
import java.util.ArrayList;

public class Member {
    private String name;
    private String membershipId;
    private List<Book> borrowedBooks;
    
    public Member(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

}