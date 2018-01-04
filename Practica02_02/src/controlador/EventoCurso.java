/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
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
import vista.VentanaCurso;
import libreria.GestionDato;

/**
 *
 * @author USUARIO
 */
public class EventoCurso implements ActionListener 
{
    private VentanaCurso ventanaCurso;
   
    public EventoCurso(VentanaCurso ventana) 
    {
        this.ventanaCurso= ventana;
    }
    
    
    public void actionPerformed(ActionEvent e) 
    {
       try{
      
       if (e.getSource().equals(this.ventanaCurso.getBoton()))
       {
           
           String nombre=this.ventanaCurso.getTxtList().get(0).getText();
           nombre=nombre;
           String numEst=this.ventanaCurso.getTxtList().get(1).getText();
           numEst=numEst;
           String doc=this.ventanaCurso.getCombo1().getSelectedItem().toString();
           doc=doc;
           
           String mat=this.ventanaCurso.getCombo2().getSelectedItem().toString();
          
           
           for(Docente d:this.ventanaCurso.getGestionDato().getDocenteList())
           {
               
               if(doc.equals(d.getNombre()))
               {
                  
                    for(Materia m:this.ventanaCurso.getGestionDato().getMateriaList())
                    {
                        if(mat.equals(m.getNombre()))
                        {
                            Curso c=new Curso(nombre,numEst,d,m);
                            JOptionPane.showMessageDialog(this.ventanaCurso,"Guardado");
                            ventanaCurso.getGestionDato().getCursoList().add(c);
                            try {
                                this.ventanaCurso.getGestionDato().persistCursoList(this.ventanaCurso.getGestionDato().getCursoList());
                            } catch (IOException ex) {
                                Logger.getLogger(EventoCurso.class.getName()).log(Level.SEVERE, null, ex);
                            }
                           
                                
                            }
                           this.ventanaCurso.getGestionDato().LeerCursoList();
                        }
                     
                    }
                    
               }
               
          
           }
           
           Object[][]datosCurso=this.ventanaCurso.cargaDatosTabla(this.ventanaCurso.getGestionDato().getCursoList().size(),4);
           this.ventanaCurso.setDatos(datosCurso);
           this.ventanaCurso.getModeloTabla().setDataVector(this.ventanaCurso.getDatos(), this.ventanaCurso.getEncabezado());
       
       } catch (NumberFormatException ex) {
         JOptionPane.showMessageDialog(this.ventanaCurso, "Mal ingreso de datos");
       }
    }
    
    
}
           
               
          

    


       

   
   

