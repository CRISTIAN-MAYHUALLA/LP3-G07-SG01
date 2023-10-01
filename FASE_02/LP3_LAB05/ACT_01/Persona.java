public  class Persona{
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        // Determine el número de cuenta (por ejemplo, usando algún algoritmo o generación aleatoria)
        int numeroCuenta = generarNumeroDeCuenta();
        this.cuenta = new Cuenta(numeroCuenta);
    }

    // Setter y getter para la cuenta
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nCuenta: " + cuenta.toString();
    }

    // Método para generar un número de cuenta ficticio
    private int generarNumeroDeCuenta() {
        // Aquí puedes implementar la lógica para generar un número de cuenta único
        // Esto es solo un ejemplo, puedes hacerlo de manera más adecuada
        return (int) (Math.random() * 10000);
    }
}
