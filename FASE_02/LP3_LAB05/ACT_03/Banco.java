public class Banco{
    private String nombre;
    private Persona[] clientes;
    private int numClientes;
    
    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.numClientes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCliente(Persona persona) {
        // Verificar si el cliente ya existe en el banco
        if (!buscarCliente(persona)) {
            // Verificar si hay espacio en el arreglo de clientes
            if (numClientes < clientes.length) {
                clientes[numClientes] = persona;
                numClientes++;
            } else {
                System.out.println("No se puede agregar más clientes, el banco está lleno.");
            }
        } else {
            System.out.println("El cliente ya existe en el banco.");
        }
    }

    public Persona darBajaCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(persona)) {
                Persona clienteEliminado = clientes[i];
                // Mover los clientes restantes hacia arriba en el arreglo
                for (int j = i; j < numClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[numClientes - 1] = null; // Eliminar la última referencia
                numClientes--;
                return clienteEliminado;
            }
        }
        return null; // Si no se encuentra el cliente, retornar null
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public void clientesTipo(char tipo) {
        System.out.println("Clientes de tipo '" + tipo + "':");
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getTipo() == tipo) {
                System.out.println(clientes[i].toString());
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Banco: ").append(nombre).append("\n");
        sb.append("Clientes:\n");
        for (int i = 0; i < numClientes; i++) {
            sb.append(clientes[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
