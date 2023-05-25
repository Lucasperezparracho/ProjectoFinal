
package escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFicheiro {
    FileWriter ou=null;
    PrintWriter fich=null;
    public void engadirRexistro(File ficheiro){
        
        try {
            ou=new FileWriter (ficheiro,true);
            fich=new PrintWriter(ou);
            fich.println("Sabado");


        }catch (IOException ex){
            System.out.println("erro de palabra"+ex.getMessage());
        }
        finally{
            fich.close();
        }
        
    }
    public void escribirPalabras(File ficheiro){
        
        try {
            ou=new FileWriter (ficheiro);
            fich=new PrintWriter(ou);
            fich.println("Lun***");
            fich.println("Martes");
            fich.println("Mercores");
            fich.println("Xoves");


        }catch (IOException ex){
            System.out.println("erro de palabra"+ex.getMessage());
        }
        finally{
            fich.close();
        }
    }
}