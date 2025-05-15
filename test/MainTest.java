import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testScoresAreEqualReturnsLoveAll() {
        // Prueba: Puntuaciones iguales, devuelve "Love-All"
        // Parámetros: player1Score = 0, player2Score = 0
        assertEquals("Love-All", Main.getScore(0, 0));
    }

    @Test
    public void testScoresAreEqualReturnsFifteenAll() {
        // Prueba: Puntuaciones iguales, devuelve "Fifteen-All"
        // Parámetros: player1Score = 1, player2Score = 1
        assertEquals("Fifteen-All", Main.getScore(1, 1));
    }

    @Test
    public void testScoresAreEqualReturnsThirtyAll() {
        // Prueba: Puntuaciones iguales, devuelve "Thirty-All"
        // Parámetros: player1Score = 2, player2Score = 2
        assertEquals("Thirty-All", Main.getScore(2, 2));
    }

    @Test
    public void testScoresAreEqualReturnsFortyAll() {
        // Prueba: Puntuaciones iguales, devuelve "Forty-All"
        // Parámetros: player1Score = 3, player2Score = 3
        assertEquals("Forty-All", Main.getScore(3, 3));
    }

    @Test
    public void testScoresAreEqualReturnsDeuce() {
        // Prueba: Puntuaciones iguales, devuelve "Deuce"
        // Parámetros: player1Score = 4, player2Score = 4
        assertEquals("Deuce", Main.getScore(4, 4));
    }

    @Test
    public void testPlayerOneHasAdvantage() {
        // Prueba: Jugador 1 tiene ventaja
        // Parámetros: player1Score = 5, player2Score = 4
        assertEquals("Advantage player1", Main.getScore(5, 4));
    }

    @Test
    public void testPlayerTwoHasAdvantage() {
        // Prueba: Jugador 2 tiene ventaja
        // Parámetros: player1Score = 4, player2Score = 5
        assertEquals("Advantage player2", Main.getScore(4, 5));
    }

    @Test
    public void testPlayerOneWins() {
        // Prueba: Jugador 1 gana
        // Parámetros: player1Score = 6, player2Score = 4
        assertEquals("Win for player1", Main.getScore(6, 4));
    }

    @Test
    public void testPlayerTwoWins() {
        // Prueba: Jugador 2 gana
        // Parámetros: player1Score = 4, player2Score = 6
        assertEquals("Win for player2", Main.getScore(4, 6));
    }

    @Test
    public void testPlayerOneScoresFifteenPlayerTwoScoresLove() {
        // Prueba: Jugador 1 anota Fifteen, Jugador 2 anota Love
        // Parámetros: player1Score = 1, player2Score = 0
        assertEquals("Fifteen-Love", Main.getScore(1, 0));
    }

    @Test
    public void testPlayerOneScoresThirtyPlayerTwoScoresFifteen() {
        // Prueba: Jugador 1 anota Thirty, Jugador 2 anota Fifteen
        // Parámetros: player1Score = 2, player2Score = 1
        assertEquals("Thirty-Fifteen", Main.getScore(2, 1));
    }

    @Test
    public void testPlayerOneScoresFortyPlayerTwoScoresThirty() {
        // Prueba: Jugador 1 anota Forty, Jugador 2 anota Thirty
        // Parámetros: player1Score = 3, player2Score = 2
        assertEquals("Forty-Thirty", Main.getScore(3, 2));
    }
}