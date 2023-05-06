package boletin33;

public class Boletin33 {

    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 34, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Pep", "Guardiola", 50);
        Masajista masajista = new Masajista(3, "Ana", "García", 40, "Fisioterapeuta", 15);

        futbolista.concentrarse();
        entrenador.planificarEntrenamiento();
        masajista.darMasaje();
    }
}
