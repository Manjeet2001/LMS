public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("Clean Code", "Robert C. Martin", false);
        Book book2 = new Book("The Pragmatic Programmer", "Andrew Hunt", false);

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Create users
        User user1 = new User("Manjeet", "manjeet@example.com");

        // Show all books
        library.showBooks();

        // Issue and return book
        library.issueBook(book1.getTitle(), user1);
        library.showBooks();

        library.returnBook(book1.getId(), user1);
        library.showBooks();
    }
}
