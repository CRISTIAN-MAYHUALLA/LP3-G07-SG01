import java.util.Scanner;

public class MatrizApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        boolean matrizLlena = false;

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Rellenar TODA la matriz de números.");
            System.out.println("2. Suma de una fila.");
            System.out.println("3. Salir.");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    llenarMatriz(matriz, scanner);
                    matrizLlena = true;
                    break;
                case 2:
                    if (matrizLlena) {
                        calcularSumaFila(matriz, scanner);
                    } else {
                        System.out.println("Debe rellenar la matriz primero.");
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static void llenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz rellenada con éxito.");
    }

    public static void calcularSumaFila(int[][] matriz, Scanner scanner) {
        System.out.print("Ingrese el número de fila para calcular la suma (0-3): ");
        int fila = scanner.nextInt();
        if (fila >= 0 && fila < 4) {
            int suma = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                suma += matriz[fila][i];
            }
            System.out.println("La suma de la fila " + fila + " es: " + suma);
        } else {
            System.out.println("Fila no válida. Debe ser un número entre 0 y 3.");
        }
    }
}
