/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Controlador.PersonaControlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Persona {


    private String nombre;
    private String genero;
    private String fechaNacimiento;
    private Integer edad;
    private String clasificacion;
    private String recomendacion;
    
    
    public Persona() {
    }


    public Persona(String nombre, String genero, String fechaNacimiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;//=calcularEdad(fechaNacimiento);
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getClasificacion() {
        
        return clasificacion=clasificacionEdad(edad);
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getRecomendacion() {
        return recomendacion=clasificarRecomendaciones(edad);
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }
    
    


    

    public static int calcularEdad(String date1){
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate date =LocalDate.parse(date1, formato);
 
		Period periodo = Period.between(date, LocalDate.now());
 
		return periodo.getYears();
        
    }
    
    public String clasificacionEdad(Integer edad){
        if (edad<=14) {
            clasificacion="Ninio";
        }else{
            if (edad<=26) {
                clasificacion="Joven";
            }else{
                if (edad<=56) {
                    clasificacion="Adulto";
                }else{
                    clasificacion="Tercera edad";
                }
            }
        }
        return clasificacion;
    }
    
    public String clasificarRecomendaciones(Integer fecha){
        if (edad<=14) {
            recomendacion="A1";
        }else{
            if (edad<=26) {
                recomendacion="A2";
            }else{
                if (edad<=56) {
                    recomendacion="A3";
                }else{
                    recomendacion="A4";
                }
            }
        }
        
        return recomendacion;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + this.getEdad() + ", clasificacion=" + this.getClasificacion() + ", recomendacion="+this.getRecomendacion()+'}';
    }
    

  
}