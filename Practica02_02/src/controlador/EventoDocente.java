/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Curso;
import modelo.Docente;
import modelo.Materia;
import vista.VentanaDocente;
import libreria.GestionDato;

/**
 *
 * @author USUARIO
 */
public class EventoDocente implements ActionListener{
    
    private VentanaDocente ventanaDocente;

    public EventoDocente(VentanaDocente ventanaDocente) {
        this.ventanaDocente = ventanaDocente;
    }

    public VentanaDocente getVentanaDocente() {
        return ventanaDocente;
    }

    public void setVentanaDocente(VentanaDocente ventanaDocente) {
        this.ventanaDocente = ventanaDocente;
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       try{
      
       if (e.getSource().equals(this.ventanaDocente.getBoton()))
       {
           
           int codigo=Integer.parseInt(this.ventanaDocente.getTxtList().get(0).getText());
           codigo=codigo;
           String nombre=this.ventanaDocente.getTxtList().get(1).getText();
           nombre=nombre;
           String cedula=this.ventanaDocente.getTxtList().get(2).getText();
           cedula=cedula;
           Docente d=new Docente(codigo,nombre,cedula);
           JOptionPane.showMessageDialog(this.ventanaDocente,"Guardado");
           ventanaDocente.getGestionDato().getDocenteList().add(d);
           try {
                this.ventanaDocente.getGestionDato().persistDocenteList(this.ventanaDocente.getGestionDato().getDocenteList());
           } catch (IOException ex) {
                Logger.getLogger(EventoDocente.class.getName()).log(Level.SEVERE, null, ex);
           }
                           
                                
        }
        this.ventanaDocente.getGestionDato().LeerCursoList();
       
        Object[][]datosCurso=this.ventanaDocente.cargaDatosTabla(this.ventanaDocente.getGestionDato().getDocenteList().size(),3);
        this.ventanaDocente.setDatos(datosCurso);
        this.ventanaDocente.getModeloTabla().setDataVector(this.ventanaDocente.getDatos(), this.ventanaDocente.getEncabezado());
       
       } catch (NumberFormatException ex) {
         JOptionPane.showMessageDialog(this.ventanaDocente, "Mal ingreso de datos");
       }
    }
    
    
    

    
}
