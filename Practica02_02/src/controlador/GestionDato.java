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
    private File datosDocentes;
    private File datosMaterias;
    private File datosCursos;

    public GestionDato(List<Docente> docenteList, List<Materia> materiaList, List<Curso> cursoList, File datosDocentes, File datosMaterias, File datosCursos) {
        this.docenteList = docenteList;
        this.materiaList = materiaList;
        this.cursoList = cursoList;
        this.datosDocentes = datosDocentes;
        this.datosMaterias = datosMaterias;
        this.datosCursos = datosCursos;
    }

    public File getDatosDocentes() {
        return datosDocentes;
    }

    public void setDatosDocentes(File datosDocentes) {
        this.datosDocentes = datosDocentes;
    }

    public File getDatosMaterias() {
        return datosMaterias;
    }

    public void setDatosMaterias(File datosMaterias) {
        this.datosMaterias = datosMaterias;
    }

    public File getDatosCursos() {
        return datosCursos;
    }

    public void setDatosCursos(File datosCursos) {
        this.datosCursos = datosCursos;
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
    public boolean addDocente(Docente d){
        return this.docenteList.add(d);
    }
    public boolean persistirDocenteList (List<Docente> personaList)
    {
       
        try{
            FileWriter ae =new FileWriter (datosDocentes.getAbsolutePath() ,true);
            BufferedWriter escritura = new BufferedWriter (ae);
            for(Docente d: docenteList){
               
                escritura.append(d.toString());
                escritura.newLine();
                
            }
            escritura.close();
            return true;
        }catch (IOException e1)
        {
           return false; 
          
        }   
    }
    
    public Docente metodo(String linea){
        String[] lineaArray= linea.split(" / ");
        Docente d = new Docente(Integer.parseInt(lineaArray[0]),lineaArray[1], lineaArray[2]);
        return d;
    }
     public List<Docente> LeerDocenteList(){
        try{
            List<Docente> d= new ArrayList<Docente>();
            FileReader ae = new FileReader(datosDocentes.getAbsolutePath());
            BufferedReader lectura = new BufferedReader(ae); 
            String linea;
            
            
            while((linea=lectura.readLine())!=null){
                
                d.add(this.metodo(linea));
   
            }
             
            lectura.close();
                
            return d;
            
                
        }
        catch(IOException e){
            return null;
        }
    }
    
}
