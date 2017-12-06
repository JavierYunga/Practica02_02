/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaCurso;

/**
 *
 * @author USUARIO
 */
public class EventoCurso implements ActionListener{
    
    private VentanaCurso ventanaCurso;
    private GestionDato gD;

    public EventoCurso(VentanaCurso ventanaCurso) {
        this.ventanaCurso = ventanaCurso;
    }

    public VentanaCurso getVentanaCurso() {
        return ventanaCurso;
    }

    public void setVentanaCurso(VentanaCurso ventanaCurso) {
        this.ventanaCurso = ventanaCurso;
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
