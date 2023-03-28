package metodos;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Metodos {
    ArrayList<Libro> listaLibros = new ArrayList<>();
    
    public void anadir(){
        String titulo = JOptionPane.showInputDialog("Introduce el título del libro:");
        String autor = JOptionPane.showInputDialog("Introduce el autor del libro:");
        String isbn = JOptionPane.showInputDialog("Introduce el ISBN del libro:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del libro:"));
        int numUnidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de unidades del libro:"));
        
        Libro nuevoLibro = new Libro(titulo, autor, isbn, precio, numUnidades);
        listaLibros.add(nuevoLibro);
        JOptionPane.showMessageDialog(null, "Libro añadido correctamente");
    }
    
    public void anadirPosicion(int posicion){
        String titulo = JOptionPane.showInputDialog("Introduce el título del libro:");
        String autor = JOptionPane.showInputDialog("Introduce el autor del libro:");
        String isbn = JOptionPane.showInputDialog("Introduce el ISBN del libro:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del libro:"));
        int numUnidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de unidades del libro:"));
        
        Libro nuevoLibro = new Libro(titulo, autor, isbn, precio, numUnidades);
        listaLibros.add(posicion, nuevoLibro);
        JOptionPane.showMessageDialog(null, "Libro añadido correctamente");
    }
    
    public void borrar(){
        if(listaLibros.isEmpty()){
            throw new RuntimeException("La lista está vacía");
        }else{
            String titulo = JOptionPane.showInputDialog("Introduce el título del libro a vender:");
            boolean encontrado = false;
            for(Libro libro: listaLibros){
                if(libro.getTitulo().equalsIgnoreCase(titulo)){
                    libro.setUnidades(libro.getUnidades()-1);
                    JOptionPane.showMessageDialog(null, "Libro vendido correctamente");
                    encontrado = true;
                    if(libro.getUnidades()==0){
                        listaLibros.remove(libro);
                        JOptionPane.showMessageDialog(null, "Libro eliminado por falta de unidades");
                    }
                    break;
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "El libro no se encuentra en la lista");
            }
        }
    }
    
    public void ver(){
        if(listaLibros.isEmpty()){
            throw new RuntimeException("La lista está vacía");
        }else{
            Collections.sort(listaLibros);
            String mensaje = "";
            for(Libro libro: listaLibros){
                mensaje += "Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + 
                        ", ISBN: " + libro.getISBN()+ ", Precio: " + libro.getPrezo() + 
                        ", Unidades: " + libro.getUnidades()+ "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
    
    public void consultar(){
        if(listaLibros.isEmpty()){
            throw new RuntimeException("La lista está vacía");
        }else{
            String titulo = JOptionPane.showInputDialog("Introduce el título del libro a consultar:");
            boolean encontrado = false;
            for(Libro libro: listaLibros){
                if(libro.getTitulo().equalsIgnoreCase(titulo)){
                    JOptionPane.showMessageDialog(null, libro.toString());
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "El libro no se encuentra en la lista");
            }
        }
    }
}
           
