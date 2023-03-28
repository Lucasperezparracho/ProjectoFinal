package boletin_26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Operaciones<T extends Comparable<T>> {
    public T minimo(Collection<T> lista) {
        if(lista.isEmpty()) {
            throw new RuntimeException("La lista está vacía");
        }
        T min = lista.iterator().next();
        for(T elem : lista) {
            if(elem.compareTo(min) < 0) {
                min = elem;
            }
        }
        return min;
    }
    
    public T maximo(Collection<T> lista) {
        if(lista.isEmpty()) {
            throw new RuntimeException("La lista está vacía");
        }
        T max = lista.iterator().next();
        for(T elem : lista) {
            if(elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }
    
    public int buscar(Collection<T> lista, T objeto) {
        int posicion = 0;
        for(T elem : lista) {
            if(elem.equals(objeto)) {
                return posicion;
            }
            posicion++;
        }
        return -1;
    }
    
    public T eliminar(Collection<T> lista, T objeto) {
        for(T elem : lista) {
            if(elem.equals(objeto)) {
                lista.remove(elem);
                return elem;
            }
        }
        return null;
    }
}
