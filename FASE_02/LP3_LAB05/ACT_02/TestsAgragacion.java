public class TestAgregacion {
    public static void main(String[] args) {
        // Crear un motor
        Motor motor1 = new Motor(12345, 3000);

        // Crear un automóvil y asignarle el motor
        Automovil auto1 = new Automovil("ABC123", 4, "Toyota", "Corolla");
        auto1.setMotor(motor1);

        // Crear otro automóvil y asignarle el mismo motor
        Automovil auto2 = new Automovil("XYZ789", 2, "Honda", "Civic");
        auto2.setMotor(motor1);

        // Mostrar los datos de los automóviles
        System.out.println("Información del Automóvil 1:\n" + auto1.toString());
        System.out.println("\nInformación del Automóvil 2:\n" + auto2.toString());
    }
}
