/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
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
       
        Docente d1=new Docente(101,"Pepe Sanchez","0102456789");
        Docente d2=new Docente(102,"Juan Diaz","0102426719");
       
        Materia m1=new Materia("Matematicas",120,130);
        Materia m2=new Materia("Programacion",160,120);
       
        
        dL.add(d1);
        dL.add(d2);
        mL.add(m1);
        mL.add(m2);
        
        GestionDato gD = new GestionDato(dL, mL,cL);
        VentanaPrincipal v = new VentanaPrincipal("Archivos de Texto",gD);
        v.setVisible(true);
        
    }
    
}
