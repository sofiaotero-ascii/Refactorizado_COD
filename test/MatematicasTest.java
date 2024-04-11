import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatematicasTest {

    @Test
    @DisplayName("números positivos")
    public void sumaOfPositiveNumbersReturnsCorrectResult() {
        assertEquals(5, Matematicas.suma(2, 3));
    }

    @Test
    @DisplayName("números negativos")
    public void sumaOfNegativeNumbersReturnsCorrectResult() {
        assertEquals(-5, Matematicas.suma(-2, -3));
    }

    @Test
    @DisplayName("zero y números positivos")
    public void sumaOfZeroAndPositiveNumberReturnsCorrectResult() {
        assertEquals(3, Matematicas.suma(0, 3));
    }

    @Test
    @DisplayName("zero y números negativos")
    public void sumaOfZeroAndNegativeNumberReturnsCorrectResult() {
        assertEquals(-3, Matematicas.suma(0, -3));
    }

    @Test
    @DisplayName("ceros")
    public void sumaOfZeroAndZeroReturnsZero() {
        assertEquals(0, Matematicas.suma(0, 0));
    }
}