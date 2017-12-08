/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Docente;
import modelo.Materia;
import vista.VentanaMateria;

/**
 *
 * @author USUARIO
 */
public class EventoMateria implements ActionListener{
    
    private VentanaMateria ventanaMateria;

    public EventoMateria(VentanaMateria ventanaMateria) {
        this.ventanaMateria = ventanaMateria;
    }

    public VentanaMateria getVentanaMateria() {
        return ventanaMateria;
    }

    public void setVentanaMateria(VentanaMateria ventanaMateria) {
        this.ventanaMateria = ventanaMateria;
    }
   
    

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        try{
      
       if (ae.getSource().equals(this.ventanaMateria.getBoton()))
       {
           
           String nombre=this.ventanaMateria.getTxtList().get(0).getText();
           nombre=nombre;
           int horas=Integer.parseInt(this.ventanaMateria.getTxtList().get(1).getText());
           horas=horas;
           int creditos=Integer.parseInt(this.ventanaMateria.getTxtList().get(2).getText());
           creditos=creditos;
           Materia m=new Materia(nombre, horas,creditos);
           JOptionPane.showMessageDialog(this.ventanaMateria,"Guardado");
           ventanaMateria.getGestionDato().getMateriaList().add(m);
           try {
                this.ventanaMateria.getGestionDato().persistMateriaList(this.ventanaMateria.getGestionDato().getMateriaList());
           } catch (IOException ex) {
                Logger.getLogger(EventoMateria.class.getName()).log(Level.SEVERE, null, ex);
           }
                           
                                
        }
        this.ventanaMateria.getGestionDato().LeerMateriaList();
       
        Object[][]datosCurso=this.ventanaMateria.cargaDatosTabla(this.ventanaMateria.getGestionDato().getMateriaList().size(),3);
        this.ventanaMateria.setDatos(datosCurso);
        this.ventanaMateria.getModeloTabla().setDataVector(this.ventanaMateria.getDatos(), this.ventanaMateria.getEncabezado());
       
       } catch (NumberFormatException ex) {
         JOptionPane.showMessageDialog(this.ventanaMateria, "Mal ingreso de datos");
       }
       
    }
    
}
