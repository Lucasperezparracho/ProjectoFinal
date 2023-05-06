
package boletin33;


public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " da un masaje");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Se concentra el masajista " + getNombre() + " " + getApellidos());
    }

    @Override
public void viajar() {
    System.out.println("Viaja el masajista " + getNombre() + " " + getApellidos());
}

@Override
public void entrenar() {
    System.out.println("El masajista " + getNombre() + " " + getApellidos() + " ayuda en el entrenamiento");
}

@Override
public void jugarPartido() {
    System.out.println("El masajista " + getNombre() + " " + getApellidos() + " asiste al equipo en el partido");
}


    
}
