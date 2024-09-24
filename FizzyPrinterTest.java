import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzyPrinterTest {

    @Test
    public void testFizz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Fizz", fizzyPrinter.printFizzy(9, false));
    }

    @Test
    public void testBuzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Buzz", fizzyPrinter.printFizzy(10, false));
    }

    @Test
    public void testBang() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Bang", fizzyPrinter.printFizzy(14, false));
    }

    @Test
    public void testFizzbuzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Fizzbuzz", fizzyPrinter.printFizzy(15, false));
    }

    @Test
    public void testFizzbuzzbang() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Fizzbuzzbang", fizzyPrinter.printFizzy(105, false));
    }

    @Test
    public void testBoom() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Boom", fizzyPrinter.printFizzy(8, false));
    }

    @Test
    public void testUppercaseOutput() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("FIZZBUZZBANG", fizzyPrinter.printFizzy(105, true));
    }
}
