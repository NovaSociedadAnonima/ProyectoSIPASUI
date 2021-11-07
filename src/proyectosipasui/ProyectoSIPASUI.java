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
public class ProyectoSIPASUI {
    
    private static         UI_Main inicio = new UI_Main();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicio.setVisible(true);
    }
    private void modousuarioActionPerformed(java.awt.event.ActionEvent evt) {                                         
        inicio.setVisible(false);
    }
    
}
