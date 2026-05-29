import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void truncateString_returnsOriginal_whenLengthIsLessThanLimit() {
        String result = Main.truncateString("Hi", 5);

        assertEquals("Hi", result);
    }

    @Test
    void truncateString_returnsOriginal_whenLengthEqualsLimit() {
        String result = Main.truncateString("Hello", 5);

        assertEquals("Hello", result);
    }
}