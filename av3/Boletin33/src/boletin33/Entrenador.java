package boletin33;

public class Entrenador extends SeleccionFutbol {

    public Entrenador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void planificarEntrenamiento() {
        System.out.println("Planifica el entrenamiento " + getNombre() + " " + getApellidos() + " selecciona ejercicios");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el seleccionador " + getNombre() + " " + getApellidos());
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el entrenador" + getNombre() + " " + getApellidos());
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el entrenador" + getNombre() + " " + getApellidos());
    }

    @Override
    public void jugarPartido() {
        System.out.println("juega el partido el entrenador" + getNombre() + " " + getApellidos());
    }
}
