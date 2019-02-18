
package negocio;

public class Inmueble {
    private int codigoInmueble;
    private static int nroI=1;
    private float supCubierta;
    
    public Inmueble(){
        codigoInmueble=nroI;
        nroI++;
        supCubierta=0f;
    }
    public Inmueble(float sup){
        codigoInmueble=nroI;
        nroI++;
        supCubierta=sup;
    }
    public void setSupCubierta(float sup){
        supCubierta=sup;
    }
    public float getSupCubierta(){
        return supCubierta;
    }
    public int getCodigoInmueble(){
        return codigoInmueble;
    }
    public String toString(){
        return "Codigo de Inmueble: "+codigoInmueble+", Superficie cubierta: "+supCubierta+"m2";
    }
    public float multiplicador(int factor){
        return supCubierta*(float)factor;
    }
    public float importeAlquiler(){
        return 20*supCubierta;
    }
    public String todosLosDatos(){
        return toString();
    }
       
}
