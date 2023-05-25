
package exemplostring;


public class Metodos {
    String nome="Nabuconodosor";
    public void crearString(){
    int numLetras = nome.length();
        System.out.println("Numero de letras= "+numLetras);
    }
    public void pasarAMaiusculas(){
      String mayus= nome.toUpperCase();
        System.out.println("Nome en mayusculas= "+mayus);    
    }
    public void pararAMinusculas(){
        String minus= nome.toLowerCase();
        System.out.println("Nome en minusculas= "+minus);
    }
    public void compararIgual(){
        int comparacion= nome.compareTo("Nabuconodosor");
        System.out.println("Comparacion de strings= "+comparacion);       
    }
   
     
    public void comparar(){
        int comparacion= nome.compareToIgnoreCase("nabuconodosor");
        System.out.println("Comparacion de strings= "+comparacion);       
    }
    public void pasarAChar(){
        char[] sarray=nome.toCharArray();
        for(int x=0;x<sarray.length;x++)
            System.out.println("Array de strings= "+sarray[x]);
    }
    public void cortar(){
        String nome= "Nabuconodosor";
        System.out.println("String cortado= "+nome.substring(0,4));
    }
    
}













/*

public String toLowerCase()//mayus

public String toUpperCase()//minus

//comparar
public boolean equalsIgnoreCase(String anotherString)

 equalsIgnoreCase(String)

//a char


//cortar por la C
*/