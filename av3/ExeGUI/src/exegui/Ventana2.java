
package exegui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana2 extends JFrame{
    public void iniciarVentana(){
            //Damos caracteristicas
            this.setSize(800, 300);
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBackground(Color.GREEN);
            //Color de fondo
            
            this.setDefaultCloseOperation(3);
            this.setVisible(true);
            
    }
    
    
}
