import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);

        do {
            vida++;
            System.out.println("Vida:" + vida + "\t¿Cuál es el número secreto?");
            rp = sc.nextInt();
            if (rp == 4) {
                fl = true;
            }
        } while (vida < 3 && !fl);

        if (fl) {
            if (vida == 1) {
                System.out.println("¡Adivinaste con 1 vida! Tu premio es un chocolate.");
            } else if (vida == 2) {
                System.out.println("¡Adivinaste con 2 vidas! Tu premio es una zanahoria.");
            } else {
                System.out.println("¡Adivinaste! Tu premio es un carbon.");
            }
        } else {
            System.out.println("Perdiste. Tu premio es un caramelo.");
        }

        System.out.println("Usaste " + vida + " vidas.");
        
    }
    
}
