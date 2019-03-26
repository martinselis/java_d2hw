import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<Boook> books;
    private int capacity;

    public Library() {
        this.books = new ArrayList<>();
        this.capacity = 2;
    }

    public void addBook(Boook bookToAdd) {
        if (checkCapacity()) {
            this.books.add(bookToAdd);
        }
    }

    public int bookCount() {
        return this.books.size();
    }

    public boolean checkCapacity() {
        if (this.books.size() >= capacity) {
            return false;
        } else {
            return true;
        }
    }

    public boolean haveBook(String bookName) {

        for (int i = 0; i < this.books.size(); i++) {
            Boook book = this.books.get(i);
            if (bookName == this.books.get(i).getTitle()) {
                return true;
            }
        }
        return false;
    }

    public Boook borrow(Boook bookBeingBorrowed) {
        int bookIndex = this.books.indexOf(bookBeingBorrowed);
        return this.books.remove(bookIndex);
    }

    public int getBookCount() {
        return this.books.size();
    }
}
