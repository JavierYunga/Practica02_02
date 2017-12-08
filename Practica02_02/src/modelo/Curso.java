
package modelo;

/**
 *
 * @author Alex Reinoso
 */
public class Curso {
    
    private String nombre;
    private String numEstudiantes;   

    private Docente docente;
    private Materia materia;

    public Curso(String nombre, String numEstudiantes, Docente docente, Materia materia) {
        this.nombre = nombre;
        this.numEstudiantes = numEstudiantes;
        this.docente = docente;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(String numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return nombre+" " +numEstudiantes+" " +materia.getNombre()+" "+docente.getNombre();
    }
    
    

    
   
    
}
