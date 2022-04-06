package Principal;

import Servicios.BarajaServicios;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Mariano_mdz 
 */
public class BarajaMain {

    public static void main(String[] args) {

        ArrayList<Carta> cartas1 = new ArrayList();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        BarajaServicios baraja1 = new BarajaServicios();

        System.out.println("##################");
        System.out.println("# Mazo de Cartas #");
        System.out.println("##################");

        Integer opcion;

        do {
            System.out.println("Digite una opcion\n"
                    + "1 - Crear mazo de Cartas\n"
                    + "2 - Barajar Mazo\n"
                    + "3 - Mostrar Cartas\n"
                    + "4 - Cantidad de cartas Disponibles\n"
                    + "5 - Dar cartas\n"
                    + "5 - Mostrar montón de cartas salidas\n"
                    + "6 - Mostrar baraja de cartas\n"
                    + "7 - Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    cartas1 = baraja1.nuevaCarta();
                    System.out.println("Mazo creado");
                    System.out.println("");
                    break;
                case 2:
                    baraja1.barajarMazo();
                    System.out.println("Mazo Barajado");
                    System.out.println("");
                    break;
                case 3:
                    baraja1.siguienteCarta();                    
                    System.out.println("");
                    break;
                case 4:
                    baraja1.cartasDisponibles();
                    System.out.println("");
                    break;
                case 5:
                    baraja1.cartasMonton();
                    System.out.println("");
                    break;
                case 6:
                    baraja1.mostrarBaraja();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Ha salido correctamente!!!");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción no disponible.");

            }

        } while (opcion != 7);

    }

}
