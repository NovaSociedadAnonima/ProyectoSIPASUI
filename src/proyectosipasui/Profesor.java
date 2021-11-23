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
    public class Profesor {
        private String Nombre;
        private String Apellido;
        private String Ci;

    public Profesor(){
        
    }
    
    public Profesor(String Nombre, String Apellido, String Ci){
    this.Nombre = "";
    this.Apellido = "";
    this.Ci = "";
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


    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }
}
