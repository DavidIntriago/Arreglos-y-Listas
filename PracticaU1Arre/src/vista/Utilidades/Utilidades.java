/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.Utilidades;

import Controlador.PersonaControlador;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Utilidades {

    public static String json = "";

    public static String DIRCARDATA = "data";
    public static Gson gson = new Gson();

    public static boolean guardarArchivoJson(Persona[] personas) {
        Gson gson = new Gson();
        String json = gson.toJson(personas);
        try ( BufferedWriter br = new BufferedWriter(new FileWriter("datosJons.json"))) {
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
        } catch (IOException e) {
            System.out.println("Error" + e);
            return false;
        }

    }

    public static Persona[] cargarArchivoJson() {
        Persona[] personas = null;
        try ( BufferedReader br = new BufferedReader(new FileReader("datosJons.json"))) {
//            InputStream is = ggsGson.class.getClassLoader().getResourceAsStream("datosJons.json");
//            BufferedReader br = new BufferedReader(new InputStreamReader(is));
//            Bolsa[] bolsas1 = gson.fromJson(br, Bolsa[].class);
            String linea;
            while ((linea = br.readLine()) != null) {
                json = json + linea;
//            bolsas=gson.fromJson(json, Bolsa[].class);
//                System.out.println(json);
                br.close();
            }

        } catch (IOException e) {
            System.out.println("Error" + e);

        }
        personas = gson.fromJson(json, Persona[].class);
        return personas;
    }

}
