package principal;

import entidades.Circulo;
import entidades.Rectangulo;
import java.util.Scanner;

/*
 * @author Mariano_mdz 
 */
public class Principal {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");

        
        
        System.out.println("Por favor ingrese el radio del ciculo");
        double radio = leer.nextDouble();
        
        Circulo circulo1 = new Circulo(radio);
        
        System.out.println("Area del Circulo "+circulo1.calacularArea());
        System.out.println("Perimetro del Circulo "+circulo1.calcularPerimetro());
        
        
        System.out.println("Por favor ingrese la Base del rectangulo");
        double base = leer.nextDouble();
        System.out.println("Por favor ingrese la Altura del rectangulo");
        double altura = leer.nextDouble();
        
        Rectangulo rectangulo1 = new Rectangulo(base, altura);
        
        System.out.println("Area del Rectangulo "+rectangulo1.calacularArea());
        System.out.println("Perimetro del Rectangulo "+rectangulo1.calcularPerimetro());
        
    }

}
