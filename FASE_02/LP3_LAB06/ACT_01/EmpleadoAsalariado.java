package FASE_02.LP3_LAB06.ACT_01;
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    public void establecerSalarioSemanal(double salario) {
        if (salario >= 0.0) {
            salarioSemanal = salario;
        } else {
            salarioSemanal = 0.0;
        }
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s %s\nNúmero de Seguro Social: %s\nSalario semanal: $%.2f\n",
                obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial(), salarioSemanal);
    }
}

