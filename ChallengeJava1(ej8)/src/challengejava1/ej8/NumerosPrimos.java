package challengejava1.ej8;

import java.util.Scanner;

/*
 * @author Mariano_mdz 
 */
public class NumerosPrimos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Comienza numeros Primos
    public void Ingresar() {
        Integer numero1;
        
        do {
        System.out.println("Ingrese un número:");
        numero1 = leer.nextInt();
        } while (numero1 < 1 || numero1 >=15); 
        
        
            if (esnumPrimo(numero1)) {
                
                System.out.println(numero1 + " es primo, ");
            } else {
                System.out.println(numero1 + " No es primo, ");
            }
        }
        
    public static boolean esnumPrimo(int numero1) {
        // Verifico si es numero 0, 1 y 4, si lo son los decarto, ya que no son primos
        if (numero1 == 0 || numero1 == 1 || numero1 == 4) {
            return false;
        }
        for (int x = 2; x < numero1 / 2; x++) {
            // Si el numero es divisible por cualquiera de estos números, no es primo

            if (numero1 % x == 0) {
                return false;
            }
        }
        // Si lo pude dividir por ninguno de los numeros anteriores, es numero primo
        return true;
    }


}
