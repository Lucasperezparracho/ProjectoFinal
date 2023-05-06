
package boletin33;


public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
    
    public void entrevista() {
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " concede una entrevista");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Se concentra el futbolista " + getNombre() + " " + getApellidos());
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el fubolista" + getNombre() + " " + getApellidos());
    }

    @Override
    public void entrenar() {
        System.out.println("Viaja el fubolista" + getNombre() + " " + getApellidos());
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega el partido" + getNombre() + " " + getApellidos());
    }
}

