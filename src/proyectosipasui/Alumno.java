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
     String Nombre;
    String Apellido;
    private int CI;
   

 
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


    public int getCI() {
        return CI;
    }


    public void setCI(int CI) {
        this.CI = CI;
    }
}
