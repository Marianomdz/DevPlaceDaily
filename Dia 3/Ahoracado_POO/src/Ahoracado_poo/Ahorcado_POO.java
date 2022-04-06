package Ahoracado_poo;

/*
 * @author Mariano_mdz 
 */
public class Ahorcado_POO {

    public static void main(String[] args) {

        ahorcadoServicios ahorcado1 = new ahorcadoServicios();

        ahorcadoClass juego1 = ahorcado1.crearJuego();

        ahorcado1.Jugar(juego1);

// ahorcado1.longitudPalabra(juego1);
        // ahorcado1.buscaPalabra(juego1);
        // ahorcado1.longitudPalabra(juego1.vectorPalabra);
//        clasePersona[] vectorLista = servicioP.crearPersonasTEST();
//        
//        servicioP.porcentajeEdad(vectorLista);
//        servicioP.porcentajePeso(vectorLista);
        System.out.println("");
    }

}
