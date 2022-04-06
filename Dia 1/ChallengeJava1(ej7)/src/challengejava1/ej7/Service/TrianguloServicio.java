package challengejava1.ej7.Service;

import challengejava1.ej7.Triangulo;
import java.util.Scanner;

/*
 * @author Mariano_mdz 
 */
public class TrianguloServicio {

    Triangulo t = new Triangulo();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void QueSoy() {

        System.out.println("Ingrese el lado 1");
        t.setLado1(sc.nextDouble());
        System.out.println("Ingrese el lado 2");
        t.setLado2(sc.nextDouble());
        System.out.println("Ingrese el lado 3");
        t.setLado3(sc.nextDouble());

        if (t.getLado1().equals(t.getLado2()) && t.getLado2().equals(t.getLado3())) {
            System.out.println("El Triangulo es Equilatero");
        } else {
            if (t.getLado1().equals(t.getLado2()) || t.getLado1().equals(t.getLado3()) || t.getLado2().equals(t.getLado3())) {
                System.out.println("El Triangulo es Isoceles");
            } else {
                if (!t.getLado1().equals(t.getLado2()) || !t.getLado1().equals(t.getLado3()) || !t.getLado2().equals(t.getLado3())) {
                    System.out.println("El Triangulo es Escaleno");
                }
            }
        }
    }

}
