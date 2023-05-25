
package boletin_22;

import java.util.ArrayList;
import java.util.List;

public class Jornada {
    private List<Gol> goles;

    public Jornada(List<Gol> goles) {
        this.goles = goles;
    }

    public List<Gol> getGoles() {
        return goles;
    }

    public void setGoles(List<Gol> goles) {
        this.goles = goles;
    }

    public int getTotalGoles() {
        int total = 0;
        for (Gol gol : goles) {
            total += gol.getNumGoles();
        }
        return total;
    }

    public Equipo getEquipoConMasGoles() {
        int maxGoles = 0;
        Equipo equipoMaxGoles = null;
        for (Gol gol : goles) {
            if (gol.getNumGoles() > maxGoles) {
                maxGoles = gol.getNumGoles();
                equipoMaxGoles = gol.getEquipo();
            }
        }
        return equipoMaxGoles;
    }
}
