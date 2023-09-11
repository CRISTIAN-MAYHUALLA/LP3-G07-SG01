import java.util.Scanner;

public class MatrizApp2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        boolean matrizLlena = false;

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Rellenar TODA la matriz de números.");
            System.out.println("2. Suma de una fila.");
            System.out.println("3. Suma de una columna.");
            System.out.println("4. Sumar la diagonal principal.");
            System.out.println("5. Sumar la diagonal inversa.");
            System.out.println("6. Media de todos los valores de la matriz.");
            System.out.println("7. Salir.");
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
                    if (matrizLlena) {
                        calcularSumaColumna(matriz, scanner);
                    } else {
                        System.out.println("Debe rellenar la matriz primero.");
                    }
                    break;
                case 4:
                    if (matrizLlena) {
                        int sumaDiagonalPrincipal = calcularSumaDiagonalPrincipal(matriz);
                        System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrincipal);
                    } else {
                        System.out.println("Debe rellenar la matriz primero.");
                    }
                    break;
                case 5:
                    if (matrizLlena) {
                        int sumaDiagonalInversa = calcularSumaDiagonalInversa(matriz);
                        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);
                    } else {
                        System.out.println("Debe rellenar la matriz primero.");
                    }
                    break;
                case 6:
                    if (matrizLlena) {
                        double media = calcularMediaMatriz(matriz);
                        System.out.println("La media de todos los valores de la matriz es: " + media);
                    } else {
                        System.out.println("Debe rellenar la matriz primero.");
                    }
                    break;
                case 7:
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

    public static void calcularSumaColumna(int[][] matriz, Scanner scanner) {
        System.out.print("Ingrese el número de columna para calcular la suma (0-3): ");
        int columna = scanner.nextInt();
        if (columna >= 0 && columna < 4) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][columna];
            }
            System.out.println("La suma de la columna " + columna + " es: " + suma);
        } else {
            System.out.println("Columna no válida. Debe ser un número entre 0 y 3.");
        }
    }

    public static int calcularSumaDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int calcularSumaDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }

    public static double calcularMediaMatriz(int[][] matriz) {
        int suma = 0;
        int elementos = matriz.length * matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        return (double) suma / elementos;
    }
}
