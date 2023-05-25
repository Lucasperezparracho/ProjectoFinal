
package milibreria;

import javax.swing.JOptionPane;


public class PedirDatos {

    public static String pedirString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }

    public static float pedirFloat(String mensaxe) {
        return (Float.parseFloat(JOptionPane.showInputDialog(mensaxe)));
    }

    public static int pedirInt(String mensaxe) {
        return (Integer.parseInt(JOptionPane.showInputDialog(mensaxe)));
    }

}
