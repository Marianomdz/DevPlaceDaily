/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahoracado_poo;

import java.util.Scanner;

/**
 *
 * @author Mariano_mdz
 */
public class ahorcadoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ahorcadoClass crearJuego() {
        String palabra;
        String palabra2 = "";
        int oportunidades;
        System.out.println("**********************");
        System.out.println("*Juego del Ahorcado!!*");
        System.out.println("**********************");
        System.out.println("");
        System.out.println("Por favor ingrese la plabra a adivinar");
        palabra = leer.nextLine();
        palabra = palabra.toUpperCase();
        System.out.println("Ingrese la cantidad de oportunidades");
        oportunidades = leer.nextInt();

        //palabraBuscar = new String[palabra.length()];
        //char[] palabraBuscar = new char[palabra.length()];
        //char[] palabraEncontrada = new char[palabra.length()];
        //  ahorcadoClass[] vectorLista = new ahorcadoClass[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabra2 = (palabra2 + "-");

        }
        return new ahorcadoClass(palabra, palabra2, 0, oportunidades);

    }

    public void longitudPalabra(ahorcadoClass p) {

        System.out.println("La palabra tiene: " + p.getPalabraAdivinar().length() + " Letras y tiene " + p.getCantJugadas() + " oportunidades");
        for (int i = 0; i < p.getPalabraAdivinar().length(); i++) {
            //p.getVectorEncontradas()[i] = '_';
            System.out.println(" - ");
        }

    }

    public boolean buscaLetra(ahorcadoClass p) {

        char letraBuscar;
        boolean encontrada = false;
        boolean terminado = true;
        // char[] vectorAux = new char[p.getPalabraAdivinar().length()];
        //vectorAux = p.getPalabraAdivinar().toCharArray();

        System.out.print("\nPor favor ingrese una letra ");
        letraBuscar = leer.next().charAt(0);
        letraBuscar = Character.toUpperCase(letraBuscar);
        if (p.getCantJugadas() > 0) {

            for (int i = 0; i < p.getPalabraAdivinar().length(); i++) {
               
                    if (p.getVectorPalabra()[i] == letraBuscar) {

                        encontrada = true;

                        p.getVectorEncontradas()[i] = p.getVectorPalabra()[i];

                    }
                    terminado = false;
               
            }
        } else {
            return finPrograma(encontrada, p);
        }

        return intentos(encontrada, p);
    }

    public boolean finPrograma(boolean encontrada, ahorcadoClass p) {
        //System.out.println("Felicitaciones juego finalizado");
        if (encontrada) {
            System.out.println("Felicitaciones!! Has Ganado, juego finalizado");
        } else {
            System.out.println("Juego Finalizado, Segui participando");
        }
//        for (int i = 0; i < p.getVectorPalabra().length; i++) {
//
//            System.out.print(p.getVectorEncontradas()[i]);
//
//        }
//        System.out.println("");

        return false;
    }

    public boolean intentos(boolean encontrada, ahorcadoClass p) {
        boolean terminado = true;
        if (encontrada) {
            System.out.println("\nLetra Encontrada");
        } else {
            System.out.println("Letra NO encontrada");
            p.setCantJugadas(p.getCantJugadas() - 1);
            System.out.println("Le quedan " + p.getCantJugadas() + " oportunidades");
        }
        for (int i = 0; i < p.getVectorPalabra().length; i++) {

            if (p.getVectorEncontradas()[i] == p.getVectorPalabra()[i]) {
                System.out.print(p.getVectorEncontradas()[i]);

            } else {
                System.out.print(p.getVectorEncontradas()[i]);
                terminado = false;
            }
            
        }
         System.out.println("");
         
         if (terminado){
             return finPrograma(terminado, p);
         }else{
         return buscaLetra(p);
         }
    }

    public void Jugar(ahorcadoClass p) {

        //crearJuego();
        longitudPalabra(p);
        buscaLetra(p);

    }

}
