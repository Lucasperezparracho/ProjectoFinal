
package exemplomatriz;

import java.util.Scanner;

public class MetodosMatrices {
    Scanner sc = new Scanner(System.in);
    public int[][]crear(){
        System.out.println("numero de filas");
        int filas= sc.nextInt();
        System.out.println("numero de columnas");
        int columnas = sc.nextInt();
        int [][]notas= new int[filas][columnas];
        for(int i=0;i<filas;i++){
            System.out.println("Añade notas por asignatura");
            for (int j=0;j<columnas;j++){
                notas[i][j]=sc.nextInt();
            }
        }
        return notas;
    }
    public void ver(int[][]matriz){
        for(int i=0;i< matriz.length;i++){
            System.out.print("| ");
            for(int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.print("|\n");
        }
    }
    public float[] media(int[][]notas){
        float[]media = new float[notas.length];
        for(int i=0; i< notas.length;i++){
            int acu = 0;
            for(int j=0; j< notas[i].length;j++){
                acu = notas[i][j];
            }
            media[i]=acu/notas[i].length;
        }
        return media;
    }
    public float[] mediaAsig(int[][]notas){
        float[]media = new float[notas.length];
        for(int j=0; j< notas.length;j++){
            int acu = 0;
            for(int i=0; i< notas[i].length;j++){
                acu = notas[i][j];
            }
            media[j]=acu/notas[j].length;
        }
        return media;
    }
    public void amosarMatriz(int [][]notas,float []mNotas, float[]nMod){
        String[] nomes = {"aa","bb", "cc","media alumno"};
        String[] modulos = {"PRO","LM", "BD","media mdulos"};
        for (int i = 0; i < modulos.length; i++) {
            System.out.println("    " + modulos[i]+"     ");
            
        for (int i = 0; i < notas.length; i++) {
            System.out.println("    " + notas[i]+"     ");
            
        for (int i = 0; i < modulos.length; i++) {
            System.out.println("    " + modulos[i]+"     ");    
        }
    }
    public void ordenar(int [][]notas,float mNotas[]){
        int aux=0;
        float aux2=0;
        String nome;
        
        for(int i=0;i<notas.length-1;1++){
            for(int j=i+1;j<notas.length;j++){
                if(mNotas[i]<mNotas[j]){
                    aux2 = mNotas[i];
                    mNotas [i]= mNotas[j];
                    mNotas [j]= aux2;
                    aux= nom [i];
                    nom [i]= nom[j];
                    nom [j]= auxNome;
                    
                    
                    
                    for(int k=0;k<notas[i].length;k++){
                        aux =notas[i] [k];
                        notas [i] [k] = notas [j] [k];
                        notas [j] [k] = aux;
                    }
                }
            }
        }
    }
    
    
    
    
    }
