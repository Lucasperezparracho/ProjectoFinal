
package boletin_21;

import java.util.Arrays;
import java.util.Collections;

public class Boletin_21 {
    
    public static void main(String[] args) {
         Integer[] numeros = new Integer[6];
        for(int i=0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random() * 50) + 1;
        }
        System.out.println("Array original: " + Arrays.toString(numeros));
        Collections.reverse(Arrays.asList(numeros));
        System.out.println("Array al revés: " + Arrays.toString(numeros));
    
    }
}
