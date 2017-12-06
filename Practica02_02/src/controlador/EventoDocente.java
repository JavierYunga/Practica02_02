/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaDocente;

/**
 *
 * @author USUARIO
 */
public class EventoDocente implements ActionListener{
    
    private VentanaDocente ventanaDocente;
    private GestionDato gD;

    public EventoDocente(VentanaDocente ventanaDocente) {
        this.ventanaDocente = ventanaDocente;
    }

    public VentanaDocente getVentanaDocente() {
        return ventanaDocente;
    }

    public void setVentanaDocente(VentanaDocente ventanaDocente) {
        this.ventanaDocente = ventanaDocente;
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
