import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Boook boook;

    @Before
    public void setup() {
        borrower = new Borrower();
        library = new Library();
        boook = new Boook("Manual", "Samsung", "Instructional");
        library.addBook(boook);
    }

    @Test
    public void canBorrow() {
        borrower.borrow(library, boook);
        assertEquals(1, borrower.getBookCount());
        assertEquals(0, library.getBookCount());
    }
}
