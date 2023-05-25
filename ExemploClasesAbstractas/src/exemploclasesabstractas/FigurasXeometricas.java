package exemploclasesabstractas;


public abstract class FigurasXeometricas {
    private float base;
    private float altura;
    
    //constructor para poder crear ass figuras cos atributos

    public FigurasXeometricas(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    //metodso Abstractos
    public abstract float calcularArea();
    public abstract float calularPerimetro();
    
    
}
