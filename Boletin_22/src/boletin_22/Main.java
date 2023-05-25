
package boletin_22;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear los equipos
        Equipo celta = new Equipo("Celta");
        Equipo bilbao = new Equipo("Bilbao");
        Equipo malaga = new Equipo("Málaga");

        // Crear las jornadas
        List<Jornada> jornadas = new ArrayList<>();
        jornadas.add(new Jornada(List.of(new Gol(3), new Gol(1), new Gol(3))));
        jornadas.add(new Jornada(List.of(new Gol(4), new Gol(2), new Gol(0))));
        jornadas.add(new Jornada(List.of(new Gol(2), new Gol(1), new Gol(1))));
        // Crear las referencias a las jornadas en los equipos correspondientes
        celta.setJornadas(jornadas.subList(0, 3));
        bilbao.setJornadas(jornadas.subList(0, 3));
        malaga.setJornadas(jornadas.subList(0, 3));

        // Crear la liga con los equipos
        Liga liga = new Liga(List.of(celta, bilbao, malaga));

        // 2- Obtener un listado de los equipos por orden de menor número de goles en la liga.
        List<Equipo> equiposOrdenadosPorNumGoles = liga.getEquiposPorNumGoles();
        System.out.println("Equipos por orden de menor número de goles en la liga:");
        for (Equipo equipo : equiposOrdenadosPorNumGoles) {
            System.out.println(equipo.getNombre());
        }

        // 3- Indicar el equipo que marca más goles en cada jornada.
        System.out.println("Equipos que marcan más goles en cada jornada:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Jornada " + i + ": " + liga.getEquipoConMasGolesEnJornada(i).getNombre());
        }

        // 4- Indicar el equipo y en qué jornada se registran más goles.
        int maxGoles = 0;
        Equipo equipoMaxGoles = null;
        int numJornadaMaxGoles = 0;
        for (int i = 1; i <= 3; i++) {
            Equipo equipo = liga.getEquipoConMasGolesEnJornada(i);
            int goles = equipo.getNumGolesEnJornada(i);
            if (goles > maxGoles) {
                maxGoles = goles;
                equipoMaxGoles = equipo;
                numJornadaMaxGoles = i;
            }
        }
        System.out.println("Equipo que registra más goles: " + equipoMaxGoles.getNombre() + " en la jornada " + numJornadaMaxGoles);

        // 5- Consultas por equipo y jornada indicando el número de goles.
        System.out.println("Número de goles de cada equipo en cada jornada:");
        for (Equipo equipo : liga.getEquipos()) {
            System.out.println("Equipo: " + equipo.getNombre());
            for (int i = 1; i <= 3; i++) {
                int goles = equipo.getNum

