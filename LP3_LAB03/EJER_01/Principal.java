public class Principal {
    public static void main(String[] args) {
        // Crear dos objetos de la clase Coordenada con valores iniciales
        Coordenada c1 = new Coordenada(1, 2);
        Coordenada c2 = new Coordenada(4, 6);

        // Crear dos objetos de la clase Rectangulo con valores iniciales
        Rectangulo rectangulo1 = new Rectangulo(5, 3);
        Rectangulo rectangulo2 = new Rectangulo(4, 2, c1);

        // Imprimir información sobre los rectángulos
        System.out.println(rectangulo1.toString());
        System.out.println(rectangulo2.toString());

        // Calcular y mostrar la distancia entre las coordenadas c1 y c2
        double distancia = c1.distancia(c2);
        System.out.println("Distancia entre las coordenadas c1 y c2: " + distancia);

        // Mover el rectángulo1 en el eje X y el rectángulo2 en el eje Y
        Manejador.moverX(rectangulo1, 2);
        Manejador.moverY(rectangulo2, 1);

        // Imprimir información sobre los rectángulos después de moverlos
        System.out.println("Rectángulo 1 después de mover en X: " + rectangulo1.toString());
        System.out.println("Rectángulo 2 después de mover en Y: " + rectangulo2.toString());
    }
}

