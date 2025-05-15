/**
 * Maneja la lógica de puntuación de tenis.
 * @author Sofía Otero
 */
public class Main {

    // Constantes para los nombres de las puntuaciones
    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";
    private static final String ALL = "-All";
    private static final String DEUCE = "Deuce";
    private static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    private static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    private static final String WIN_FOR_PLAYER_1 = "Win for player1";
    private static final String WIN_FOR_PLAYER_2 = "Win for player2";

    /**
     * Devuelve la puntuación del juego de tenis basado en los puntos de los jugadores.
     *
     * @param player1Score Puntos del jugador 1.
     * @param player2Score Puntos del jugador 2.
     * @return La puntuación del juego como una cadena de texto.
     */
    public static String getScore(int player1Score, int player2Score) {
        // Inicializa la variable para almacenar la puntuación
        String score = "";
        // Inicializa la variable temporal para almacenar la puntuación temporal
        int tempScore = 0;

        // Si los jugadores tienen la misma puntuación
        if (player1Score == player2Score) {
            // Determina la puntuación en función de los puntos de los jugadores
            switch (player1Score) {
                case 0:
                    score = LOVE + ALL; // "Love-All"
                    break;
                case 1:
                    score = FIFTEEN + ALL; // "Fifteen-All"
                    break;
                case 2:
                    score = THIRTY + ALL; // "Thirty-All"
                    break;
                case 3:
                    score = FORTY + ALL; // "Forty-All"
                    break;
                default:
                    score = DEUCE; // "Deuce"
                    break;
            }
        }
        // Si algún jugador tiene al menos 4 puntos
        else if (player1Score >= 4 || player2Score >= 4) {
            // Calcula la diferencia de puntuación
            int scoreDifference = player1Score - player2Score;

            // Determina la puntuación en función de la diferencia
            if (scoreDifference == 1) {
                score = ADVANTAGE_PLAYER_1; // "Advantage player1"
            } else if (scoreDifference == -1) {
                score = ADVANTAGE_PLAYER_2; // "Advantage player2"
            } else if (scoreDifference >= 2) {
                score = WIN_FOR_PLAYER_1; // "Win for player1"
            } else {
                score = WIN_FOR_PLAYER_2; // "Win for player2"
            }
        }
        // Si no se cumple ninguna de las condiciones anteriores
        else {
            // Itera sobre los jugadores
            for (int i = 1; i < 3; i++) {
                // Asigna la puntuación temporal al jugador actual
                if (i == 1) {
                    tempScore = player1Score;
                } else {
                    score += "-"; // Agrega un guion para separar las puntuaciones
                    tempScore = player2Score;
                }
                // Determina el nombre de la puntuación en función del valor
                switch (tempScore) {
                    case 0:
                        score += LOVE; // "Love"
                        break;
                    case 1:
                        score += FIFTEEN; // "Fifteen"
                        break;
                    case 2:
                        score += THIRTY; // "Thirty"
                        break;
                    case 3:
                        score += FORTY; // "Forty"
                        break;
                }
            }
        }
        // Devuelve la puntuación
        return score;
    }

    public static void main(String[] args) {
        // Método main para probar la funcionalidad
        System.out.println(getScore(1, 2)); // Ejemplo de uso
    }
}