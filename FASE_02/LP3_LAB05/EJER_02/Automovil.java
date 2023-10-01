public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil(String placa, int numPuertas, String marca, String modelo, Motor motor) {
        this(placa, numPuertas, marca, modelo);
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automóvil:\n");
        sb.append("Placa: ").append(placa).append("\n");
        sb.append("Número de puertas: ").append(numPuertas).append("\n");
        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        if (motor != null) {
            sb.append("Motor:\n");
            sb.append(motor.toString());
        }
        return sb.toString();
    }
}
