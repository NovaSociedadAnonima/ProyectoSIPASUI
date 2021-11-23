/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosipasui;

import java.util.ArrayList;

/**
 *
 * @author Santi
 */
class Curso {

    private String IdCurso;
    private String NombreCurso;
    private String GradoCurso;
    private Lista ListaC=new Lista();
    
    public Curso(){
        
    }
    
    public Curso(String IdCurso, String NombreCurso, String GradoCurso){
        this.IdCurso = "";
        this.NombreCurso = "";
        this.GradoCurso = "";
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public String getGradoCurso() {
        return GradoCurso;
    }

    public void setGradoCurso(String GradoCurso) {
        this.GradoCurso = GradoCurso;
    }

    public String getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(String IdCurso) {
        this.IdCurso = IdCurso;
    }

    /**
     * @return the ListaC
     */
    public Lista getListaC() {
        return ListaC;
    }

    /**
     * @param ListaC the ListaC to set
     */
    public void setListaC(Lista ListaC) {
        this.ListaC = ListaC;
    }

   
}
