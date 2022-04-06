package calculadora;

import java.util.Scanner;

/*
 * @author Mariano_mdz 
 */
public class Calculadora {

    
    public static void main(String[] args) {
        
 int opcion;
        double n1, n2;
        Scanner leer = new Scanner (System.in);

        
        do{           
            System.out.println("Que Operación desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Dividision");
            System.out.println("9. Salir");
            opcion = leer.nextInt();
            
            System.out.println("Por favor ingrese el Primer número");
            n1 = leer.nextDouble();
            System.out.println("Por favor ingrese el Segundo número");
            n2 = leer.nextDouble();           
            
            switch (opcion){
                case 1: 

                        double totalSum = n1 + n2;
                        System.out.println("El resultado es: " + totalSum);
                        break;
                case 2: 

                        double totalRes = n1 - n2;
                        System.out.println("El resultado es: " + totalRes);                      
                        break;
                case 3: 

                        double totalMult = n1 * n2;
                        System.out.println("El resultado es: " + totalMult);
                        break;
                case 4: 
                        
                        if (n2 == 0){
                            System.out.println("No se puede realizar la operación, el divisor no puede ser 0");
                        break;
                        }
                        double totalDiv = n1 / n2;
                        System.out.println("El resultado es: " + totalDiv);
                        break;
                default: System.out.println ("Opcion no valida");
                        break;
            }
            
        }while (opcion != 9);
    }
    }

