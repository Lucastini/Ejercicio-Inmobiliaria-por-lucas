
package negocio;

public class Casa extends Inmueble {
    private float supDescubierta;
    
    public Casa(){
        super();
        supDescubierta=0;
    }
    public Casa(float supCu,float supdes){
        super(supCu);
        supDescubierta=supdes;
    }
    public void setSupDescubierta(float supDescubierta) {
        this.supDescubierta = supDescubierta;
    }
    public float getSupDescubierta() {
        return supDescubierta;
    }
    public String toString(){
        return "Casa, "+super.toString()+", Superficie descubierta: "+supDescubierta+"m2";
    }
    @Override
    public float importeAlquiler(){
        return super.importeAlquiler()+10*supDescubierta;
    }
    public String todosLosDatos(){
        return toString()+", Importe total alquiler: $"+importeAlquiler();
    }
            
            
}
