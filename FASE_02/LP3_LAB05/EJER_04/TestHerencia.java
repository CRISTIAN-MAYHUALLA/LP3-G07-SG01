public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 2000.0);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Maria", 1500.0);
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Carlos", 1800.0);

        // Calcular nómina y mostrar información de los empleados
        System.out.println("Información del Empleado 1:");
        System.out.println(empleado1.toString());
        System.out.println("Nómina: " + empleado1.calcularNomina() + "\n");

        System.out.println("Información del Empleado 2:");
        System.out.println(empleado2.toString());
        System.out.println("Nómina: " + empleado2.calcularNomina() + "\n");

        System.out.println("Información del Empleado 3:");
        System.out.println(empleado3.toString());
        System.out.println("Nómina: " + empleado3.calcularNomina() + "\n");
    }
}
