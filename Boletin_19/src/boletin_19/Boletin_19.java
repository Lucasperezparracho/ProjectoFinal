
package boletin_19;

public class Boletin_19 {

    
    public static void main(String[] args) {
         // Creamos un objeto de la clase Canario y lo hacemos cantar
        IPodeCantar canario = new Canario();
        canario.cantar();

        // Creamos un objeto de la clase Persona y lo hacemos cantar
        IPodeCantar tenor = new Persona();
        tenor.cantar();
    }
    
}
