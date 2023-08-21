import java.util.Scanner;

public class Principal {
	
		public static void main(String[] args) {
	         int vida, гр;
	         boolean fl = false;
	         vida = 0;
	         Scanner sc = new Scanner(System.in);
	         do {
	             vida ++;
	            System.out.println("Vida:"+ vida + "\t¿Cual es el número secreto 👀👀? ");
	             гр = sc.nextInt();
	             if (гр == 1234)
	                 fl = true;
	         }while(vida < 3 && !fl );
	         if (fl = true)
	            System.out.println("Adivinaste, FELICIDADEEEEEESSS ganaste un carro!!!!! ");
	         else
	            System.out.println("ups, perdiste, Vuelve a Intentarlo :) ");
	    }
	

}
