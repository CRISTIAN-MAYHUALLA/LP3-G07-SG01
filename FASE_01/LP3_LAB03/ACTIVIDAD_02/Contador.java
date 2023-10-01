package LP3_LAB03.ACTIVIDAD_02;

public class Contador {
    static int acumulador = 0;
    final static int VALOR_INICIAL = 10;
    private int valor;
    private static int nContadores = 0;
    private static int ultimoContador; // Variable de clase para almacenar el valor inicial del último contador creado.

    public static int acumulador() {
        return acumulador;
    }

    public Contador(int valor) {
        this.valor = valor;
        acumulador += valor;
        nContadores++;
        ultimoContador = valor; // Actualizar el valor del último contador creado.
    }

    public Contador() {
        this(Contador.VALOR_INICIAL);
    }

    public void inc() {
        valor++;
        acumulador++;
    }

    public int getValor() {
        return this.valor;
    }

    public static int getNContadores() {
        return nContadores;
    }

    public static int getUltimoContador() {
        return ultimoContador;
    }
}

