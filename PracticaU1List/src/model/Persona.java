/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controlador.controladorPersona;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
    
    private String recomenciones;
    
    private controladorPersona cpPersona;

    public Persona() {
    }

    public Persona(String nombre, String genero, String fechaNacimiento, controladorPersona cpPersona) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.cpPersona = cpPersona;
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

    public controladorPersona getCpPersona() {
        return cpPersona;
    }

    public void setCpPersona(controladorPersona cpPersona) {
        this.cpPersona = cpPersona;
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
        
        return edad=calcularEdad(fechaNacimiento);
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

    public String getRecomenciones() {
        return recomenciones=clasificarRecomendaciones(edad);
    }

    public void setRecomenciones(String recomenciones) {
        this.recomenciones = recomenciones;
    }
    
    


    

    public static int calcularEdad(String date1){
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate date =LocalDate.parse(date1, formato);
        LocalDate fechaHoy = LocalDate.now();
 
		Period periodo = Period.between(date, fechaHoy);
 
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
            recomenciones="A1";
        }else{
            if (edad<=26) {
                recomenciones="A2";
            }else{
                if (edad<=56) {
                    recomenciones="A3";
                }else{
                    recomenciones="A4";
                }
            }
        }
        
        return recomenciones;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + this.getEdad() + ", clasificacion=" + this.getClasificacion() + ", recomendciones="+this.getRecomenciones()+'}';
    }
    

}
