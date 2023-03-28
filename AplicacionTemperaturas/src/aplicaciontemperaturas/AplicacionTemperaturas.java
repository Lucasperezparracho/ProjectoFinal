
package aplicaciontemperaturas;


public class AplicacionTemperaturas {

    
    public static void main(String[] args) {
        
        ConvensorTemperaturas conversor = new ConvensorTemperaturas();

        float temperaturaCentigrados = 81.0f; // Temperatura en grados centígrados
        
        try {
            float temperaturaFharenheit = conversor.centigradosAFharenheit(temperaturaCentigrados);
            float temperaturaReamur = conversor.centigradosAReamur(temperaturaCentigrados);
            
            System.out.println("Temperatura en grados centígrados: " + temperaturaCentigrados);
            System.out.println("Temperatura en grados Fharenheit: " + temperaturaFharenheit);
            System.out.println("Temperatura en grados Reamur: " + temperaturaReamur);
        } catch (TemperaturaErradaExcepcion e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
