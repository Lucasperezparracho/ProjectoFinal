package exemploxenericos;

import java.util.ArrayList;


public class ExemploXenericos {

    
    public static void main(String[] args) {
        ColeccionsXenericas <Xogador> obx = new ColeccionsXenericas<>();
        ArrayList<Xogador>lista = new ArrayList<>();
        //falta metodo engadir
        obx.engadir(new Xogador("aaaa",1),lista);
        obx.engadir(new Xogador("bbbb",2),lista);
        obx.engadir(new Xogador("cccc",3),lista);
        obx.engadir(new Xogador("dddd",4),lista);
        ColeccionsXenericas.amosar(lista);
    }
    
}
