
package Serializado;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class LecEscSerializados {
    ObjectInputStream lec=null;
    ObjectOutputStream escr=null;
    
    public void escribirSeri(File fich){
        
        
        try{
            escr = new ObjectOutputStream(new FileOutputStream(fich));
            AlumnadoSerializado a11 = new AlumnadoSerializado("aa",5);
            AlumnadoSerializado a12 = new AlumnadoSerializado("bb",6);
            AlumnadoSerializado a13 = new AlumnadoSerializado("cc",7);
            
            escr.writeObject(a11);
            escr.writeObject(a12);
            escr.writeObject(a13);
            
            
        }catch (FileNotFoundException ex){
            System.out.println("erro 1 non escribir no ficheiro"+ex.toString());
        }catch (IOException ex){
            System.out.println("erro 2"+ex.getMessage());
        }finally{
            try{
                escr.close();
            }catch (IOException ex){
                System.out.println("erro o pechar o ficheiro"+ex.getMessage());
            }
        }
    }
    
    
    public void lerSerializable(File fich){
        AlumnadoSerializado al = null;
        
        try{
            ler = new ObjectInputStream (new FileInputStream(fich));
            al = (AlumnadoSerializado)ler.readobject();
            while(al!= null){
                System.out.println(al);
                al=(AlumnadoSerializado)ler.read;
            }
        }catch (FileNotFoundException ex){
            System.out.println("erro escritura"+ex.getMessage());
        }catch (IOException ex){
            System.out.println("erro 2"+ex.getMessage());
        }finally{
            try{
                escr.close();
            }catch (IOException ex){
                System.out.println("erro o pechar o ficheiro"+ex.getMessage());
            }
    }        
    
    
}
}
