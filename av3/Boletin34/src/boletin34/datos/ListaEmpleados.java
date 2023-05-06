
package boletin34.datos;


import boletin34.entidades.Empregado;
import java.util.ArrayList;

public class ListaEmpleados {
    private ArrayList<Empregado> empregados;

    public ListaEmpleados() {
        empregados = new ArrayList<Empregado>();
    }

    public void engadirEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public ArrayList<Empregado> obterEmpregados() {
        return empregados;
    }
}
