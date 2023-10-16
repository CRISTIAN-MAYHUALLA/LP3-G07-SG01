package FASE_02.LP3_LAB06.ACT_01;

public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[5];

        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new Prestamo(12, 500); // Número de cuotas y monto de cuota

        System.out.println("Facturas, Empleados y Préstamo procesados en forma polimórfica:\n");

        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.println(porPagarActual.toString());
            System.out.printf("Pago vencido: $%.2f\n\n", porPagarActual.obtenerMontoPago());
        }
    }
}
