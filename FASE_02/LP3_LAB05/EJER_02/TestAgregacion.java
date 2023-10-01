public class TestAgregacion {
    public static void main(String[] args) {
        // Crear un motor
        Motor motor1 = new Motor(12345, 3000);

        // Crear un automóvil con motor
        Automovil auto1 = new Automovil("ABC123", 4, "Toyota", "Corolla", motor1);

        // Crear otro automóvil sin motor
        Automovil auto2 = new Automovil("XYZ789", 2, "Honda", "Civic");

        // Mostrar información de los automóviles
        System.out.println("Información del Automóvil 1:");
        System.out.println(auto1.toString());

        System.out.println("\nInformación del Automóvil 2:");
        System.out.println(auto2.toString());
    }
}
