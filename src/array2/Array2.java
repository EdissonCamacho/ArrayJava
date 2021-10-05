
package array2;

import java.util.ArrayList;


public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList nombre = new ArrayList();
        ArrayList edad = new ArrayList();
        ArrayList profesion = new ArrayList();
        
        Profesion p = new Profesion(nombre,edad,profesion);
        
        profesion.add("Enfermera");
        profesion.add("Conductor");
        profesion.add("Ingeniero");
        
        edad.add(23);
        edad.add(25);
        edad.add(32);
        nombre.add("Carlos");
        nombre.add("Alberto");
        nombre.add("Marcos");
        
        
        p.setProfesion(profesion);
        p.setEdad(edad);
        p.setNombre(nombre);
        System.out.println("Elementos: "+p.getProfesion()); // sacar los atributos de la clase
        System.out.println("Indice "+p.CalcularEdadM()); //Sacar un atributo de una array de una clase
        System.out.println("Buscar Nombre "+p.RetornarNombre(2));
        System.out.println("Eliminar Nombre "+p.EliminarIndex(1));
        System.out.println("Elementos: "+p.getNombre());
        System.out.println("Contar cuantos elementos contiene por array: "+p.NumerodeIndixes("Profesion"));
        System.out.println("Verificar si contiene en una array un elemento: "+p.Contiene("Nombre", "Marcos"));
        
        System.out.println("Sacar index segun el array y contenido: "+p.BuscarIndex("Profesion", "Ingeniero"));
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
    
}
