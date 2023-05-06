
package exegui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Layouts {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;
    
    
    public void disFlowLayouts(){
        boton1 = new JButton("BOTON1");
        boton2 = new JButton("BOTON2");
        boton3 = new JButton("BOTON3");
        boton4 = new JButton("BOTON4");
        boton5 = new JButton("BOTON5");
        
        panel = new JPanel();
        
        marco = new JFrame("***Layouts***");
        marco.setSize(600, 400);
        
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        
        
    }
    public void disFlowLayouts2(){
        iniciarComponentes();
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        pecharComponentes();
        
    }
    public void iniciarComponentes(){
        boton1 = new JButton("BOTON1");
        boton2 = new JButton("BOTON2");
        boton3 = new JButton("BOTON3");
        boton4 = new JButton("BOTON4");
        boton5 = new JButton("BOTON5");
        
        //crea la ventana
        panel = new JPanel();
        
        marco = new JFrame("***Layouts***");
        marco.setSize(600, 400);
        
    }
    public void pecharComponentes(){
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        
    }
    public void disBoxLayouts(){
        iniciarComponentes();
        //aplicar o layout
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        pecharComponentes();
    }
    public void disBorderLayouts(){
        iniciarComponentes();
        panel.setLayout(new BorderLayout());
        //engadimos compoñentes
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.EAST);
        panel.add(boton3, BorderLayout.NORTH);
        panel.add(boton4, BorderLayout.SOUTH);
        panel.add(boton5, BorderLayout.WEST);
        marco.add(panel);
        pecharComponentes();
    }
    public void disGrigLayouts(){
        iniciarComponentes();
        panel.setLayout(new GridLayout(3,2));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);        
        marco.add(panel);
        pecharComponentes();
    }
    
}
