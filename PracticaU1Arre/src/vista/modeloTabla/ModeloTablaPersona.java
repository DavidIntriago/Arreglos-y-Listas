/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modeloTabla;

import javax.swing.table.AbstractTableModel;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class ModeloTablaPersona extends AbstractTableModel {

    private Persona personas[];

    public ModeloTablaPersona() {
    }

    
    
    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return personas.length;
    }

    @Override
    public String getColumnName(int i) {

        switch (i) {
            case 0:
                return "Nombre";
            case 1:
                return "Genero";
            case 2:
                return "Edad";
            case 3:
                return "Clasificacion";
            case 4:
                return "Recomendacion";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Persona p = personas[i];
        switch (i1) {
            
            case 0:
                return (p != null) ? p.getNombre() : "NO DEFINIDO";
            case 1:
                return (p != null) ? p.getGenero() : "NO DEFINIDO";
            case 2:
                return (p != null) ? p.getEdad().toString() : "NO DEFINIDO";
            case 3:
                return (p != null) ? p.getClasificacion() : "NO DEFINIDO";
            case 4:
                return (p != null) ? p.getRecomendacion() : "NO DEFINIDO";
                
            default:
                return null;

        }

    }

}
