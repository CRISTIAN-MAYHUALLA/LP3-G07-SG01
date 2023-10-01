public class Cuenta {
    private String numero;
    private double saldo;

    public Cuenta(String numero) {
        this.numero = numero;
        this.saldo = 50.0; // El saldo mínimo es de 50 soles por defecto
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo - cantidad >= 50.0) {
            saldo -= cantidad;
        }
    }

    // Resto de los métodos y toString() como se solicita en la actividad
}
