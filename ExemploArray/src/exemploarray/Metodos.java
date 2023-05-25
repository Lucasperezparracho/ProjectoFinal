package exemploarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import milibreria.PedirDatos;

/**
 *
 * @author dam1
 */
public class Metodos {

    public ArrayList<Xogador> engadir(ArrayList<Xogador> lista) {
        Xogador xo = new Xogador(PedirDatos.pedirString("nome : "), PedirDatos.pedirInt("dorsal : "));
        lista.add(xo);
        return lista;
    }

    public void amosar1(ArrayList<xogador>) {
        System.out.println(lista);
    }

    public void amosar2(ArrayList<Xogador> lista) {
        for (Xogador elemanto : lista) {
            System.out.println(lista);
        }
    }

    public void amosar3(ArrayList<Xogador> lista) {
        for (int i = 0; i < lista.size; i++) {
            System.out.println(lista.get(i));
        }
    }

    public void amosar4(ArrayList<Xogador> lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            Xogador aux = (Xogador) it.next();
            System.out.println(aux);
        }
    }

    public void buscar(ArrayList<Xogador> lista) {
        int numBuscar = PedirDatos.pedirInt(" que número buscas");
        int atopado = 0;
        for (Xogador elemento : lista) {
            if (numBuscar == elemento.getDorsal()) {
                System.out.println(" o xogador chámase :" + elemento.getNum());
            }
            atopado = 1;
            if (atopado == 0) {
                System.out.println(" ese xogador non esta no equipo");
            }
        }
    }

    public void borrar(ArrayList<Xogador> lista) {
        String nomBuscar = PedirDatos.pedirString(" que xogador qeres borrar");
        Iterator it = lista.iterator();
        Xogador xo;
        while (it.hasNext()) {
            xo = (Xogador) it.next()
                
        }
        if (xo.getNome().equalsIgnoreCase(nomBuscar)) {
            it.remove();
        }
    }

    public void borrar2(ArrayList<Xogador> lista) {
        int atopado = buscar(lista);
      if(atopado ==1){
        String nomBuscar = PedirDatos.pedirString(" que xogador qeres borrar");
        Iterator it = lista.iterator();
        Xogador xo;
        while (it.hasNext()) {
            xo = (Xogador) it.next();
                
        }
        if (xo.getNome().equalsIgnoreCase(nomBuscar)) {
            it.remove();
        }
      }
      else
            System.out.println(numBuscar+"Non está non equipo");
    }
    public void ordenar(ArrayList<Xogador>lista){
        Collections.sort(lista);
    }
}