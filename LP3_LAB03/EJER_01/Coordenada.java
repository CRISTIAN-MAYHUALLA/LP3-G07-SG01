class Coordenada {
    private int x;
    private int y;

    // Constructor sin argumentos, crea una coordenada en (0,0)
    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con argumentos, crea una coordenada con las coordenadas (x, y) proporcionadas
    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor de copia, crea una nueva coordenada copiando los valores de otra coordenada
    public Coordenada(Coordenada c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(double d) {
        this.x = (int) d;
    }

    public int getY() {
        return y;
    }

    public void setY(double d) {
        this.y = (int) d;
    }

    // Método para calcular la distancia entre esta coordenada y otra coordenada c
    public double distancia(Coordenada c) {
        int dx = this.x - c.getX();
        int dy = this.y - c.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método estático para calcular la distancia entre dos coordenadas c1 y c2
    public static double distancia(Coordenada c1, Coordenada c2) {
        int dx = c1.getX() - c2.getX();
        int dy = c1.getY() - c2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}








   