/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_02.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import practica02_02.controlador.EventoVentanaPrincipal;

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
    //private Docente docente;
    //private Materia materia;
    //private Curso curso;
    //private Eliminar eliminar;
    //private GestionDato gD;
    
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
        this.menuItemList.get(3).addActionListener(new EventoVentanaPrincipal(this));
        
     }    
      
}
