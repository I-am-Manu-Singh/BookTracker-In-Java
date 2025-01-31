package BookTrackerInJava;

public class Book{
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private boolean available;

    public Book(String title, 
                String author, 
                String isbn, 
                String genre, 
                boolean available) {
                    
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.available = available;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "Title: " + 
                title + 
                ", Author: " +
                author +
                ", ISBN: " + 
                isbn + 
                ", Genre: " + 
                genre + 
                ", Available: " + 
                available;
    }
}