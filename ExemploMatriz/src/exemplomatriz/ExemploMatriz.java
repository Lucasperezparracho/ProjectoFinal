
package exemplomatriz;

import java.util.Arrays;


public class ExemploMatriz {

    
    public static void main(String[] args) {
        MetodosMatrices obx = new MetodosMatrices();
        int[][]aux;
        aux=obx.crear();
        System.out.println("la nota media es "+Arrays.toString(obx.media(aux)));
        //obx.mediaAsig(aux);
    }
    
}
