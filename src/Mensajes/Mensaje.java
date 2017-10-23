/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensajes;

/**
 *
 * @author VOSTRO
 */
import javax.swing.JOptionPane;

public class Mensaje {
    public static void success(){
        JOptionPane.showMessageDialog(null, "Se proceso correctamente su solicitud",
                "Correcto",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void error(){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error en su solicitud",
                "Error",JOptionPane.ERROR_MESSAGE);
    }
}
