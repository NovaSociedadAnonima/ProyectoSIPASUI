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
        
    private String adusr;
    private String adpwd;
    
    private String usr;
    private String pass;
    
    public Usuario(){
    
    }
    
    public Usuario(String adusr, String adpwd, String usr, String pass) {
        this.adusr = adusr;
        this.adpwd = adpwd;
        this.usr = usr;
        this.pass = pass;
    }
    
    public String getAduser() {
        return adusr;
    }

    public void setAduser(String adusr) {
        this.adusr = adusr;
    }
    
    public String getAdpwd() {
        return adpwd;
    }

    public void setAdpwd(String adpwd) {
        this.adpwd = adpwd;
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
