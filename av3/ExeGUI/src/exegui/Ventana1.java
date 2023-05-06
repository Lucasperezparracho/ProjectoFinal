
package exegui;

import javax.swing.JFrame;


public class Ventana1 {
    JFrame marco;
    public void iniciarVentana(){
        marco = new JFrame("Primeira GUI");
        //HAY QUE AÑADIR CARACTIRIRSTICAS
        marco.setSize(800, 400);
        //para dar tamaño
        
        marco.setLocationRelativeTo(marco);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //para parar de ejecutar al cerrar la ventana
        
        marco.setVisible(true);
        //para mostrar
        
        
    }
    
}
