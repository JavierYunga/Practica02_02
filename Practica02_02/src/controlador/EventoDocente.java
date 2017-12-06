/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import modelo.Docente;
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
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource().equals(this.ventanaDocente.getBoton()))
        {
        List<Docente> dL = new ArrayList<Docente>();
        int co=Integer.parseInt(this.ventanaDocente.getTxtList().get(0).getText());
        String no= this.ventanaDocente.getTxtList().get(1).getText();
        String ce= this.ventanaDocente.getTxtList().get(2).getText();
        Docente d = new Docente (co,no,ce);
        dL.add(d);
        this.ventanaDocente.getGestionDato().persistirDocenteList(dL);
        Object[][]datosDocentes=this.ventanaDocente.cargaDatosTabla(this.ventanaDocente.getGestionDato().LeerDocenteList().size(), 3);
        this.ventanaDocente.setDatos(datosDocentes);
        this.ventanaDocente.getModeloTabla().setDataVector(this.ventanaDocente.getDatos(), this.ventanaDocente.getEncabezado());
        }
        if(ae.getActionCommand().equals("Limpiar")){
            this.ventanaDocente.getTxtList().get(0).setText(" ");
            this.ventanaDocente.getTxtList().get(1).setText(" ");
            this.ventanaDocente.getTxtList().get(2).setText(" ");
        }
    }
    
}
