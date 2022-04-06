/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Barajas;
import entidades.Carta;
import entidades.CartasPinta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Mariano_mdz
 */
public class BarajaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> cartas = new ArrayList();

    public ArrayList<Carta> nuevaCarta() {
        Integer numeroCarta = 0;
        String pinta = "Cero";
        Integer arrayNumeros[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

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

        return cartas;

    }

    public void barajarMazo() {

        Collections.shuffle(cartas);
        //System.out.println("************ barajarMazo **********");
        for (Carta aux : cartas) {
            System.out.println(aux.getNumero() + " " + aux.getPalo());
        }
    }

    public void siguienteCarta() {
        String verSiguiente;
        Integer cont = 0;
        for (Carta aux : cartas) {
            cont++;
            if (cont <= cartas.size()) {

                System.out.println("Desa ver la Siguiente carta? S/N");
                verSiguiente = leer.next();

                if (verSiguiente.equalsIgnoreCase("S")) {
                    System.out.println(aux.getNumero() + " " + aux.getPalo());
                } else {
                    break;
                }
            } else {
                System.out.println("No quedan cartas disponibles");
                break;
            }

        }

    }

    public void cartasDisponibles() {

        System.out.println("Cartas disponibles en el Mazo: "+cartas.size()); 
       
    }
    
    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println(carta.getNumero() + " " + carta.getPalo());
        }
    }
    
    public void cartasMonton(){
        for (Carta carta : cartas) {
            System.out.println(carta.getNumero() + " " + carta.getPalo());
        }
    }
}
