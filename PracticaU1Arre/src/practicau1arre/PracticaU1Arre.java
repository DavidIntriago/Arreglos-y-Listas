/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicau1arre;

import Controlador.PersonaControlador;
import java.util.Date;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class PracticaU1Arre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona personas[]=new Persona[3];
        Persona persona=new Persona("David", "M", "22/05/2003");
        Persona persona1=new Persona("Juan", "M", "22/05/2015");
        Persona persona2=new Persona("Pedro", "M", "22/05/1960");
        
        personas[0]=persona;
        personas[1]=persona1;
        personas[2]=persona2;
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
        
    }
    
}
