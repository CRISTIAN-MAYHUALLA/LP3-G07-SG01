class Rectangulo {
    private double base;
    private double altura;
    private String color;
    private static String ultimoColor = "verde";
    private Coordenada esquinaInferiorIzquierda;

    // Constructor que crea un rectángulo con base y altura, con vértice inferior izquierdo en (0,0)
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.color = asignarColor();
        this.esquinaInferiorIzquierda = new Coordenada(0, 0);
    }

    // Constructor que crea un rectángulo con base, altura y coordenada de vértice inferior izquierdo proporcionados
    public Rectangulo(double base, double altura, Coordenada esquinaInferiorIzquierda) {
        this.base = base;
        this.altura = altura;
        this.color = asignarColor();
        this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
    }

    private String asignarColor() {
        if (ultimoColor.equals("verde")) {
            ultimoColor = "amarillo";
        } else {
            ultimoColor = "verde";
        }
        return ultimoColor;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }

    public Coordenada getEsquinaInferiorIzquierda() {
        return esquinaInferiorIzquierda;
    }

    @Override
    public String toString() {
        return "Rectángulo - Base: " + base + ", Altura: " + altura + ", Color: " + color;
    }
}




