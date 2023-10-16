package FASE_02.LP3_LAB06.EJER_01;

// Clase base Figura
class Figura {
    // Método para obtener la descripción de la figura
    public void obtenerDescripcion() {
        System.out.println("Esta es una figura genérica.");
    }
}
// Clase FiguraBidimensional que hereda de Figura
class FiguraBidimensional extends Figura {
    // Método para calcular el área de la figura bidimensional (debe ser implementado en las subclases)
    public double obtenerArea() {
        return 0.0;
    }

    // Sobrescribimos el método de la clase base para mostrar una descripción específica
    @Override
    public void obtenerDescripcion() {
        System.out.println("Esta es una figura bidimensional.");
    }
}
// Clase FiguraTridimensional que hereda de Figura
class FiguraTridimensional extends Figura {
    // Método para calcular el área superficial de la figura tridimensional (debe ser implementado en las subclases)
    public double obtenerArea() {
        return 0.0;
    }

    // Método para calcular el volumen de la figura tridimensional (debe ser implementado en las subclases)
    public double obtenerVolumen() {
        return 0.0;
    }

    // Sobrescribimos el método de la clase base para mostrar una descripción específica
    @Override
    public void obtenerDescripcion() {
        System.out.println("Esta es una figura tridimensional.");
    }
}

// Implementación de subclases concretas de FiguraBidimensional y FiguraTridimensional
class Circulo extends FiguraBidimensional {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
}

class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return lado * lado;
    }
}

class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }
}

class Cubo extends FiguraTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        return lado * lado * lado;
    }
}
