# 📚 Book Tracker System in Java

- A simple Java-based Library Management System where an Admin can manage books and Members can borrow or return books.

## 📌 Features
✔️ Admin can add, remove, and view books.
✔️ Members can borrow and return books.
✔️ Books have title, author, ISBN, genre, and availability status.
---
## 🏗 Project Structure
```yaml
📦 BookTrackerInJava  
 ┣ 📜 Admin.java  
 ┣ 📜 Book.java  
 ┣ 📜 LibrarySystem.java  
 ┣ 📜 Member.java  
```
---
# 🚀 Getting Started
1️⃣ Prerequisites
- Java Development Kit (JDK 8+)
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)
2️⃣ How to Run
1️⃣ Clone the repository:
```yaml
git clone https://github.com/your-username/BookTrackerInJava.git
```
2️⃣ Open the project in your Java IDE.
3️⃣ Compile and run LibrarySystem.java.
---
## 🖥️ Console Output for Each Function
📌 Admin Menu (Main Menu)
- Admin Menu:
1. Add Book
2. Remove Book
3. View Books
4. Exit
5. Enter your choice:

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
