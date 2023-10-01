class Manejador {
    // Método de clase para calcular el área de un rectángulo
    public static double area(Rectangulo rectangulo) {
        return rectangulo.getBase() * rectangulo.getAltura();
    }

    // Método de clase para calcular el perímetro de un rectángulo
    public static double perimetro(Rectangulo rectangulo) {
        return 2 * (rectangulo.getBase() + rectangulo.getAltura());
    }

    // Método de clase para desplazar un rectángulo en el eje X
    public static void moverX(Rectangulo rectangulo, double puntos) {
        Coordenada esquina = rectangulo.getEsquinaInferiorIzquierda();
        esquina.setX(esquina.getX() + puntos);
    }

    // Método de clase para desplazar un rectángulo en el eje Y
    public static void moverY(Rectangulo rectangulo, double puntos) {
        Coordenada esquina = rectangulo.getEsquinaInferiorIzquierda();
        esquina.setY(esquina.getY() + puntos);
    }
}
