# 📚 Library Management System (Using OOP)

A simple Java-based console application to manage books and users in a library. This project is designed to demonstrate **Object-Oriented Programming (OOP)** concepts using classes like `Book`, `User`, and `Library`.

---

## 🎯 Objective

Develop a mini system to manage books and users, allowing basic operations like issuing and returning books.

---

## 🛠️ Tools Used

- Java 21
- VS Code
- Terminal / Command Line

---

## 📁 Project Structure
```bash
LibraryManagement/
├── Book.java # Book class with details like title, author, issue status
├── User.java # User class with name and email
├── Library.java # Main logic to add, issue, and return books
└── Main.java # Entry point of the program
```
---

## ✅ Features

- 📘 Add new books to the library  
- 🙋 Register new users  
- 📖 Display all books (issued and available)  
- 🔁 Issue books to users  
- 📤 Return books to the library  

---

## 💻 How to Run

1. Make sure Java is installed:
   
   ```bash
   java -version
  
2. Clone the Repository:
   
   ```bash
   git clone https://github.com/Manjeet2001/LMS.git

3. Compile project:
   
   ```bash
   javac *.java

4. Run project:
   
   ```bash
   java Main

---

## 📤 Sample Output:

Book added: [101] Clean Code by Robert C. Martin [Available]
Book added: [102] The Pragmatic Programmer by Andrew Hunt [Available]

Books in Library:
[101] Clean Code by Robert C. Martin [Available]
[102] The Pragmatic Programmer by Andrew Hunt [Available]

Manjeet issued "Clean Code".

Books in Library:
[101] Clean Code by Robert C. Martin [Issued]
[102] The Pragmatic Programmer by Andrew Hunt [Available]

