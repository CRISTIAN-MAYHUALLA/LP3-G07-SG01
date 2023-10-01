public class TestComposicion {
    public static void main(String[] args) {
        Persona persona1 = new Persona(1, "Juan", "Perez");
        Persona persona2 = new Persona(2, "Maria", "Lopez", 'B');

        // Realizar operaciones de depósito y retiro en las cuentas
        persona1.getCuenta().depositar(100.0);
        persona2.getCuenta().depositar(200.0);

        persona1.getCuenta().retirar(30.0);
        persona2.getCuenta().retirar(50.0);

        // Mostrar información de las personas y sus cuentas
        System.out.println("Información de la Persona 1:");
        System.out.println(persona1.toString());

        System.out.println("\nInformación de la Persona 2:");
        System.out.println(persona2.toString());
    }
}
