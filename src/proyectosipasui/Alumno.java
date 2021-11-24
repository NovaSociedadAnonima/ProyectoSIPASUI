/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosipasui;

/**
 *
 * @author Santi
 */
    public class Alumno {
        private String Nombre;
        private String Apellido;
        private String CI;
   
    public Alumno(){
        
    }
    
    public Alumno(String Nombre, String Apellido, String CI){
        this.Nombre = "";
        this.Apellido = "";
        this.CI = "";
    }
 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }


    public String getCI() {
        return CI;
    }


    public void setCI(String CI) {
        this.CI = CI;
    }
}
