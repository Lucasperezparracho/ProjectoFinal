
package exemploexcepciones;


public class ExemploExcepciones {

    
    public static void main(String[] args) {
        DividirExcepciones obx = new DividirExcepciones();
        int nume=8, deno=0;
        try{
            obx.dividirCaNosaExcepcion(nume,deno);
            System.out.println("resultado"+nume/deno);
        }catch(NosaExcepcion e ) {
            System.out.println("non dividir entre 0"+ e.toString());
        }
        System.out.println("fin do programa");
        
        
    }
    
}
