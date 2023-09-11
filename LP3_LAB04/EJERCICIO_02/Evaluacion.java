package LP3_LAB04.EJERCICIO_02;

public class Evaluacion {
    private String sexo;
    private String trabajo;
    private double sueldo;

    //metodo
    public Evaluacion(String sexo, String trabajo, double sueldo){
        this.sexo = sexo;
        this.trabajo=trabajo;
        this.sueldo= sueldo;
    }

    //-------------
    public void setSexo(String _sexo){
        this.sexo= _sexo;
    }
    public String getSexo(){
        return sexo;
    }

    //-------------
    public void setTrabajo(String _trabajo){
        this.trabajo = _trabajo;
    }
    public String getTrabajo(){
        return trabajo;
    }

    //---------------
    public void setSueldo(String _sueldo){
        this.sexo= _sueldo;
    }
    public double getSueldo(){
        return sueldo;
    }

}
