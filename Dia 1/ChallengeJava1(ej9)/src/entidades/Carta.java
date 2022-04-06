/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Mariano_mdz
 */
public class Carta {
    
    Integer numero;
    String palo;
    
   // Barajas baraja;

    public Carta() {
    }

    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    
    
    
    
}
