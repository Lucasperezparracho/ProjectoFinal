package lectura;

import exemploficheiros.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerFicheiros {

    Scanner sc;

    public void lerPalabras(File ficheiro,String del) {
        try {
            sc = new Scanner(ficheiro).useDelimiter("\\s*,\\s*");
            while (sc.hasNext()) {
                String dato = sc.next();
                System.out.println(dato);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro 1" + ex.getMessage());
        } finally {
            sc.close();
        }

    }

    public void lerLiña(File ficheiro) {

    }

    /*
    public ArrayList<Integer> lerNumero(File ficheriro) {
        int num;
        ArrayList<Integer>lista = new ArrayList<>();
        try {
            sc = new Scanner(ficheiro);
            while (sc.hasNextInt());
            num = sc.nextInt();
            lista.add(num);

        }catch (FileNotFoundException ex){
        System.out.print("erro ler numero" + ex.getMessage());
    }
    finally{
        sc.close();
    }
    for(String ele:lista){
        System.out.println(ele);
    }
        return lista;
    }
     

    public ArrayList<Integer> lerNumeroConDelimitadores(File ficheriro) {
        int num;
        ArrayList<Integer> lista = new ArrayList<>();
        try {
            sc = new Scanner(ficheiro);
            while (sc.hasNextInt());
            num = sc.nextInt();
            lista.add(num);

        } catch (FileNotFoundException ex) {
            System.out.print("erro ler numero" + ex.getMessage());
        } finally {
            sc.close();
        }
        for (String ele : lista)
            System.out.println(ele);
        
        return lista;
    }
    */
    
    
    

    public void lerObxeto(File ficheiro){
        ArrayList<Alumno>lista = new ArrayList<>();
        String []aux = new String[2];
        try {
            sc = new Scanner(ficheiro);
            while(sc.hasNextLine()){
                aux=sc.nextLine().split(", ");
                lista.add(new Alumno(aux[0],Integer.parseInt(aux[1])));
            }
            
        }catch (FileNotFoundException ex) {
            System.out.println("non se pode ler do ficheiro");
        }
        finally{
            sc.close();
        }
        for(Alumno al:lista)
            System.out.println(al);
        
    }
    
    
    
    
    
    }