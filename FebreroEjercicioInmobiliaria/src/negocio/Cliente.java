
package negocio;

public class Cliente {
    private int legajo;
    private static int numC=1;
    private String apellido;
    private String nombre;
    private String dni;
    
    public Cliente(){
        legajo=numC;
        numC++;
        apellido="Sin apellido";
        nombre="Sin nombre";
        dni="Sin DNI";
    }
    public Cliente(String ape, String nom, String dni){
        legajo=numC;
        numC++;
        apellido=ape;
        nombre=nom;
        this.dni=dni;
    }
    public int getLegajo(){
        return legajo;
    }
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String toString(){
        return "Legajo Nº: "+legajo+", Nombre: "+nombre+", Apellido: "+apellido+", DNI: "+dni;
    }
    
    
}
