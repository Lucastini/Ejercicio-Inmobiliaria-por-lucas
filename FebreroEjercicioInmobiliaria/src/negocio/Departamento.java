
package negocio;

public class Departamento extends Inmueble {
    private int piso;
    private float montoExpensas;
    
    Departamento(){
        super();
        piso=-1;
        montoExpensas=0f;
    }
    Departamento(float supCubierta,int piso,float montoExp){
        super(supCubierta);
        this.piso=piso;
        montoExpensas=montoExp;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    public void setMontoExpensas(float montoExpensas) {
        this.montoExpensas = montoExpensas;
    }
    public int getPiso() {
        return piso;
    }
    public float getMontoExpensas() {
        return montoExpensas;
    }
    public String detallePiso(){
        String aux;
        switch(piso){
            case 0: aux="Planta baja";break;
            case 1: aux="Primer piso";break;
            case 2: aux="Segundo piso";break;
            case 3: aux="Tercer piso";break;
            case 4: aux="Cuarto piso";break;
            case 5: aux="Quinto piso";break;
            case 6: aux="Sexto piso";break;
            case 7: aux="Septimo piso";break;
            case 8: aux="Octavo piso";break;
            case 9: aux="Noveno piso";break;
            case 10: aux="Decimo piso";break;
            default: aux="Valor de planta invalido o no especificado";
        }
        return aux;
    }
    public String toString(){
        return "Departamento, "+super.toString()+", "+detallePiso()+", Monto expensas: $"+montoExpensas;
    }
    public float incrementoAlquilerXPiso(){
        float incrXPiso=0f;
        if(piso>=0)
            incrXPiso=super.importeAlquiler()*0.05f*piso;
        return incrXPiso;
    }
    @Override
    public float importeAlquiler(){
        return super.importeAlquiler()+incrementoAlquilerXPiso()+montoExpensas;
    }
    public String todosLosDatos(){
        return toString()+", Importe total alquiler: $"+importeAlquiler();
    }
    
    
}
