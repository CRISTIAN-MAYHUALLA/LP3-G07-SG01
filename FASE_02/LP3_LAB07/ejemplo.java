package lp3_7;

public class ejemplo {
    public static void main(String[] args) {
        double[] v = new double[15];
        try {
            acceso(v, 16);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static double acceso(double[] v, int j) throws Exception {
        if (j >= 0 && j < v.length) {
            return v[j];
        } else {
            throw new Exception("El índice " + j + " no existe en el vector");
        }
    }
}
