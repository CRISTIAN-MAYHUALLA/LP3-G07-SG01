
import java.util.Scanner;

class CuentaBanco {
        private String titular;
        private double cantidad;
    
        public CuentaBanco(String titular) {
            this.titular = titular;
            this.cantidad = 0.0;
    }
    
        public CuentaBanco(String titular, double cantidadInicial) {
            this.titular = titular;
            if (cantidadInicial >= 0) {
                this.cantidad = cantidadInicial;
            } else {
                this.cantidad = 0.0;
        }
    }
    
        public String getTitular() {
            return titular;
    }
    
        public void setTitular(String titular) {
            this.titular = titular;
    }
    
        public double getCantidad() {
            return cantidad;
    }
    
        public void ingresar(double cantidad) {
            if (cantidad > 0) {
                this.cantidad += cantidad;
                System.out.println("Se ha ingresado $" + cantidad + " a la cuenta.");
            } else {
                System.out.println("La cantidad ingresada debe ser positiva.");
        }
    }
    
        public void retirar(double cantidad) {
            if (cantidad > 0) {
                if (this.cantidad >= cantidad) {
                    this.cantidad -= cantidad;
                    System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
                } else {
                    System.out.println("Saldo insuficiente. Se retira $" + this.cantidad + " (saldo actual) de la cuenta.");
                    this.cantidad = 0.0;
                }
            } else {
                System.out.println("La cantidad retirada debe ser positiva.");
        }
    }
    
        @Override
        public String toString() {
            return "Titular: " + titular + "\nCantidad: $" + cantidad;
    }


    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Ingrese el nombre del titular de la cuenta:");
            String titular = scanner.nextLine();
    
            System.out.println("Ingrese la cantidad inicial (opcional, dejar en blanco si no desea ingresar una cantidad inicial):");
            String cantidadInicialStr = scanner.nextLine();
                double cantidadInicial = 0.0;
                if (!cantidadInicialStr.isEmpty()) {
                    cantidadInicial = Double.parseDouble(cantidadInicialStr);
                }
    
            CuentaBanco cuenta = new CuentaBanco(titular, cantidadInicial);
    
            System.out.println("\nInformación de la cuenta:\n" + cuenta);
    
            int opcion;
            do {
                System.out.println("\nMenú:");
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Mostrar saldo");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
    
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la cantidad a ingresar: ");
                        double cantidadIngresar = scanner.nextDouble();
                        cuenta.ingresar(cantidadIngresar);
                    break;
                    
                    case 2:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double cantidadRetirar = scanner.nextDouble();
                        cuenta.retirar(cantidadRetirar);
                    break;
             
                    case 3:
                        System.out.println("Saldo actual: $" + cuenta.getCantidad());
                    break;
                    
                    case 4:
                        System.out.println("Saliendo...");
                    break;
                    
                    default:
                        System.out.println("Opción inválida. Seleccione una opción válida.");
                }

            } while (opcion != 4);
    
        scanner.close();
        }
    }    
}

