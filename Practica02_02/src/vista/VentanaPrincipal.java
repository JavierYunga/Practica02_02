/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import controlador.EventoVentanaPrincipal;
import controlador.GestionDato;
import modelo.Curso;
import modelo.Docente;
import modelo.Materia;

/**
 *
 * @author USUARIO
 */
public class VentanaPrincipal extends JFrame{
    
    private JMenuBar menuPrincipal;
    private JDesktopPane escritorio;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private List<JMenuItem> menuItemList;
    private List<JMenuItem> menuItemList2;
    private Docente docente;
    private Materia materia;
    private Curso curso;
    private GestionDato gD;
    
    public VentanaPrincipal(String titulo, GestionDato gD) {
        this.setTitle(titulo);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(3);
        this.gD = gD;
        iniciaComponente();
    }
    
     public void iniciaComponente(){
        this.menuPrincipal = new JMenuBar();
        this.escritorio = new JDesktopPane();
        
        this.menu1 = new JMenu("Crear");
        
        this.menuItemList = new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Docente"));
        this.menuItemList.add(new JMenuItem("Materia"));
        this.menuItemList.add(new JMenuItem("Curso"));
        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(menuPrincipal);

        this.menuPrincipal.add(this.menu1);
        
        this.menu1.add(this.menuItemList.get(0));
        this.menu1.add(this.menuItemList.get(1));
        this.menu1.add(this.menuItemList.get(2));
                 
        this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaPrincipal(this));
        
        
     }    

    public JMenuBar getMenuPrincipal() {
        return menuPrincipal;
    }

    public void setMenuPrincipal(JMenuBar menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenu getMenu1() {
        return menu1;
    }

    public void setMenu1(JMenu menu1) {
        this.menu1 = menu1;
    }

    public JMenu getMenu2() {
        return menu2;
    }

    public void setMenu2(JMenu menu2) {
        this.menu2 = menu2;
    }

    public JMenu getMenu3() {
        return menu3;
    }

    public void setMenu3(JMenu menu3) {
        this.menu3 = menu3;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public List<JMenuItem> getMenuItemList2() {
        return menuItemList2;
    }

    public void setMenuItemList2(List<JMenuItem> menuItemList2) {
        this.menuItemList2 = menuItemList2;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
      
     
}
