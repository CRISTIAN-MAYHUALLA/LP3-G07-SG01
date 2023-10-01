package LP3_LAB03.ACTIVIDAD_02;

public class ContadorTest3 {
    public static void main(String[] args) {
        Contador c1 = new Contador(); // Usando el constructor sin argumentos
        Contador c2 = new Contador(5); // Usando el constructor con argumento

        c1.inc();
        c2.inc();

        System.out.println("Valor de c1: " + c1.getValor()); // Debería imprimir 11 (VALOR_INICIAL + inc())
        System.out.println("Valor de c2: " + c2.getValor()); // Debería imprimir 5 (valor inicial 5 + inc())
        System.out.println("Valor acumulador: " + Contador.acumulador()); // Debería imprimir 16 (11 + 5)
        System.out.println("Número de contadores creados: " + Contador.getNContadores()); // Debería imprimir 2
        System.out.println("Último contador creado con valor inicial: " + Contador.getUltimoContador()); // Debería imprimir 5
    }
}
