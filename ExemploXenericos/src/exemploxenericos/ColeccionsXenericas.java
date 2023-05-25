package exemploxenericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import milibreria.PedirDatos;


public class ColeccionsXenericas<T> {

    static void amosar(ArrayList<Xogador> lista) {
        for (Xogador ele : lista) {
            System.out.println(lista);
        }    }
    private T dato;
    
    public ColeccionsXenericas(){
        
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    public ArrayList<Xogador> engadir(Xogador xogador, ArrayList<Xogador> lista) {
        Xogador xo = new Xogador(PedirDatos.pedirString("nome : "), PedirDatos.pedirInt("dorsal : "));
        lista.add(xo);
        return lista;
    }
    public <T> void add(T elemento, ArrayList<T> lista){
        lista.add(elemento);
    }
    public static <T> void show(ArrayList<T> lista){
        for(T ele: lista){
            System.out.println(ele+" ");
        }
    }    
    public <T> void Ordenar(ArrayList<T>lista){
        lista.sort((Comparator<? super T>) Comparator.naturalOrder());
        for(T ele: lista){
            System.out.println(ele);
        }
    }        
}