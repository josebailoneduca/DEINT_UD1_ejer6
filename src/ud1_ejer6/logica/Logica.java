/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package ud1_ejer6.logica;

import java.util.ArrayList;
import java.util.List;
import ud1_ejer6.dto.DatosLogin;
import ud1_ejer6.dto.Hijo;
import ud1_ejer6.gui.ventanas.Vacceso;

/**
 *
 * @author Jose Javier Bailón Ortiz
 */
public class Logica {
    private static DatosLogin datosLogin=new DatosLogin("1","1");
    private static ArrayList<Hijo> hijos = new ArrayList<Hijo>();
    
    public static void addHijo(Hijo hijo){
        hijos.add(hijo);
    }
    public static List<Hijo> getListaHijos() {
        return hijos;
    }
    public static boolean intentarLogin(DatosLogin dLogin){
        boolean usuarioOk=Logica.datosLogin.getUsuario().equals(dLogin.getUsuario());
        boolean passwordOk=Logica.datosLogin.getPassword().equals(dLogin.getPassword());
        return  (usuarioOk && passwordOk);            
    }
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vacceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vacceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vacceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vacceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        //mostrar ventana de acceso
        java.awt.EventQueue.invokeLater(() -> {
            Vacceso ventanaAcceso = new Vacceso();
            ventanaAcceso.setLocationRelativeTo(ventanaAcceso);
            ventanaAcceso.setVisible(true);
        });

    }



}//end Logica
