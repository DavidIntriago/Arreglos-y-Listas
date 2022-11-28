/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Lista {
    public Nodo inicio;
    public Nodo fin;
       
    public Lista(){
        inicio=null;
        fin=null;
        
    }
    
    public boolean estaVacia(){
        if (inicio==null) {
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarPersona(Persona persona){
        Nodo dato;
        if (estaVacia()) {
            dato=new Nodo(null, persona);
            inicio=dato;
            fin=dato;
        }else{
            dato=new Nodo(null, persona);
            fin.setSiguiente(dato);
            fin=dato;
        }
    }
    
    public void mostrar(){
        
        if (estaVacia()) {
            System.out.println("esta vacia");
        }else{
            Nodo viajero;
            viajero=inicio;
            while (viajero!=null) {                
                System.out.println(viajero.getDato().toString());
                viajero=viajero.getSiguiente();
                
            }
        }
    }
    
    
}
