public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");

        // Crear clientes
        Persona cliente1 = new Persona(1, "Juan", "Perez");
        Persona cliente2 = new Persona(2, "Maria", "Lopez", 'B');
        Persona cliente3 = new Persona(3, "Carlos", "Gomez", 'E');

        // Agregar clientes al banco
        bcp.agregarCliente(cliente1);
        bcp.agregarCliente(cliente2);
        bcp.agregarCliente(cliente3);

        // Mostrar información de los bancos y sus clientes
        System.out.println("Información del Banco " + bcp.getNombre() + ":");
        System.out.println(bcp.toString());

        // Dar de baja un cliente
        Persona clienteEliminado = bcp.darBajaCliente(cliente2);
        if (clienteEliminado != null) {
            System.out.println("Cliente eliminado del Banco " + bcp.getNombre() + ": " + clienteEliminado.toString());
        } else {
            System.out.println("El cliente no existe en el Banco " + bcp.getNombre() + ".");
        }

        // Listar clientes por tipo
        bcp.clientesTipo('E');
    }
}
