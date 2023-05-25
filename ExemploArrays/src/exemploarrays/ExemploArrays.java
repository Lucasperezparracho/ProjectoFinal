
package exemploarrays;

import javax.swing.JOptionPane;


public class ExemploArrays {
    
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        float[] aux;
        aux= obx.crearArray();
        obx.amosarArray(aux);
        obx.amosarPorPosicion(aux, 2);
        obx.amosarArrayForeach(aux);
        
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n1--->CREAR ARRAY"+"\n3--->AMOSAR  \n3--->BUSQUEDA   \n4--->ORDENAR   \nTeclea opción  \n5--->BORRAR   \nTeclea opción"));
        switch (opcion) {
            case 1:aux=obx.crearArray();
                break;
            case 2:obx.amosarArrayForeach(aux);
                break;
            case 3:obx.buscarElementos(aux);
                break;
            case 4:obx.ordenarElementos(aux);
                break;
            case 5:obx.borrar(aux);
                break;
            case 6:obx.engadirElemento(aux);
                break;
            case 7:System.exit(0);    
                break;
            default:System.out.println("***OPCION INCORRECTA***");
        }while (opcion <=6);
            
        
    }
    
}
