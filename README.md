# 📚 Book Tracker System in Java
## 🌐Overview
- A simple Java-based Library Management System where an Admin can manage books and Members can borrow or return books.
---
## 📌 Features
- ✔️ Admin can add, remove, and view books.
- ✔️ Members can borrow and return books.
- ✔️ Books have title, author, ISBN, genre, and availability status.
---
## 🏗 Project Structure
```yaml
📦 BookTrackerInJava  
 ┣ 📜 Admin.java         // Manages books (add, remove, view books)  
 ┣ 📜 Book.java          // Represents a book with title, author, ISBN, genre, and availability  
 ┣ 📜 LibrarySystem.java // Main class to run the program and provide the admin menu  
 ┣ 📜 Member.java        // Represents a library member who can borrow or return books  
```
---
## 🔹 File Use Cases
1️⃣ Admin.java
- 📌 Purpose: Manages book collection (add, remove, and retrieve books).
- 📌 Functions:
```yaml
- addBook(Book book): Adds a new book to the library.
- removeBook(String isbn): Removes a book using its ISBN.
- getBooks(): Returns a list of all books in the library.
```

2️⃣ Book.java
- 📌 Purpose: Represents a book with properties like title, author, ISBN, genre, and availability.
- 📌 Functions:
```yaml
- getIsbn(): Returns the book’s ISBN.
- isAvailable(): Checks if the book is available for borrowing.
- setAvailable(boolean available): Updates the availability of the book.
- toString(): Returns a formatted string with book details.
```

3️⃣ LibrarySystem.java
- 📌 Purpose: The main class that provides a menu-based system for admin actions.
- 📌 Functions:
```yaml
- adminMenu(): Displays admin options to add, remove, and view books.
- addBook(): Asks the admin for book details and adds a book.
- removeBook(): Allows the admin to remove a book using its ISBN.
- viewBooks(): Displays all books in the library.
```

4️⃣ Member.java
- 📌 Purpose: Represents a library member who can borrow and return books.
- 📌 Functions:
```yaml
- borrowBook(Book book): Adds a book to the member’s borrowed list.
- returnBook(Book book): Removes a book from the borrowed list.
- getBorrowedBooks(): Returns the list of books borrowed by the member.
```

---

## 🏃🏻‍♂️ How to Run

1️⃣ Clone the repository:

```yaml
git clone https://github.com/your-username/BookTrackerInJava.git
```

2️⃣ Open the project in your Java IDE.

3️⃣ Compile and run LibrarySystem.java.

---
## 🖥️ Console Output for Each Function

```yaml
📌 Admin Menu (Main Menu)

- Admin Menu:
1. Add Book
2. Remove Book
3. View Books
4. Exit
5. Enter your choice:
```

```yaml
📌 Adding a Book

📤 User Input
Enter title: Java Programming  
Enter author: John Doe  
Enter ISBN: 12345  
Enter genre: Technology  

📥 Console Output
Book added successfully.
```
```yaml
📌 Removing a Book

📤 User Input
Enter ISBN to remove: 12345

📥 Console Output
Book removed successfully.
```
```yaml
📌 Viewing Books

📥 Console Output
Books in Library:
Title: Java Programming, Author: John Doe, ISBN: 12345, Genre: Technology, Available: true
Title: Python Basics, Author: Alice Brown, ISBN: 67890, Genre: Education, Available: false
```

---
## 📝 License
This project is open-source under the MIT License.

## Screenshots 
![Banner](https://github.com/I-am-Manu-Singh/HeroIo/blob/master/screenshots/.png)

---

## Video 
<div align="center">
</br>
<img src="https://github.com/I-am-Manu-Singh/HeroIo/blob/master/screenshots/.gif" width="450" height="800" />
</div>
