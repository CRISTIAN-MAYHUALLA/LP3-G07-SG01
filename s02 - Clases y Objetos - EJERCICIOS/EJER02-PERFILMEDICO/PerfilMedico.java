import java.util.Scanner;

class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private char sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura; // en centímetros
    private double peso; // en kilogramos
    
    public PerfilMedico(String primerNombre, String apellido, char sexo, int diaNacimiento, int mesNacimiento,
                        int anioNacimiento, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }
    
    // Métodos Getters
    public String getPrimerNombre() {
        return primerNombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public int getDiaNacimiento() {
        return diaNacimiento;
    }
    
    public int getMesNacimiento() {
        return mesNacimiento;
    }
    
    public int getAnioNacimiento() {
        return anioNacimiento;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getPeso() {
        return peso;
    }
    
    // Método para calcular la edad
    public int calcularEdad(int anioActual) {
        return anioActual - anioNacimiento;
    }
    
    // Método para calcular el Índice de Masa Corporal (IMC)
    public double calcularIMC() {
        return peso / ((altura / 100) * (altura / 100));
    }
    
    // Método para calcular la Frecuencia Cardiaca Máxima (FCM)
    public int calcularFCM() {
        return 220 - calcularEdad(2023);
    }

    public class Main {
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("Ingrese el primer nombre:");
            String primerNombre = scanner.nextLine();
        
            System.out.println("Ingrese el apellido:");
            String apellido = scanner.nextLine();
        
            System.out.println("Ingrese el sexo (M/F):");
            char sexo = scanner.nextLine().charAt(0);
        
            System.out.println("Ingrese el día de nacimiento:");
            int diaNacimiento = scanner.nextInt();
        
            System.out.println("Ingrese el mes de nacimiento:");
            int mesNacimiento = scanner.nextInt();
        
            System.out.println("Ingrese el año de nacimiento:");
            int anioNacimiento = scanner.nextInt();
        
            System.out.println("Ingrese la altura en centímetros:");
            double altura = scanner.nextDouble();
        
            System.out.println("Ingrese el peso en kilogramos:");
            double peso = scanner.nextDouble();
        
            PerfilMedico perfil = new PerfilMedico(primerNombre, apellido, sexo, diaNacimiento, mesNacimiento, anioNacimiento, altura, peso);
        
            System.out.println("\nInformación del perfil médico:");
            System.out.println("Nombre: " + perfil.getPrimerNombre() + " " + perfil.getApellido());
            System.out.println("Sexo: " + perfil.getSexo());
            System.out.println("Fecha de Nacimiento: " + perfil.getDiaNacimiento() + "/" + perfil.getMesNacimiento()+ "/" + perfil.getAnioNacimiento());
            System.out.println("Altura: " + perfil.getAltura() + " cm");
            System.out.println("Peso: " + perfil.getPeso() + " kg");
        
            int edad = perfil.calcularEdad(2023);
            double imc = perfil.calcularIMC();
            int fcm = perfil.calcularFCM();
        
            System.out.println("\nEdad: " + edad + " años");
            System.out.println("Índice de Masa Corporal (IMC): " + imc);
            System.out.println("Frecuencia Cardiaca Máxima (FCM): " + fcm + " bpm");
            
            scanner.close();
        }

    }

}

