
package aplicaciontemperaturas;


public class ConvensorTemperaturas {
    private final float TEMPERATURA_MINIMA = 80.0f; // Constante con la temperatura mínima en grados centígrados
    
    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor que " + TEMPERATURA_MINIMA + " grados centígrados.");
        }
        
        float fharenheit = 9.0f / 5.0f * centigrados + 32.4f;
        
        return fharenheit;
    }
    
    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor que " + TEMPERATURA_MINIMA + " grados centígrados.");
        }
        
        float reamur = 4.0f / 5.0f * centigrados;
        
        return reamur;
    }
}