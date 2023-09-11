package LP3_LAB04.EJERCICIO_01;

public class Contacto {
    private String nombre;
    private String telefono;
    private String direccion;
    //metodo:
    public Contacto(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.telefono=telefono;
        this.direccion=direccion;


    }
    
    // metodo get y set del atributo nombre:
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    public String getNombre(){
        return nombre;
    }
    //metodo get y set del atributo telefono:

    public void setTelefono(String _telefono){
        this.telefono = _telefono;
    }
    public String getTelefono(){
        return telefono;
    }
    //metodo get y set del atributo direccion:

    public void setDireccion(String _direccion){
        this.direccion = _direccion;
    }
    public String getDireccion(){
        return direccion;
    }

    @Override
    public String toString(){
        return "Nombre "+ nombre + ", telefono " + telefono + ", Direccion " + direccion;
    }

    
}

