/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosipasui;

import java.util.ArrayList;

/**
 *
 * @author usuLab
 */
public class ArrayListsAlmacenados {
    private ArrayList<Alumno> arAlum = new ArrayList();
    private ArrayList<Profesor> arProf = new ArrayList();
    private ArrayList<Curso> arCurso = new ArrayList();
    
    public ArrayListsAlmacenados(){
        
    }
    
    public ArrayListsAlmacenados(ArrayList arAlum, ArrayList arProf, ArrayList arCurso){
        this.arAlum = null;
        this.arProf = null;
        this.arCurso = null;
    }
    
 public ArrayList getArAlum(){
    
    return arAlum;
 }
    
 public void setArAlum(ArrayList arAlum){
     this.arAlum = arAlum;
 }
 
 public ArrayList getArProf(){
    
    return arProf;
 }
    
 public void setArProf(ArrayList arProf){
     this.arProf = arProf;
 }
 
 public ArrayList getArCurso(){
    
    return arCurso;
 }
    
 public void setArCurso(ArrayList arCurso){
     this.arCurso = arCurso;
 }
}
