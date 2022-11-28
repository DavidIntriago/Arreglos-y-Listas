/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class PersonaControlador {
    private Persona persona;
    private Persona personas[];
    public static String NCOMUN = "NO DEFINIDO";

    public PersonaControlador(Integer nro) {
        personas=new Persona[nro];
        for (int i = 0; i < nro; i++) {
            Persona person=new Persona();
            person.setNombre(NCOMUN);
            person.setGenero(NCOMUN);
            person.setEdad(0);
            person.setClasificacion(NCOMUN);
            person.setFechaNacimiento(NCOMUN);
            person.setRecomendacion(NCOMUN);
            
            personas[i]=person;
        }
    }

    public boolean modificarElemento(Persona persona, Integer pos) throws IndexOutOfBoundsException{
        getPersonas()[pos]=persona;
        return true;
    }
    
    
    public Integer calcularEdad(String date1){
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate date =LocalDate.parse(date1, formato);
 
		Period periodo = Period.between(date, LocalDate.now());
 
		return periodo.getYears();
        
    }
    
    public PersonaControlador(Persona persona, Persona[] personas) {
        this.persona = persona;
        this.personas = personas;
    }

    public PersonaControlador() {
        
    }
    
    //Getters and Setters
    public Persona getPersona() {
        if (persona==null) {
            persona=new Persona();
        }
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona[] getPersonas() {

        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    
    
    
    
}
