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
import javax.swing.JComboBox;
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
    private JComboBox combo1;
    private JComboBox combo2;
    
    public VentanaCurso(GestionDato gestionDato){
        super("Registro Curso", true, true, true, true);
        this.setSize(500, 300);
        this.gestionDato = gestionDato;
        this.iniciaComponente();
    }
    
    public void iniciaComponente (){
        
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Curso"));
        this.etiList.add(new JLabel("Numero de Estudiantes"));

        this.etiList.add(new JLabel("Docente"));
        this.etiList.add(new JLabel("Materia"));
        
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        
       
        this.boton= new JButton("Guardar");
        this.boton2= new JButton("Limpiar");
   
        this.boton.addActionListener(new EventoCurso(this));
        this.boton2.addActionListener(new EventoCurso(this));
        
        this.encabezado = new Object[4];
        this.encabezado[0]="Nombre";
        this.encabezado[1]="Numero Estudiantes";
        this.encabezado[2]="Docente";
        this.encabezado[3]="Materia";
        
        this.datos = cargaDatosTabla(this.gestionDato.getCursoList().size(),4);
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        LayoutManager disenio = new GridLayout(5, 2);
        LayoutManager disenio2 = new GridLayout(2, 1);
        this.panelVer= new JPanel(new BorderLayout());
	this.panelGuardar = new JPanel(disenio);
	this.panelInicial = new JPanel(disenio2);
        
       
        this.panelGuardar.add(this.etiList.get(0));
        this.panelGuardar.add(this.txtList.get(0));
        this.panelGuardar.add(this.etiList.get(1));
        this.panelGuardar.add(this.txtList.get(1));
        this.panelGuardar.add(this.etiList.get(2));
        this.combo1=new JComboBox();
        this.cargarCombo1();
        this.panelGuardar.add(this.combo1);
        this.panelGuardar.add(this.etiList.get(3));
        this.combo2=new JComboBox();
        this.cargarCombo2();
        this.panelGuardar.add(this.combo2);
	
	this.panelVer.add(this.scroll, BorderLayout.CENTER);
	this.panelGuardar.add(this.boton);
        this.panelGuardar.add(this.boton2);
	this.panelInicial.add(this.panelGuardar);
	this.panelInicial.add(this.panelVer);
        this.panelVer.add(this.scroll, BorderLayout.CENTER);
        this.add(panelInicial);
    }
    
    public Object[][]cargaDatosTabla(int h,int w)
    {
        Object[][]retorno=new Object[h][w];
        int i=0;
        for(Curso c:this.gestionDato.getCursoList())
        {
           retorno[i][0]=c.getNombre();
           retorno[i][1]=c.getNumEstudiantes();
           retorno[i][2]=c.getDocente().getNombre();
           retorno[i][3]=c.getMateria().getNombre();
           i++;
        }
        
        return retorno;
           
    }
    public void cargarCombo1(){
        this.combo1.removeAllItems();
        for(Docente d: this.gestionDato.getDocenteList())
        {
            this.combo1.addItem(d.getNombre());
        }
    }
    
    public void cargarCombo2(){
        this.combo2.removeAllItems();
        for(Materia m: this.gestionDato.getMateriaList())
        {
            this.combo2.addItem(m.getNombre());
        }
    }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    public JPanel getPanelGuardar() {
        return panelGuardar;
    }

    public void setPanelGuardar(JPanel panelGuardar) {
        this.panelGuardar = panelGuardar;
    }

    public JPanel getPanelInicial() {
        return panelInicial;
    }

    public void setPanelInicial(JPanel panelInicial) {
        this.panelInicial = panelInicial;
    }

    public JPanel getPanelVer() {
        return panelVer;
    }

    public void setPanelVer(JPanel panelVer) {
        this.panelVer = panelVer;
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JComboBox getCombo1() {
        return combo1;
    }

    public void setCombo1(JComboBox combo1) {
        this.combo1 = combo1;
    }

    public JComboBox getCombo2() {
        return combo2;
    }

    public void setCombo2(JComboBox combo2) {
        this.combo2 = combo2;
    }

   
    
}
