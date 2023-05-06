
package exegui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Componentes {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JTextField textL;
    JTextArea textA;
    JButton bCopiar, bSair;
    
    public void iniciarComponentes(){
        //definir compoñentes
        frame = new JFrame ("Compoñentes");
        panel = new JPanel();
        label = new JLabel("etiqueta");
        textL = new JTextField();
        textA = new JTextArea();
        bCopiar = new JButton("Copiar");
        bSair = new JButton();
        
        //damoslle caracteristicas
        
        frame.setBounds(0, 0, 800, 800);
        panel.setBounds(5, 5, 750, 750);
        panel.setBackground(Color.red);
        label.setBounds(50, 100, 100, 50);
        textL.setBounds(200, 100, 100, 50);
        textA.setBounds(50, 200, 200, 300);
        bCopiar.setBounds(100, 600, 150, 100);
        bSair.setBounds(200, 600, 150, 100);
        bSair.setText("  Sair  ");
        bSair.setToolTipText("saimos do programa");
        
        //engadimos
        panel.setLayout(null);
        panel.add(frame);
        panel.add(textL);
        panel.add(textA);
        panel.add(bCopiar);
        panel.add(bSair);
        
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
