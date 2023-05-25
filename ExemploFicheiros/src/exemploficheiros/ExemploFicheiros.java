package exemploficheiros;

import Serializado.LecEscSerializados;
import escritura.EscribirFicheiro;
import java.io.File;
import lectura.LerFicheiros;

public class ExemploFicheiros {

    public static void main(String[] args) {
        /*File f = new File("/home/dam1/Escritorio/alumno.txt");
        LerFicheiros obxLer = new LerFicheiros();
        obxLer.lerObxeto(f);
       
        
        EscribirFicheiro es = new EscribirFicheiro();
        File f = new File ("dia");
        es.escribirPalabras(f);
        
        LerFicheiros obxLer = new LerFicheiros();
        obxLer.lerObxeto(f);
*/
        
        
        File f = new File ("Serializado.dat");
        LecEscSerializados les = new LecEscSerializados();
        les.escribirSeri(f);
        les.lerSerializable(f);
        
    }

    
}