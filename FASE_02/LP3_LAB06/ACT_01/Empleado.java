package FASE_02.LP3_LAB06.ACT_01;
public abstract class Empleado implements PorPagar{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String nombre, String apellido, String nss) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }
    //Metodos GETTER
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    @Override
    public double obtenerMontoPago() {
        return 0; // Método abstracto, pero debe implementarse en las subclases.
    }

    @Override
    public String toString() {
        return String.format("Empleado: %s %s\nNúmero de Seguro Social: %s\n", primerNombre, apellidoPaterno, numeroSeguroSocial);
    }
}
