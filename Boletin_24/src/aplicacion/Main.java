
package aplicacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import metodos.Metodos;

public class Main {

    public static void main(String[] args) {
        Metodos obx = new Metodos();

        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n"
                    + "1--->Crear nuevo libro\n"
                    + "2-->Vendido\n"
                    + "3--->AMOSAR\n"
                    + "4-->Dar de baja libros con unidades = 0\n"
                    + "5-->Consultar libro\n"
                    + "6-->Salir\n"));

            switch (opcion) {
                case 1:
                    obx.anadir();
                    break;
                case 2:
                    obx.borrar();
                    break;
                case 3:
                    obx.ver();
                    break;
                case 4:
                    obx.anadirPosicion(opcion);
                    break;
                case 5:
                    obx.consultar();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Fin del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                    break;
            }

        } while (opcion != 6);
    }
}