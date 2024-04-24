import org.junit.Test;
import static org.junit.Assert.*;

public class NextDateCalculatorTest {

    @Test
    public void testNextDate() {
        // Test case 1: Regular day
        assertEquals("Next date is 2/2/2024", "2/2/2024", NextDateCalculator.getNextDate(1, 2, 2024));

        // Test case 2: End of month
        assertEquals("Next date is 29/2/2024", "29/2/2024", NextDateCalculator.getNextDate(28, 2, 2024));

        // Test case 3: End of year
        assertEquals("Next date is 1/1/2025", "1/1/2025", NextDateCalculator.getNextDate(31, 12, 2024));

        // Add more test cases for edge cases, leap years, etc.
        assertEquals("Next date is 1/3/2023", "1/3/2023", NextDateCalculator.getNextDate(28, 2, 2023));

        assertEquals("Next date is 31/1/2025", "31/1/2025", NextDateCalculator.getNextDate(30, 1, 2025));

        assertEquals("Next date is 1/5/2025", "1/5/2025", NextDateCalculator.getNextDate(30, 4, 2025));
    }
}
 