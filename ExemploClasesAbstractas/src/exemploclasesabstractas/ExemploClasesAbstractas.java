package exemploclasesabstractas;


public class ExemploClasesAbstractas {

    public static void main(String[] args) {
       /* Rectangulo obxRec = new Rectangulo(4,2);
        System.out.println("Area Rectangulo= "+obxRec.calcularArea());
        System.out.println("Perimetro Rectangulo= "+obxRec.calularPerimetro());
        FigurasXeometricas obxTri = new Triangulo(4,2);
        System.out.println("Area Triangulo= "+obxTri.calcularArea());
        System.out.println("Perimetro Triangulo= "+obxTri.calularPerimetro());
        //FigurasXeometricas fi = new FigurasXeometricas();
        //no se puede instanciar por ser abstracta.

        */
        
        
        Rectangulo rec = new Rectangulo (8,5);
        rec.dibujar();
        FigurasXeometricas obx = new Triangulo(5f,7f);
        Triangulo tri = new Triangulo(3, 4);
        
                
          
    }
    
    
}