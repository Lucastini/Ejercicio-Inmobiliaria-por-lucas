
package negocio;

public class Principal {

    public static void main(String[] args) {
        Inmobiliaria i=new Inmobiliaria("Tini Inmuebles");
        System.out.println(i.todosLosDatos());
        System.out.println("\nIngresando alquiler: "+i.addAlquiler(new Alquiler(new Cliente("Aldo", "Sanchez", "26547899"), new Departamento(40, 2, 1500))));
        System.out.println("\n"+i.todosLosDatos());
        System.out.println("\nIngresando alquiler: "+i.addAlquiler(new Alquiler(new Cliente("Edgar", "Lutre", "24547899"), new Casa(75, 100))));
        System.out.println("\n"+i.todosLosDatos());
        System.out.println("\nIngresando alquiler: "+i.addAlquiler(new Alquiler(new Cliente("Maria Jose", "Resina", "30547899"), new Departamento(60, 0, 2500))));
        System.out.println("\n"+i.todosLosDatos());
        System.out.println("\nQuitando alquiler inmueble codigo: "+i.removeAlquiler(3));
        System.out.println("\n"+i.todosLosDatos());
        System.out.println("\nAlquileres de departamentos: \n"+i.detalleSeleccionAlquileresDepartamentos());
        
    }
}
