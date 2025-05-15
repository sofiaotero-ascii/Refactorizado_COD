# Refactorización do Código de Puntuación de Tenis

Este documento explica os cambios que se fixeron para refactorizar o código Java que calcula a puntuación nun xogo de tenis. O obxectivo principal da refactorización foi mellorar a lexibilidade, a mantenibilidade e a organización do código.

## Cambios Realizados

**1. Ficheiro `Main.java`**

* **Documentación:** Engadíronse comentarios Javadoc para explicar o propósito da clase e de cada método público. Isto fai que o código sexa máis fácil de entender para outros desenvolvedores.
* **Constantes:** Introducíronse constantes para todas as cadeas de texto que representan as puntuacións (por exemplo, `LOVE`, `FIFTEEN`, `THIRTY`, `FORTY`, `ALL`, `DEUCE`, etc.). Isto evita o uso de "números máxicos" ou cadeas de texto directamente no código, o que mellora a lexibilidade e facilita a modificación no futuro.
* **Extracción de Métodos:** O método `getScore` foi dividido en varios métodos máis pequenos e especializados:
  * `isTie()`: Comproba se as puntuacións dos xogadores son iguais.
  * `getTieScore()`: Calcula a cadea de texto da puntuación para os casos de empate.
  * `isAdvantageOrWin()`: Comproba se algún xogador ten polo menos 4 puntos.
  * `getAdvantageOrWinScore()`: Calcula a cadea de texto da puntuación para os casos de vantaxe ou vitoria.
  * `getRegularScore()`: Calcula a cadea de texto da puntuación para os casos normais (por exemplo, "Fifteen-Love").
  * `getScoreName()`: Obtén o nome da puntuación (por exemplo, "Love", "Fifteen") a partir do valor numérico.
* **Lexibilidade:** Mellorouse o formato do código, o espazamento e os nomes das variables para que sexa máis doado de ler e entender.
* **Programación Defensiva:** Engadiuse unha comprobación de erros no método `getScoreName()` para lanzar unha excepción (`IllegalArgumentException`) se se lle pasa unha puntuación non válida.

**2. Ficheiro `MainTest.java`**

* **Importacións:** Melloráronse as importacións de JUnit para facer o código de proba máis conciso.
* **Nomes dos Métodos de Proba:** Renomeáronse os métodos de proba para que sigan unha convención de nomenclatura máis clara e consistente.
* **Comentarios:** Engadíronse comentarios para explicar o propósito de cada proba e os parámetros que se están a usar.

## Por que se fixo isto?

A refactorización faise para:

* **Mellorar a Lexibilidade:** O código é máis doado de ler e entender, o que facilita o traballo con el no futuro.
* **Mellorar a Mantenibilidade:** O código é máis doado de modificar e manter, xa que está mellor organizado e modularizado.
* **Reducir a Complexidade:** Dividir o código en métodos máis pequenos fai que sexa máis fácil de razoar e depurar.
* **Evitar a Duplicación:** Ao usar constantes e métodos, evítase a repetición de código.
* **Mellorar a Calidade:** A programación defensiva axuda a previr erros e facer o código máis robusto.

