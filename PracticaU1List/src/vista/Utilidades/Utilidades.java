/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.Utilidades;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Lista;

/**
 *
 * @author Usuario
 */
public class Utilidades {
    public static String DIRCARDATA="data";
    public static Gson gson=new Gson();
    
     public static boolean guardarArchivoJson(Lista personas){
        Gson gson=new Gson();
        String json = gson.toJson(personas);
        try (BufferedWriter br = new BufferedWriter(new FileWriter("datosJons.json"))){
            br.write(json);
            //            File archivo=new File(DIRCARDATA+File.separatorChar+"bolsa.json");
//            FileOutputStream salida=new FileOutputStream(gson.toJson(br));
//            BufferedOutputStream ous= new BufferedOutputStream(salida);
           
//            ObjectOutputStream ous= new ObjectOutputStream(salida);
//            ous.writeObject(bolsas);
//            ous.flush();
//            ous.close();
//            salida.close();
            return true;
            }
        catch (IOException e) {
            System.out.println("Error" +e);
            return false;
        }
        
    }
     
     public static Lista cargarArchivoJSON(){
        String json = "";
        Gson gson = new Gson();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("datosJons.json"));
            String linea = "";
            while((linea = br.readLine()) != null){
                json += linea;
            }
            
            br.close();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        
        Lista personas = gson.fromJson(json, Lista.class);
        return personas;
    }
    
}
