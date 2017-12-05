/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_02.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import practica02_02.vista.VentanaPrincipal;

/**
 *
 * @author USUARIO
 */
public class EventoVentanaPrincipal implements ActionListener{
    
    private VentanaPrincipal ventana;
    //private GestionDato gD;

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
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
