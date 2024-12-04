
package a_registroalumnoscolegio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


public class Colegio {
    private String nombre;
    private String direccion;
    private HashMap<Integer,Alumnos> registro;
    
public Colegio(String nombre, String direccion){
    this.nombre = nombre;
    this.direccion = direccion;
    this.registro = new HashMap();
}    
//------------------------------------------------------------------------------------------------------
public void agregarAlumno(Alumnos al){

    if(registro.containsKey(al.getLegajo())){
        System.out.print("No se pudo agregar el alumno con el legajo : "+al.getLegajo());
        System.out.print(" .El legajo está asignado a : "+registro.get(al.getLegajo()).getApellido());
     System.out.println(" "+registro.get(al.getLegajo()).getNombre());
    }else{
        registro.put(al.getLegajo(), al);
        System.out.println("Legajo agregado "+al.getLegajo());
    }
}
//-----------------------------------------------------------------------------------------------
public void quitarAlumno(int nroLeg){
    if(registro.containsKey(nroLeg)){
        registro.remove(nroLeg);
        System.out.println("Legajo eliminado :"+nroLeg);
    }else{
        System.out.println("No se encontro ningún legajo con ese número");
    }
}
//-----------------------------------------------------------------------------------------------
public void listarAlumnoAlfabeticamentePorApellido(){

 ArrayList<Alumnos> Alum = new ArrayList(registro.values());   
    Comparator<Alumnos> AlumnoAlfabeticamentePorApellido = new Comparator<Alumnos>(){@Override
    
    public int compare(Alumnos p1, Alumnos p2){
        return p1.getApellido().compareTo(p2.getApellido());
    }
    };   
    Collections.sort(Alum, AlumnoAlfabeticamentePorApellido);
    
    for (Alumnos p : Alum){
        System.out.println(p);
    }
}
//-----------------------------------------------------------------------------------------------
public void listarAlumnosPorLetra(char c){
    
    ArrayList<Alumnos> Alum = new ArrayList(registro.values());   
    for (Alumnos p : Alum){
        if (p.getApellido().startsWith(Character.toString(Character.toUpperCase(c)))){
        System.out.println(p);
        } 
    }
}
}// fin class
