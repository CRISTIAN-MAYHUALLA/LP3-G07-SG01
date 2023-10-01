public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);

        // Crear clientes
        Persona cliente1 = new Persona(1, "Juan", "Perez", 'A');
        Persona cliente2 = new Persona(2, "Maria", "Lopez", 'B');
        Persona cliente3 = new Persona(3, "Carlos", "Gomez", 'A');

        // Agregar clientes al banco
        bcp.agregarCliente(cliente1);
        bcp.agregarCliente(cliente2);
        bbva.agregarCliente(cliente3);

        // Mostrar información de los bancos y sus clientes
        System.out.println("Información del Banco BCP:");
        System.out.println(bcp.toString());

        System.out.println("Información del Banco BBVA:");
        System.out.println(bbva.toString());

        // Buscar cliente
        System.out.println("Buscar cliente en el Banco BCP:");
        if (bcp.buscarCliente(cliente1)) {
            System.out.println("El cliente Juan Perez existe en el Banco BCP.");
        } else {
            System.out.println("El cliente Juan Perez no existe en el Banco BCP.");
        }

        // Dar de baja un cliente
        Persona clienteEliminado = bcp.darBajaCliente(cliente2);
        if (clienteEliminado != null) {
            System.out.println("Cliente eliminado del Banco BCP: " + clienteEliminado.toString());
        } else {
            System.out.println("El cliente no existe en el Banco BCP.");
        }

        // Listar clientes por tipo
        bcp.clientesTipo('A');
    }
}
