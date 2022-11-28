/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modeloTabla;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import model.Lista;
import model.Nodo;
import model.Persona;

/**
 *
 * @author Usuario
 */
public class ModeloTablaPersona {
    private Lista lista;
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }
//    if (estaVacia()) {
//            System.out.println("esta vacia");
//        }else{
//            Nodo viajero;
//            viajero=inicio;
//            while (viajero!=null) {                
//                System.out.println(viajero.getDato().toString());
//                viajero=viajero.getSiguiente();
//            }
//        }
    
    public void mostrar(JTable panelPersona, Lista lista){
        DefaultTableModel modelo=new DefaultTableModel();
        
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Genero");
        modelo.addColumn("Edad");
        modelo.addColumn("Clasificacion");
        modelo.addColumn("Recomendacion");
        
        panelPersona.setModel(modelo);
        
        
        Object [] object= new Object[5];  
        if (lista.estaVacia()) {
            System.out.println("esta vacia");
        }else{
            Nodo viajero;
            viajero=lista.inicio;
            while (viajero!=null) {                
                System.out.println(viajero.getDato().toString());
                object[0]=viajero.getDato().getNombre();
                object[1]=viajero.getDato().getGenero();
                object[2]=viajero.getDato().getEdad();
                object[3]=viajero.getDato().getClasificacion();
                object[4]=viajero.getDato().getRecomenciones();
                viajero=viajero.getSiguiente();
                modelo.addRow(object);
        }
        
        

        
        
        
    }
    
//       
//    @Override
//    public int getColumnCount() {
//        return 5;
//    }
//
//    @Override
//    public int getRowCount() {
//        return ;
//    }
//
//    @Override
//    public String getColumnName(int i) {
//        
//        switch(i) {
//            case 0: return "Nombre";
//            case 1: return "Edad";    
//            case 2: return "Genero";
//            case 3: return "Clasificacion";
//            case 4: return "Recomendacion";
//            default: return null;
//        }
//    }
//
//    @Override
//    public Object getValueAt(int i, int i1) {
//        Persona pe=new Persona();
//        switch(i1) {
//            case 0: return (pe !=null) ? pe.getNombre(): "No Definido";
//            case 1: return (pe != null) ? pe.getEdad().toString() : "NO DEFINIDO";    
//            case 2: return (pe != null) ? pe.getGenero() : "NO DEFINIDO";    
//            case 3: return (pe != null) ? pe.getClasificacion() : "NO DEFINIDO";
//            default: return null;
//        }
//    }


    
}
}
