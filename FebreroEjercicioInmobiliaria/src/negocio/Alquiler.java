
package negocio;

public class Alquiler {
    private int codAlquiler;
    private static int cod=1;
    private Cliente cliente;
    private Inmueble inmueble;
    
    public Alquiler(Cliente cli, Inmueble in){
        codAlquiler=cod;
        cod++;
        cliente=cli;
        inmueble=in;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Inmueble getInmueble() {
        return inmueble;
    }
    public int getCodigoAlquiler(){
        return codAlquiler;
    }
    public String detalleTipoInmueble(){
        String tipinm="Sin dato";
        if(inmueble instanceof Departamento)
            tipinm="Departamento";
        if(inmueble instanceof Casa)
            tipinm="Casa";
        return tipinm;
    }
    public String toString(){
        return "Alquiler Codigo: "+codAlquiler+"\nCliente: "+cliente.toString()+"\nInmueble: "+inmueble.todosLosDatos();
    }
    
    
}
