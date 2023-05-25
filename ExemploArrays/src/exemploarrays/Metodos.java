
package exemploarrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Metodos {
    static int tam =0;
    public float[] crearArray(){
        float []temperaturas = new float[10];
        for(int i=0;i<temperaturas.length;i++){
            temperaturas[i]=i;
            //System.out.println("temperaturas"+ temperaturas[i]);
        }
        int i = 0;
        tam =i;
        return temperaturas;
        
           
    }
    public void amosarArray(float[]temperaturas){
        for (int i = 0; i < tam; i++) {
            System.out.println("temperaturas = " + temperaturas[i]);
                 
            
        }
    }
    void amosarPorPosicion(float[]temperaturas, int posicion){
        System.out.println("temperatura = " + temperaturas[posicion-1]);
    }
    /*public static float pedirFloat(String mensaxe){
        return Float.parseFloat()
    }*/
    
    
    
    public void amosarArrayForeach(float []temperaturas){
        for(Float elemento:temperaturas)
            System.out.println("******"+ elemento);
    }
    
    
    
    public void buscarElementos(float []temperaturas){
        int atopado =0;
        for(int i=0; i< tam ; i++){
            float elebuscar = 0;
            if(elebuscar == temperaturas[i]){
                System.out.println("a temperatura está na posición"+(i+1));
                atopado =1;
                break;
                
            }
            
        }
        if (atopado ==0)
            System.out.println("esta temperatura non está na lista");
    }
    public void ordenarElementos(Float []temperaturas){
        /*float aux;
        for(int i=0; i<tam-1; i++){
            for(int j=i+1; i< temperaturas.length; j++){
            if(temperaturas [i]>temperaturas [j]){
                aux=temperaturas [i];
                temperaturas [i]=temperaturas [j];
                aux = temperaturas [j];
            }           
        }
        }
        System.out.println("Array ordenado");*/
        //Arrays.sort(temperaturas);
    }
    public void engadirElemento(float []lista){
        if(tam<lista.length){
            float eleEngadir = PedirDatos.;
            lista[tam+1]=eleEngadir;
            tam++;
        }
    }
    public void borrar (float[]lista){
        int atopado =0;
        int i,j;
        float eleborrar = PedirDatos.;
        for(i=0;i<tam;i++){
            if(eleborrar == lista[i]){
            atopado=1;
            lista[j]=lista[j+i];
            }
        }
    }
}
