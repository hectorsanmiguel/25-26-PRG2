package entregas.sanmiguelHector.reto002;

import java.util.Scanner;

public class EditorFicheros {

    static String[] fichero;
    static int lineaActiva = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String opcionElegidaPorUsuario;

        CrearFichero();

        do {
            MostrarMenu();
            MostrarFichero();

            opcionElegidaPorUsuario = scanner.next();

            switch (opcionElegidaPorUsuario) {
                case "S":
                    System.out.println("Saliendo del editor...");
                    break;

                case "L":
                    int nuevaLinea = DefinirLineaActiva();
                    if (nuevaLinea != -1) {
                        lineaActiva = nuevaLinea;
                    }
                    break;

                case "E":
                    EditarLineaActiva();
                    break;

                case "B":
                    BorrarLineaActiva();
                    break;

                case "I":
                    IntercambiarLineas();
                    break;
            }

        } while (!opcionElegidaPorUsuario.equals("S"));
    }

    static int DefinirLineaActiva() {
        System.out.print("Seleccione línea (1-10): ");
        int linea = scanner.nextInt();

        if (linea < 1 || linea > 10) {
            System.out.println("Línea no válida.");
            return -1;
        }

        System.out.println("Línea activa establecida en: " + linea);
        return linea - 1;
    }

    static void EditarLineaActiva() {
        scanner.nextLine();
        System.out.print("Nuevo contenido para la línea " + (lineaActiva + 1) + ": ");
        fichero[lineaActiva] = scanner.nextLine();
    }

    static void BorrarLineaActiva() {
        fichero[lineaActiva] = "";
        System.out.println("Línea borrada.");
    }

    static void IntercambiarLineas() {
        System.out.print("Primera línea (1-10): ");
        int l1 = scanner.nextInt() - 1;

        System.out.print("Segunda línea (1-10): ");
        int l2 = scanner.nextInt() - 1;

        if (l1 < 0 || l1 > 9 || l2 < 0 || l2 > 9) {
            System.out.println("Líneas no válidas.");
            return;
        }

        String temp = fichero[l1];
        fichero[l1] = fichero[l2];
        fichero[l2] = temp;

        System.out.println("Líneas intercambiadas.");
    }

    static void MostrarMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("0: | Bienvenidos al editor EDLIN");
        System.out.println("1:*| Utilice el menu inferior para editar el texto");
        System.out.println("2: | ------");
        System.out.println("3: | [L] permite definir la linea activa");
        System.out.println("4: | [E] permite editar la linea activa");
        System.out.println("5: | [I] permite intercambiar dos lineas");
        System.out.println("6: | [B] borra el contenido de la linea activa");
        System.out.println("7: | [S] sale del programa");
        System.out.println("--------------------------------------------------");
        System.out.println("Comandos: [L] [E] [I] [B] [S]");
        System.out.println();
    }

    static void CrearFichero() {
        fichero = new String[10];
        for (int i = 0; i < fichero.length; i++) {
            fichero[i] = "";
        }
    }

    static void MostrarFichero() {
        System.out.println("------------------Fichero Actual------------------");
        for (int i = 0; i < fichero.length; i++) {
            String marca = (i == lineaActiva) ? "*" : " ";
            System.out.println((i + 1) + marca + ": " + fichero[i]);
        }
    }
}
