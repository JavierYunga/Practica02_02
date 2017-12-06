/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaMateria;

/**
 *
 * @author USUARIO
 */
public class EventoMateria implements ActionListener{
    
    private VentanaMateria ventanaMateria;
    private GestionDato gD;

    public EventoMateria(VentanaMateria ventanaMateria) {
        this.ventanaMateria = ventanaMateria;
    }

    public VentanaMateria getVentanaMateria() {
        return ventanaMateria;
    }

    public void setVentanaMateria(VentanaMateria ventanaMateria) {
        this.ventanaMateria = ventanaMateria;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
    
}
