import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Boook boook;

    @Before
    public void setup () {
        library = new Library();
        boook = new Boook("Fight Club", "Chuck Palahniuk", "Fantasy");
    }

    @Test
    public void addBook() {
        library.addBook(boook);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkCapacityTrue() {
        assertEquals(true, library.checkCapacity());
    }

    @Test
    public void checkCapacityFalse() {
        library.addBook(boook);
        library.addBook(boook);
        assertEquals(false, library.checkCapacity());
    }
}
