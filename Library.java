
import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void showBooks(){
        System.out.println("Books in the Library: ");
        for(Book book : books){
            System.out.println(book);
        }
    }

    public void issueBook(String title, User user){
        for(Book book : books){
            if(book.getTitle().equals(title) && !book.isIssued()){
                book.issue();
                System.out.println(user.getName() + " issued \"" + book.getTitle() + "\".");
                return;
            }
        }
        System.out.println("Book is already issued.");
    }

    public void returnBook(Long bookId, User user) {
        for (Book book : books) {
            if (book.getId().equals(bookId) && book.isIssued()) {
                book.returnBook();
                System.out.println(user.getName() + " returned \"" + book.getTitle() + "\".");
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }
}