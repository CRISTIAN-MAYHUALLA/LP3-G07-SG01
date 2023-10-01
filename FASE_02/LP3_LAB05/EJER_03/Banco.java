import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private List<Persona> clientes;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Persona persona) {
        clientes.add(persona);
    }

    public Persona darBajaCliente(Persona persona) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).equals(persona)) {
                return clientes.remove(i);
            }
        }
        return null; // Si no se encuentra el cliente, retornar null
    }

    public void clientesTipo(char tipo) {
        System.out.println("Clientes de tipo '" + tipo + "' en el Banco " + nombre + ":");
        for (Persona cliente : clientes) {
            if (cliente.getTipoCliente() == tipo) {
                System.out.println(cliente.toString());
            }
        }
    }

    // Resto de los métodos y toString() como se solicita en la actividad
}
