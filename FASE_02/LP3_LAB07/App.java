package lp3_7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static int cociente(int numerador, int denominador){
        return numerador / denominador;
    }
    public static void main(String[] args){
        Scanner explorador = new Scanner(System .in);
        boolean flag = true;
        do{
            try {
                System.out.print("introduzca un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.print("introduzca un denominador entero: ");
                int denominador = explorador.nextInt();

                int resultado = cociente (numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador,resultado);
                flag = false;

            }
            catch (InputMismatchException inputMismatchE) {
                System.out.printf("\nExcepcion : %s\n", inputMismatchE);
                explorador.nextLine();
                System.out.println("debe introducir entero. Intente de nuevo ...\n");
            }
            catch (ArithmeticException arithmeticE) {
                System.out.printf("\nExcepcion : %s\n" , arithmeticE);
                explorador.nextLine();
                System.out.println("Cero es un denominador invalido. Intente de nuevo ...\n");
            }
        }while(flag);
    
    } 
}
