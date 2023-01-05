import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberPrinterTest {

    private NumberPrinter sut = new NumberPrinter();

    @Test
    public void consoleDestinationShouldBeOk() {
        sut.printNumbers(2,4, Destination.CONSOLE);
    }

    @Test
    public void fileDestinationShouldBeOk() {
        sut.printNumbers(2,4, Destination.FILE);
    }

    @Test
    public void numbersDividableBy3And5ShouldNotBePrinted() {
        String output = sut.printNumbers(3,5, Destination.CONSOLE);
        assertFalse(output.contains("\n3\n"));
        assertFalse(output.contains("\n5\n"));
        assertFalse(output.contains("\n9\n"));
        assertFalse(output.contains("\n3\n"));
        assertFalse(output.contains("\n3\n"));
        assertTrue(output.contains("\n2\n"));
        assertTrue(output.contains("\n4\n"));
    }
}
