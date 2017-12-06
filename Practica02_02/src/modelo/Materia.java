
package modelo;

/**
 *
 * @author Alex Reinoso
 */
public class Materia {
    
    private String nombre;
    private String nota;
    private String tema;

    public Materia(String nombre, String nota, String tema) {
        this.nombre = nombre;
        this.nota = nota;
        this.tema = tema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
    
}
