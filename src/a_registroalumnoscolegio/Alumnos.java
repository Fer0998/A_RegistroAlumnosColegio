
package a_registroalumnoscolegio;


public class Alumnos {
    
    private int legajo;
    private String nombre;
    private String apellido;
    private int añoCursado;

    public Alumnos(int legajo, String nombre, String apellido, int añoCursado) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoCursado = añoCursado;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAñoCursado() {
        return añoCursado;
    }

    public void setAñoCursado(int añoCursado) {
        this.añoCursado = añoCursado;
    }
    
   @Override 
   public String toString(){
   
    return "---------------------------------"+"\n" +
           " Legajo      = " + legajo + "\n" +
           " Nombre      = " + nombre + "\n" +
           " Apellido    = " + apellido + "\n" +
           " Año Cursado = " + añoCursado + "\n" +
           "---------------------------------"+"\n" ;      
   }    
}// fin class
