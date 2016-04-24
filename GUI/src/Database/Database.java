/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Orang;
import Model.dosen1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Win7
 */
public class Database {

    public void SaveDataDosen(ArrayList<dosen1> d) {
        try {
            FileOutputStream fos = new FileOutputStream("FileDosen.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            }
            catch(IOException e){
                System.out.println("error" +e);
            }
        }
    
    public  ArrayList<dosen1> LoadDosen (){
           ArrayList<dosen1> tmp=null;
           try{
               FileInputStream fis = new FileInputStream("FileDosen.txt");
               ObjectInputStream ois = new ObjectInputStream(fis);
               tmp = (ArrayList<dosen1>) ois.readObject();
           }
           catch (IOException e){
               System.out.println("error data" +e);
           }
           catch (ClassNotFoundException c){
               System.out.println("Class Not Found" +c);
           }
           return tmp;
               
    }
    }

