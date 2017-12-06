
package modelo;

/**
 *
 * @author Alex Reinoso
 */
public class Docente {
    
    private int codigo;
    private String nombre;
    private String cedula;

    public Docente(int codigo, String nombre, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return  codigo + "/" + nombre + "/" + cedula ;
    }
    
    
    
}
