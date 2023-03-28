
package libros;

public class Libro {
    
    private String nomeLibro;
    private String nomeAutor;
    private float precio;
    private int unidades;

    public Libro() {
    }

    public Libro(String nomeLibro, String nomeAutor, float precio, int unidades) {
        this.nomeLibro = nomeLibro;
        this.nomeAutor = nomeAutor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    
}
