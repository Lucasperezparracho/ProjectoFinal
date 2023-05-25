package exemploclasesabstractas;

public class Rectangulo extends FigurasXeometricas implements IDibujable,IRotable {
    

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
    
    
    @Override
    public float calcularArea() {
        return super.getBase()*getAltura();
    }

    @Override
    public float calularPerimetro() {
        return (2*super.getBase())+(2*getAltura());
    }

    @Override
    public void rotar() {
        System.out.println("Rotamos el rectangulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibuxamos o rectangulo");
    }
    
}
