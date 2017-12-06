/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EventoCurso;
import controlador.EventoDocente;
import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Curso;
import modelo.Docente;
import modelo.Materia;

/**
 *
 * @author USUARIO
 */
public class VentanaCurso extends JInternalFrame{
    
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton;
    private JButton boton2;
    private JPanel panelGuardar;
    private JPanel panelInicial;
    private JPanel panelVer;
    private GestionDato gestionDato;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    
    public VentanaCurso(GestionDato gestionDato){
        super("Registro Curso", true, true, true, true);
        this.setSize(500, 300);
        this.gestionDato = gestionDato;
        this.iniciaComponente();
    }
    
    public void iniciaComponente (){
        
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Docente"));
        this.etiList.add(new JLabel("Materia"));
        this.etiList.add(new JLabel("Ingrese el numero de Estudiantes"));
        
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        
        this.boton= new JButton("Guardar");
        this.boton2= new JButton("Limpiar");
        this.boton.addActionListener(new EventoCurso(this));
        this.boton2.addActionListener(new EventoCurso(this));
        
        this.encabezado = new Object[3];
        this.encabezado[0]="Docente";
        this.encabezado[1]="Materia";
        this.encabezado[2]="Numero Estudiantes";
        
        this.datos = cargaDatosTabla(this.gestionDato.getDocenteList().size(),3);
        
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        LayoutManager disenio = new GridLayout(4, 2);
        LayoutManager disenio2 = new GridLayout(2, 1);
        this.panelVer= new JPanel(new BorderLayout());
	this.panelGuardar = new JPanel(disenio);
	this.panelInicial = new JPanel(disenio2);
        
        for(int i=0;i<3;i++){
            this.panelGuardar.add(this.etiList.get(i));
	    this.panelGuardar.add(this.txtList.get(i));
        }
	
	this.panelVer.add(this.scroll, BorderLayout.CENTER);
	this.panelGuardar.add(this.boton);
        this.panelGuardar.add(this.boton2);
	this.panelInicial.add(this.panelGuardar);
	this.panelInicial.add(this.panelVer);
	this.add(this.panelInicial);
    }

     public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Curso c:this.gestionDato.getCursoList())
        {
            retorno[i][0]=c.getDocente();
            retorno[i][1]=c.getMateria();
            retorno[i][2]=c.getNumEstudiantes();
            i++;
        }        
        return retorno;
    }
    
}
