package boletin_26;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(3);
        lista.add(8);
        
        Operaciones<Integer> operaciones = new Operaciones<>();
        
        System.out.println("Mínimo: " + operaciones.minimo(lista));
        System.out.println("Máximo: " + operaciones.maximo(lista));
        System.out.println("Posición del 3: " + operaciones.buscar(lista, 3));
        System.out.println("Posición del 7: " + operaciones.buscar(lista, 7));
        System.out.println("Elemento eliminado: " + operaciones.eliminar(lista, 3));
        System.out.println("Posición del 3: " + operaciones.buscar(lista, 3));
    }
}
