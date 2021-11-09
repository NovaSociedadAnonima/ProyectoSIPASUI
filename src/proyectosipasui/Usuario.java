/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosipasui;

/**
 *
 * @author usuLab
 */
    public class Usuario {
    private String usr;
    private String pass;
    
    public Usuario(){
    
    }
    
    public Usuario(String id, String pass) {
        this.usr = usr;
        this.pass = pass;
    }

    public String getUser() {
        return usr;
    }

    public void setUser(String usr) {
        this.usr = usr;
    }

    public String getPasswd() {
        return pass;
    }

    public void setPasswd(String pass) {
        this.pass = pass;
    }
}
