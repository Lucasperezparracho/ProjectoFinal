
package boletin_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Liga {
    private List<Equipo> equipos;

    public Liga(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Equipo> getEquiposPorNumGoles() {
        List<Equipo> equiposOrdenados = new ArrayList<>(equipos);
        Collections.sort(equiposOrdenados, Comparator.comparing
