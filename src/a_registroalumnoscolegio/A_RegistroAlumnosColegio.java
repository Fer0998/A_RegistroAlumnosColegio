
package a_registroalumnoscolegio;

public class A_RegistroAlumnosColegio {

    public static void main(String[] args) {
    
        Colegio colegio = new Colegio("San Agustín","Av Paso 222");
        
        Alumnos chico1 = new Alumnos(3333,"Julian","López",2023);
        Alumnos chico2 = new Alumnos(442,"Analía","Román",2022);
        Alumnos chico3 = new Alumnos(3634,"Sofía","Espindola",2024); 
        Alumnos chico4 = new Alumnos(8764,"Ramiro","Sorgo",2020);
        
        colegio.agregarAlumno(chico1);
        colegio.agregarAlumno(chico2);
        colegio.agregarAlumno(chico3);
        colegio.agregarAlumno(chico4);
        
        colegio.listarAlumnosPorLetra('A');

        
    }
    
}//fin class
