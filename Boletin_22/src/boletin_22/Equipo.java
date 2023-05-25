
package boletin_22;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jornada> jornadas;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jornadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(List<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    public int getTotalGoles() {
        int total = 0;
        for (Jornada jornada : jornadas) {
            total += jornada.getTotalGoles();
        }
        return total;
    }

    public int getNumGolesEnJornada(int numJornada) {
        int goles = 0;
        for (Jornada jornada : jornadas) {
            if (jornadas.indexOf(jornada) + 1 == numJornada) {
                goles = jornada.getTotalGoles();
                break;
            }
        }
        return goles;
    }
}
