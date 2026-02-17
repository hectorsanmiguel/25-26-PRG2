package entregas.sanmiguelHector.reto003;
import java.util.Random;

class Buscaminas {

    static final int NUMERO_DE_FILAS = 5;
    static final int NUMERO_DE_COLUMNAS = 7;
    static final int NUMERO_DE_MINAS_INICIALES = 5;

    static char[][] tableroReal = new char[NUMERO_DE_FILAS][NUMERO_DE_COLUMNAS];
    static char[][] tableroVisible = new char[NUMERO_DE_FILAS][NUMERO_DE_COLUMNAS];

    public static void main(String[] args) {
        crearTablero();
        colocarMinas();
        mostrarTablero();
    }

    static void crearTablero() {

        for (int filas = 0; filas < NUMERO_DE_FILAS; filas++) {
            for (int columnas = 0; columnas < NUMERO_DE_COLUMNAS; columnas++) {
                tableroReal[filas][columnas] = ' ';
                tableroVisible[filas][columnas] = '-';
            }
        }
    }

    static void mostrarTablero() {
        System.out.print("   ");
        for (int columna = 0; columna < NUMERO_DE_COLUMNAS; columna++) {
            System.out.print(columna + 1 + " ");
        }
        System.out.println();

        for (int fila = 0; fila < NUMERO_DE_FILAS; fila++) {
            System.out.print(fila + 1 + "  ");
            for (int columna = 0; columna < NUMERO_DE_COLUMNAS; columna++) {
                System.out.print(tableroReal[fila][columna] + " ");
            }
            System.out.println();
        }
    }
    static void colocarMinas() {

        Random random = new Random();
        int minasColocadas = 0;

        while (minasColocadas < NUMERO_DE_MINAS_INICIALES) {

            int fila = random.nextInt(NUMERO_DE_FILAS);
            int columna = random.nextInt(NUMERO_DE_COLUMNAS);

            if (tableroReal[fila][columna] != '*') {
                tableroReal[fila][columna] = '*';
                minasColocadas++;
            }
        }
    }
}