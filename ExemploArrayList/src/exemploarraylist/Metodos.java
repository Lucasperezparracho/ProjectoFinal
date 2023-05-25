
package exemploarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Metodos {
    
    
    ArrayList lista = new ArrayList();//podemos meterlle 
    public void crear(){
        lista.add(2);
        lista.add("aaa");
        lista.add(2.3);
        lista.add('b');
        
    }
    public void ver(){
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
            
        }
    }
    public void anadir(int num){
        lista.add(num);
    }
    public void anadirPosicion(int posicion){
        lista.add(posicion, 10);
    }
    public void borrar(){
        Iterator it = lista.iterator();
        while(it.hasNext())
            if((int)it.next()==3)
                it.remove();
    }
    public void borrarPosicion(int posicion){
        lista.remove(posicion);
    }
    public void buscar(int num){
        for (int i = 0; i < lista.size(); i++) {
            if(num = lista.set(i, num));
            
        }
    }
    public void ordenar(){
        Collections.sort(lista);
    }
public void borrar2(){
    lista.remove(Integer.valueOf(5));
}    
}
