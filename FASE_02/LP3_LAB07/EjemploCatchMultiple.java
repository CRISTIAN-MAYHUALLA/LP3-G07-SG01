package lp3_7;

public class EjemploCatchMultiple {
    public static void main(String[] args) {
        try {
            int[] numeros = { 1, 2, 3 };
            int indice = 3;
            int resultado = dividir(numeros, indice);
            System.out.println("Resultado: " + resultado);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static int dividir(int[] numeros, int indice) {
        return numeros[indice] / 0;
    }
}
