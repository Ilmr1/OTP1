import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @org.junit.jupiter.api.Test
    public void testAddAndListBooks() {
        App library = new App();
        library.addBook("The Great Gatsby");
        List<String> books = library.listBooks();
        assertEquals(1, books.size(), "There should be 1 book in the library");
        assertEquals("The Great Gatsby", books.get(0), "The Great Gatsby");
    }

    @Test
    public void testRemoveBook() {
        App library = new App();
        library.addBook("1984");
        library.removeBook("1984");
        List<String> books = library.listBooks();
        assertEquals(0, books.size());
    }
}
