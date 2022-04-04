/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mariano_mdz
 */
public class Barajas {

    String nombre;

    ArrayList<Carta> ListaCartas;

    public Barajas(String nombre, ArrayList<Carta> ListaCartas) {
        this.nombre = nombre;
        this.ListaCartas = ListaCartas;
    }

    

    
    public Barajas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public ArrayList<Carta> getListaCartas() {
//        return ListaCartas;
//    }
//
//    public void setListaCartas(ArrayList<Carta> ListaCartas) {
//        this.ListaCartas = ListaCartas;
//    }
    @Override
    public String toString() {
//        return "Barajas{" + "nombre= " + nombre + ", ListaCartas= " + ListaCartas + '}';
        return "Barajas{" + "nombre= " + nombre + ", ListaCartas= " + '}';
    }

}
