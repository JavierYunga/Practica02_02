/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Curso;
import modelo.Docente;
import modelo.Materia;

/**
 *
 * @author USUARIO
 */
public class GestionDato {
    
    private List<Docente> docenteList;
    private List<Materia> materiaList;
    private List<Curso> cursoList;

    public GestionDato(List<Docente> docenteList, List<Materia> materiaList, List<Curso> cursoList) {
        this.docenteList = docenteList;
        this.materiaList = materiaList;
        this.cursoList = cursoList;
    }

    public List<Docente> getDocenteList() {
        return docenteList;
    }

    public void setDocenteList(List<Docente> docenteList) {
        this.docenteList = docenteList;
    }

    public List<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(List<Materia> materiaList) {
        this.materiaList = materiaList;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }
    public boolean addCurso(Curso c)
    {
        boolean retorno;
        retorno=this.cursoList.add(c);
        return retorno;
    }

    public Curso metodo2(String linea)
    {
        String[] partes= linea.split(" ");
        String nombre=partes[0];
        String numAl=partes[1];
        String doc=partes[2];
        String mat=partes[3];
        for (Docente d:docenteList) 
        {
            if (doc.equals(d.getNombre()))
            {
                for (Materia m:materiaList) 
                {
                    if (mat.equals(m.getNombre()))
                    {
                        Curso c = new Curso(nombre,numAl,d,m);
                        return c;   
                    }
                }
            }
                
                
            
        }
        return null;
       
    }
     
   
     public boolean persistCursoList(List<Curso> cursoList) throws IOException
    {
        boolean retorno=true;
        File directorio=new File("C:/Curso");
        System.out.print((directorio.getPath()));
        if(!directorio.exists())
        {
            directorio.mkdir();
        }
        for(Curso c:cursoList)
        {
            try
            {
                FileWriter ae=new FileWriter("C:/Curso/DatosCurso.txt",true);
                BufferedWriter escritura= new BufferedWriter(ae);
                
                escritura.append(c.toString());
                escritura.newLine();
         
                escritura.close();
                retorno=true;
            }catch(IOException e1)
            {
                retorno=false;
            }
        }
        
        return retorno;
    }
     
    public List<Curso> LeerCursoList()
    {
        try
        {
            List<Curso> c= new ArrayList<Curso>();
            FileReader ae = new FileReader("C:/Curso/DatosCurso.txt");
            BufferedReader lectura = new BufferedReader(ae); 
            String linea;
            
            
            while((linea=lectura.readLine())!=null)
            {
                c.add(this.metodo2(linea));
   
            }
             
            lectura.close();
                
            return c;
                
        }
        catch(IOException e){
            return null;
        }
    }
     public boolean persistDocenteList(List<Docente> docenteList) throws IOException
    {
        boolean retorno=true;
        File directorio=new File("C:/Docente");
        System.out.print((directorio.getPath()));
        if(!directorio.exists())
        {
            directorio.mkdir();
        }
        for(Docente d:docenteList)
        {
            try
            {
                FileWriter ae=new FileWriter("C:/Docente/DatosDocente.txt",true);
                BufferedWriter escritura= new BufferedWriter(ae);
                
                escritura.append(d.toString());
                escritura.newLine();
         
                escritura.close();
                retorno=true;
            }catch(IOException e1)
            {
                retorno=false;
            }
        }
        
        return retorno;
    }
     
    public List<Docente> LeerDocenteList()
    {
        try
        {
            List<Docente> d= new ArrayList<Docente>();
            FileReader ae = new FileReader("C:/Docente/DatosDocente.txt");
            BufferedReader lectura = new BufferedReader(ae); 
            String linea;
            
            
           
             
            lectura.close();
                
            return d;
                
        }
        catch(IOException e){
            return null;
        }
    }
     
     
    
    
}
