package exemploclasesabstractas;

public class Triangulo extends FigurasXeometricas implements IDibujable,IRotable {

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return (super.getBase()*getAltura()/2);
    }

    @Override
    public float calularPerimetro() {
        return (3*super.getBase());//equilatero
    }

    @Override
    public void dibujar() {
        System.out.println("dibujamos el triangulo");
        
    }

    @Override
    public void rotar() {
        System.out.println("Rotamos el triangulo");

    }
    
}
