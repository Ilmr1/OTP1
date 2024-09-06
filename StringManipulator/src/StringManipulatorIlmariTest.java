import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringManipulatorIlmariTest {

    private static StringManipulatorIlmari manipulator;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        manipulator = new StringManipulatorIlmari();
        System.out.println("Before all tests");
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        manipulator = null;
        System.out.println("After all tests");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("Before each test");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("After each test");
    }

    @Test
    public void testReverse() {
        assertEquals("cba", manipulator.reverse("abc"), "The reverse of 'abc' should be 'cba'");
        assertEquals("", manipulator.reverse(""), "The reverse of an empty string should be an empty string");
        assertEquals(null, manipulator.reverse(null), "The reverse of null should be null");
    }

    @Test
    public void testCapitalize() {
        assertEquals("Abc", manipulator.capitalize("abc"), "The capitalize of 'abc' should be 'Abc'");
        assertEquals("A", manipulator.capitalize("a"), "The capitalize of 'a' should be 'A'");
        assertEquals("", manipulator.capitalize(""), "The capitalize of an empty string should be an empty string");
        assertEquals(null, manipulator.capitalize(null), "The capitalize of null should be null");
    }
}