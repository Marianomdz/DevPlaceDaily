/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Carta;
import java.util.ArrayList;

/**
 *
 * @author Mariano_mdz
 */
public class CartaServicios {

    public ArrayList<Carta> nuevaCarta() {
        Integer numeroCarta = 0;
        String pinta = "Cero";
        Integer arrayNumeros[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        ArrayList<Carta> cartas = new ArrayList();

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < arrayNumeros.length; j++) {
                Carta carta1 = new Carta();

                if (i == 0) {
                    pinta = "Basto";
                    numeroCarta = arrayNumeros[j];
                    carta1.setNumero(numeroCarta);
                    carta1.setPalo(pinta);
                }
                if (i == 1) {
                    pinta = "Copa";
                    numeroCarta = arrayNumeros[j];
                    carta1.setNumero(numeroCarta);
                    carta1.setPalo(pinta);
                }
                if (i == 2) {
                    pinta = "Oro";
                    numeroCarta = arrayNumeros[j];
                    carta1.setNumero(numeroCarta);
                    carta1.setPalo(pinta);
                }
                if (i == 3) {
                    pinta = "Espada";
                    numeroCarta = arrayNumeros[j];
                    carta1.setNumero(numeroCarta);
                    carta1.setPalo(pinta);
                }
                
                cartas.add(carta1);
            }
        }

        for (Carta carta : cartas) {
            System.out.println(carta.getNumero()+" "+carta.getPalo());
        }
        
        return cartas; 
    
    }
}
