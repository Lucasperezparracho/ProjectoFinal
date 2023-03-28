
package mantemento;

import libros.Libro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Mantemento {
    
    FileWriter ou=null;
    PrintWriter fich=null;
    
    Libro li = new Libro();
    
    public void engadirLibro(File ficheiro){
        
        try {
            ou=new FileWriter (ficheiro);
            fich=new PrintWriter(ou);
            fich.println(li.getNomeLibro()+li.getNomeAutor()+li.getPrecio()+li.getUnidades());


        }catch (IOException ex){
            System.out.println("erro de palabra"+ex.getMessage());
        }
        finally{
            fich.close();
        }
        
    }
    /*
    public void nomeLibro(File ficheiro){
        try{
            ou=new FileWriter (ficheiro,true);
            fich=new PrintWriter(ou);
            fich.println("L1");
            fich.println("L2");
            fich.println("L3");
        } catch (IOException ex){
            System.out.println("erro no nome"+ex.getMessage());
        }
        finally{
            fich.close();
        }
    }
    public void nomeAutor(File ficheiro){
        try{
            ou=new FileWriter (ficheiro,true);
            fich=new PrintWriter(ou);
            fich.println("A1");
            fich.println("A2");
            fich.println("A3");
        } catch (IOException ex){
            System.out.println("erro no autor"+ex.getMessage());
        }
        finally{
            fich.close();
        }
        
    }
    public void Precio(File ficheiro){
        try{
            ou=new FileWriter (ficheiro, true);
            fich=new PrintWriter(ou);
            fich.println("15€");
            fich.println("12€");
            fich.println("27€");
        } catch (IOException ex){
            System.out.println("erro no precio"+ex.getMessage());
        }
        finally{
            fich.close();
        }
        
    }
    public void numeroUnidades(File ficheiro){
        try{
            ou=new FileWriter (ficheiro, true);
            fich=new PrintWriter(ou);
            fich.println("2780");
            fich.println("290");
            fich.println("17200");
        } catch (IOException ex){
            System.out.println("erro no numero de unidades"+ex.getMessage());
        }
        finally{
            fich.close();
        }
        
    }
    
    */
}
