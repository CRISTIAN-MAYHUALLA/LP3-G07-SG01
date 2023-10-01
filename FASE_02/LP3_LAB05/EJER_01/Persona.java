public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private char tipoCliente;
    private Cuenta cuenta;

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = 'C'; // Por defecto, tipo de cliente es "C"
        asignarNumeroDeCuenta();
    }

    public Persona(int id, String nombre, String apellido, char tipoCliente) {
        this(id, nombre, apellido);
        setTipoCliente(tipoCliente);
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        if (tipoCliente == 'C' || tipoCliente == 'B' || tipoCliente == 'E') {
            this.tipoCliente = tipoCliente;
        } else {
            System.out.println("Tipo de cliente no válido. Se asigna por defecto 'C'.");
            this.tipoCliente = 'C';
        }
        asignarNumeroDeCuenta();
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    private void asignarNumeroDeCuenta() {
        int numeroInicial;
        if (tipoCliente == 'C') {
            numeroInicial = 1000;
        } else if (tipoCliente == 'B') {
            numeroInicial = 5000;
        } else {
            numeroInicial = 8000;
        }
        String numeroCuenta = tipoCliente + String.valueOf(numeroInicial + id);
        this.cuenta = new Cuenta(numeroCuenta);
    }

    // Resto de los métodos y toString() como se solicita en la actividad
}
