
package boletin28;

import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Layouts {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JLabel label1,label2;
    JTextArea textA;
    JTextField textF1,textF2;
    
    public void iniciarComponentes(){
        label1 = new JLabel("Nome");
        textF1 = new JTextField();
        label2 = new JLabel("Password");
        textF2 = new JTextField();
        textA = new JTextArea("Area de texto");
        boton1 = new JButton("Premer");
        boton2 = new JButton("Limpar");
        panel = new JPanel();        
        marco = new JFrame("Boletin28");
        
        marco.setSize(800, 800);
        
        
    }
    public void pecharComponentes(){
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }
    public JPanel add(JPanel panel){
        panel.add(boton1);
        panel.add(boton2);
        panel.add(label1);
        panel.add(label2);
        panel.add(textA);
        panel.add(textF1);
        panel.add(textF2);
        return panel;
    }
    public void componentes(){
        iniciarComponentes();
        panel.setLayout(null);
        label1.setBounds(50, 5, 200, 50);
        textF1.setBounds(200, 5, 200, 50);
        label2.setBounds(50, 100, 200, 50);
        textF2.setBounds(200, 100, 200, 50);
        textA.setBounds(100, 200, 300, 150);
        boton1.setBounds(50, 400, 200,50);
        boton2.setBounds(400,400, 200, 50);
        marco.add(add(panel));
        pecharComponentes();
    }
    
}
