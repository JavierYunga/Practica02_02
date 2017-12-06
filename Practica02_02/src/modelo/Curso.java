
package modelo;

/**
 *
 * @author Alex Reinoso
 */
public class Curso {
    
    private Docente docente;
    private Materia materia;
    private int numEstudiantes;   

    public Curso(Docente docente, Materia materia, int numEstudiantes) {
        this.docente = docente;
        this.materia = materia;
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

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }
    
    
    
    
    
}
