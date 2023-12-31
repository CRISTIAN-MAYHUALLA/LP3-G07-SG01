package FASE_02.LP3_LAB06.ACT_01;

public class Prestamo implements PorPagar {
    private int numeroDeCuotas;
    private double montoDeCuota;

    public Prestamo(int numeroDeCuotas, double montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoDeCuota() {
        return montoDeCuota;
    }

    public void setMontoDeCuota(double montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }

    @Override
    public double obtenerMontoPago() {
        return numeroDeCuotas * montoDeCuota;
    }

    @Override
    public String toString() {
        return "Prestamo Número de Cuotas=" + numeroDeCuotas + ", Monto de Cuota=" + montoDeCuota;
    }
}
