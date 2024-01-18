import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testIsPrimeForPrimeNumbers() {
        assertTrue(Main.isPrime(11));
    }

    @Test
    public void testIsPrimeForNonPrimeNumbers()
        assertFalse(Main.isPrime(9));
    }

    @Test
    public void testIsPrimeForEdgeCases() {
        assertFalse(Main.isPrime(0));
    }
}
