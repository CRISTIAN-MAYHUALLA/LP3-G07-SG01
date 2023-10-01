public class EmpleadoProduccion extends Empleado {
    public EmpleadoProduccion(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularNomina() {
        return super.calcularNomina() * 1.15; // Incremento del 15% para empleados de producción
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo: Producción\n";
    }
}
