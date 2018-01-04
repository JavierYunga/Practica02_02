/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaCurso;
import vista.VentanaDocente;
import vista.VentanaMateria;
import vista.VentanaPrincipal;
import libreria.GestionDato;

/**
 *
 * @author USUARIO
 */
public class EventoVentanaPrincipal implements ActionListener{
    
    private VentanaPrincipal ventana;
    

    public EventoVentanaPrincipal(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    public VentanaPrincipal getVentana() {
        return ventana;
    }

    public void setVentana(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(this.ventana.getMenuItemList().get(0))) {
            VentanaDocente vD = new VentanaDocente(this.ventana.getgD());
            vD.setVisible(true);
            this.ventana.getEscritorio().add(vD);
        }
        if (e.getSource().equals(this.ventana.getMenuItemList().get(1))) {
            VentanaMateria vM = new VentanaMateria(this.ventana.getgD());
            vM.setVisible(true);
            this.ventana.getEscritorio().add(vM);
        }
        if (e.getSource().equals(this.ventana.getMenuItemList().get(2))) {
            VentanaCurso vC = new VentanaCurso(this.ventana.getgD());
            vC.setVisible(true);
            this.ventana.getEscritorio().add(vC);
        }
        
    }
    
}
