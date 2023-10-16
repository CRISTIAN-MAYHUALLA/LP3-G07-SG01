package FASE_02.LP3_LAB06.EJER_01;

public class ProgramaFiguras {
    public static void main(String[] args) {
        // Crear un arreglo de referencias a objetos Figura
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Cuadrado(4.0);
        figuras[2] = new Esfera(3.0);
        figuras[3] = new Cubo(2.0);

        // Procesar y mostrar información sobre cada figura
        for (Figura figura : figuras) {
            figura.obtenerDescripcion();
            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
                System.out.println("Area: " + figuraBidimensional.obtenerArea());
            } else if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
                System.out.println("Area Superficial: " + figuraTridimensional.obtenerArea());
                System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen());
            }
            System.out.println("---------------");
        }
    }
}
