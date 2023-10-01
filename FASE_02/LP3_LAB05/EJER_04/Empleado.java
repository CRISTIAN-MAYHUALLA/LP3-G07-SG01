public class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularNomina() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + "\nSalario Base: " + salarioBase + "\n";
    }
}
