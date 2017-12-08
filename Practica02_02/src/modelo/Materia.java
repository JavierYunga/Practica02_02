
package modelo;

/**
 *
 * @author Alex Reinoso
 */
public class Materia {
    
    private String nombre;
    private int horas;
    private int creditos;

    public Materia(String nombre, int horas, int creditos) {
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

   
    
    
}
