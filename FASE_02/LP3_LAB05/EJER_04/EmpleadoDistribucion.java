public class EmpleadoDistribucion extends Empleado {
    public EmpleadoDistribucion(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularNomina() {
        return super.calcularNomina() * 1.10; // Incremento del 10% para empleados de distribución
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo: Distribución\n";
    }
}
