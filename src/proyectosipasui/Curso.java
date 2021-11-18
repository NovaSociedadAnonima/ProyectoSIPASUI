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

    private int IdCurso;
    private String NombreCurso;
    private int GradoCurso;
    private Lista ListaC=new Lista();

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public int getGradoCurso() {
        return GradoCurso;
    }

    public void setGradoCurso(int GradoCurso) {
        this.GradoCurso = GradoCurso;
    }

    public int getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(int IdCurso) {
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
