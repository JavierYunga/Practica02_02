/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import libreria.GestionDato;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import modelo.Curso;
import modelo.Docente;
import modelo.Materia;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Docente> dL = new ArrayList<Docente>();
        List<Materia> mL = new ArrayList<Materia>();
        List<Curso> cL = new ArrayList<Curso>();
       
        
        GestionDato gD = new GestionDato(dL, mL,cL);
        VentanaPrincipal v = new VentanaPrincipal("Archivos de Texto",gD);
        v.setVisible(true);
        
    }
    
}
