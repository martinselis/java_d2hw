import java.awt.print.Book;
import java.util.ArrayList;

public class Borrower {
    private ArrayList<Boook> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Boook newBook) {
        this.books.add(newBook);
    }

    public void borrow(Library library, Boook bookToBorrow) {
        Boook borrowedBook;
        boolean bookInStock = library.haveBook(bookToBorrow.getTitle());
        if (bookInStock) {
            borrowedBook = library.borrow(bookToBorrow);
            addBook(borrowedBook);
        }
    }

}
