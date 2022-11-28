/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicau1list;

import controlador.controladorPersona;
import java.util.Date;
import model.Lista;
import model.Persona;

/**
 *
 * @author Usuario
 */
public class PracticaU1List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista l=new Lista();
        Persona p= new Persona("Da", "f", "26/08/2003");
        Persona p1=new Persona("Lukas", "M", "26/08/1980");
        l.insertarPersona(p);
        l.insertarPersona(p1);
        l.mostrar();
    }
    
}
