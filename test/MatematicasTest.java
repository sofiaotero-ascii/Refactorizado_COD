import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatematicasTest {

    @Test
    public void sumaOfPositiveNumbersReturnsCorrectResult() {
        assertEquals(5, Matematicas.suma(2, 3));
    }

    @Test
    public void sumaOfNegativeNumbersReturnsCorrectResult() {
        assertEquals(-5, Matematicas.suma(-2, -3));
    }

    @Test
    public void sumaOfZeroAndPositiveNumberReturnsCorrectResult() {
        assertEquals(3, Matematicas.suma(0, 3));
    }

    @Test
    public void sumaOfZeroAndNegativeNumberReturnsCorrectResult() {
        assertEquals(-3, Matematicas.suma(0, -3));
    }

    @Test
    public void sumaOfZeroAndZeroReturnsZero() {
        assertEquals(0, Matematicas.suma(0, 0));
    }
}