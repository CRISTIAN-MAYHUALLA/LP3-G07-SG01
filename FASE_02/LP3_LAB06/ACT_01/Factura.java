package FASE_02.LP3_LAB06.ACT_01;
public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cuenta); // valida y almacena la cantidad
        establecerPrecioPorArticulo(precio); // valida y almacena el precio por argumento
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerCantidad(int cuenta) {
        if (cuenta >= 0) {
            cantidad = cuenta;
        } else {
            cantidad = 0;
        }
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void establecerPrecioPorArticulo(double precio) {
        if (precio >= 0.0) {
            precioPorArticulo = precio;
        } else {
            precioPorArticulo = 0.0;
        }
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return String.format("Factura: %s\nDescripción: %s\nCantidad: %d\nPrecio por Artículo: $%.2f\n",
                numeroPieza, descripcionPieza, cantidad, precioPorArticulo);
    }
}

