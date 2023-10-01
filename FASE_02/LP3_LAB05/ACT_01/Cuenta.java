public class Cuenta{
    private int numero;
    private double saldo;
    
    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cuenta(int numero) {
        this(numero, 0);
    }

    // Setter y getter para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Número de cuenta: " + numero + "\nSaldo: " + saldo;
    }
}

public class TestComposicion {
    public static void main(String[] args) {
        Persona persona1 = new Persona(1, "Juan", "Perez");
        Persona persona2 = new Persona(2, "Maria", "Lopez");

        // Asignar saldos a las cuentas
        persona1.getCuenta().setSaldo(1000.0);
        persona2.getCuenta().setSaldo(500.0);

        // Mostrar información de las personas
        System.out.println("Información de la Persona 1:");
        System.out.println(persona1.toString());
        System.out.println("\nInformación de la Persona 2:");
        System.out.println(persona2.toString());
    }
}

