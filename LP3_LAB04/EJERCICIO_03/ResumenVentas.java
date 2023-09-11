package LP3_LAB04.EJERCICIO_03;

import java.util.Scanner;

public class ResumenVentas {
    public static void main(String[] args) {
        // Definir el arreglo bidimensional para registrar las ventas
        double[][] ventas = new double[5][4];

        // Crear un objeto Scanner para obtener la información de las notas de venta
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las notas de venta del último mes:");

        // Leer las notas de venta
        for (int vendedor = 0; vendedor < 4; vendedor++) {
            for (int producto = 0; producto < 5; producto++) {
                System.out.print("Vendedor " + (vendedor + 1) + ", Producto " + (producto + 1) + ": ");
                double valorVenta = scanner.nextDouble();
                ventas[producto][vendedor] = valorVenta;
            }
        }

        scanner.close();

        // Calcular las ventas totales por vendedor y por producto
        double[] ventasTotalesPorVendedor = new double[4];
        double[] ventasTotalesPorProducto = new double[5];

        for (int vendedor = 0; vendedor < 4; vendedor++) {
            for (int producto = 0; producto < 5; producto++) {
                ventasTotalesPorVendedor[vendedor] += ventas[producto][vendedor];
                ventasTotalesPorProducto[producto] += ventas[producto][vendedor];
            }
        }

        // Mostrar el resumen de las ventas
        System.out.println("\nResumen de ventas:");

        for (int producto = 0; producto < 5; producto++) {
            System.out.print("Producto " + (producto + 1) + ": ");
            for (int vendedor = 0; vendedor < 4; vendedor++) {
                System.out.printf("%.2f\t", ventas[producto][vendedor]);
            }
            System.out.printf("Total Producto %d: %.2f\n", (producto + 1), ventasTotalesPorProducto[producto]);
        }

        System.out.println("Totales por vendedor:");
        for (int vendedor = 0; vendedor < 4; vendedor++) {
            System.out.printf("Vendedor %d: %.2f\t", (vendedor + 1), ventasTotalesPorVendedor[vendedor]);
        }

        // Calcular y mostrar el total general
        double totalGeneral = 0.0;
        for (int producto = 0; producto < 5; producto++) {
            totalGeneral += ventasTotalesPorProducto[producto];
        }

        System.out.printf("\nTotal General: %.2f\n", totalGeneral);
    }
}

