public abstract class FiguraGeometrica {
    private String nombre;

    // Constructor
    public FiguraGeometrica(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    // Método abstracto para calcular el área (debe ser implementado por las subclases)
    abstract public double area();

    // Método final para comparar el área de dos figuras geométricas
    final public boolean mayorQue(FiguraGeometrica otra) {
        return this.area() > otra.area();
    }

    // Método final para obtener una representación en cadena de la figura
    final public String toString() {
        return this.nombre + " con area " + this.area();
    }
}
