import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoookTest {

    Boook boook;

    @Before
    public void setup() {
        boook = new Boook("Fight Club", "Chuck Palahniuk", "Fantasy");
    }

    @Test
    public void hasCreatedBook() {
        assertEquals("Fight Club", boook.getTitle());
        assertEquals("Chuck Palahniuk", boook.getAuthor());
        assertEquals("Fantasy", boook.getGenre());
    }

}
