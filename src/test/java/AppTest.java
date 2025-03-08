import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, App.add(-1, 1), "(-1) + 1 should equal 0");
    }
    
    @Test
    public void testSubtract() {
        assertEquals(3, App.subtract(5, 2), "5 - 2 should equal 3");
        assertEquals(-5, App.subtract(0, 5), "0 - 5 should equal -5");
    }
    
    @Test
    public void testMultiply() {
        assertEquals(12, App.multiply(3, 4), "3 * 4 should equal 12");
        assertEquals(0, App.multiply(0, 100), "0 * 100 should equal 0");
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.5, App.divide(5, 2), 0.0001, "5 / 2 should equal 2.5");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            App.divide(5, 0);
        });
        String expectedMessage = "Division by zero is not allowed.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    
    @Test
    public void testCombinedOperations() {
        // (2 * 3) + (10 - 4) = 6 + 6 = 12
        int result = App.add(App.multiply(2, 3), App.subtract(10, 4));
        assertEquals(12, result, "Combined operations should equal 12");
    }
}
