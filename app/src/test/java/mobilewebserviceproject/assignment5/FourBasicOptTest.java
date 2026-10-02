package mobilewebserviceproject.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class FourBasicOptTest {
    private final FourBasicOpt fourOpt = new FourBasicOpt();
    private final Calculator calculator = new Calculator();

    @Test public void add_01() {
        assertEquals(110, fourOpt.add(100, 10), 0);
    }
    @Test public void add_02() {
        assertEquals(90, fourOpt.add(100, -10), 0);
    }

    @Test public void subtract_01() {
        assertEquals(90, fourOpt.subtract(100, 10), 0);
    }
    @Test public void subtract_02() {
        assertEquals(110, fourOpt.subtract(100, -10), 0);
    }

    @Test public void divide_01() {
        assertEquals(10, fourOpt.divide(100, 10), 0);
    }
    @Test public void divide_02() {
        assertThrows(ArithmeticException.class, () -> fourOpt.divide(100, 0));
    }

    @Test public void multiply_01() {
        assertEquals(1000, fourOpt.multiply(100, 10), 0);
    }
    @Test public void multiply_02() {
        assertEquals(100, fourOpt.multiply(100, 1), 0);
    }
}
