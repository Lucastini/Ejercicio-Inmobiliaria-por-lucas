
package negocio;

public class Inmobiliaria {
    private String razonSocial;
    private Alquiler alquileres[];
    
    public Inmobiliaria(){
        razonSocial="Sin Razon Social";
        alquileres=new Alquiler[100];
    }
    public Inmobiliaria(String rz){
        razonSocial=rz;
        alquileres=new Alquiler[100];
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getRazonSocial(){
        return razonSocial;
    }
    public boolean addAlquiler(Alquiler a){
        boolean aux=false;
        for(int i=0;i<alquileres.length;i++)
            if(alquileres[i]==null){
                alquileres[i]=a;
                aux=true;
                break;
            }
        return aux;
    }
    public String getAlquileres(){
        String aux="Datos de Alquileres: ";
        String aux2=aux;
        for(int i=0;i<alquileres.length;i++)
            if(alquileres[i]!=null)
                aux+=alquileres[i].toString();
        if(aux.equals(aux2))
            aux+="La inmobiliaraia aun no registra alquileres cargados";
        return aux;
    }
    public boolean removeAlquiler(int codigoAlquiler){
        boolean aux=false;
        for(int i=0;i<alquileres.length;i++)
            if(alquileres[i]!=null&&alquileres[i].getCodigoAlquiler()==codigoAlquiler){
                alquileres[i]=null;
                aux=true;
                break;
            }
        return aux;
    }  
    public Alquiler[] seleccionAlquileresDepartamentos(){
        Alquiler aux[]=new Alquiler[100];
        for(int i=0;i<alquileres.length;i++)
            if(alquileres[i]!=null&&alquileres[i].getInmueble() instanceof Departamento)
                for(int j=0;j<aux.length;j++)
                    if(aux[j]==null){
                        aux[j]=alquileres[i];
                        break;
                    }
        return aux;
    }
    public String detalleSeleccionAlquileresDepartamentos(){
        String aux="Datos de alquileres de departamentos: ";
        String aux2=aux;
        for(int i=0;i<seleccionAlquileresDepartamentos().length;i++)
            if(seleccionAlquileresDepartamentos()[i]!=null)
                aux+=seleccionAlquileresDepartamentos()[i].toString();
        if(aux.equals(aux2))
            aux+="La inmobiliaraia aun no registra alquileres de departamentos cargados";
        return aux;
    }
    public float importeTotalAlquileres(){
        float imp=0f;
        for(int i=0;i<alquileres.length;i++)
            if(alquileres[i]!=null)
                imp+=alquileres[i].getInmueble().importeAlquiler();
        return imp;            
    }
    public String todosLosDatos(){
        return "Inmobiliaria nombre: "+razonSocial+"\n"+getAlquileres()+"\nRecaudacion total alquileres: $"+importeTotalAlquileres();
    }
    
}
