import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        //objetos usando el parametro
        Perro Fido= new Perro("marron","chihuahua");
        Perro Pelusa= new Perro("blanco", "pequines");
        


        Fido.increEdad(2);
        Pelusa.increEdad(5);
        
        //imprime enviando solo el objeto  [1]
        System.out.println(Fido);
        System.out.println(Pelusa);

        Diagnostico perro1= new Diagnostico();
        perro1.aptoVacunaA(Fido);
        perro1.aptoVacunaA(Pelusa);
        perro1.aptoVacunaB(Fido.getEdad(), Fido.peso, Fido.getTemp());
        perro1.aptoVacunaB(Pelusa.getEdad(), Pelusa.peso, Pelusa.getTemp());
        
        Scanner entrada = new Scanner(System.in);
        int edad;
        double temperatura;
        double peso;
        
        System.out.println("ingrese el peso");
        peso = entrada.nextDouble();
        System.out.println("ingrese la edad del perro ");
        edad = entrada.nextInt();
        System.out.println("ingrese la temperatura");
        temperatura = entrada.nextDouble();
        
        Fido.setEdad(edad);
        Fido.setTemp(temperatura);
        Fido.peso=peso;

        perro1.aptoVacunaA(Fido);
        
        
    } 
}