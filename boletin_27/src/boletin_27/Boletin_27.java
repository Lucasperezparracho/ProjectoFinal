
package boletin_27;

import java.io.File;
import mantemento.Mantemento;

public class Boletin_27 {

    
    public static void main(String[] args) {
        
        Mantemento li = new Mantemento();
        File f = new File("biblioteca");        
        li.engadirLibro(f);
        
        
        
        
    }
    
}
