package BookTrackerInJava;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class LibrarySystem {
    private Admin admin;
    private List<Member> members;
    private Scanner scanner;

    public LibrarySystem() {
        admin = new Admin("Admin", "1");
        members = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adminMenu() {
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> viewBooks();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    private void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        Book book = new Book(title, author, isbn, genre, true);
        admin.addBook(book);
        System.out.println("Book added successfully.");
    }

    private void removeBook() {
        System.out.print("Enter ISBN to remove: ");
        String isbn = scanner.nextLine();
        admin.removeBook(isbn);
        System.out.println("Book removed successfully.");
    }

    private void viewBooks() {
        System.out.println("Books in Library:");
        for (Book book : admin.getBooks()) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.adminMenu();
    }
}
