package numerosarreglo;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Mariano_mdz 
 */
public class NumerosArreglo {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] arreglo = new double[10];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el número de la Posición: " + (i+1));
            double temp = sc.nextDouble();
            arreglo[i] = temp;
        }

        double [] sorted = arreglo;
        System.out.println("El número Mayor es: " + NumeroMayor(sorted));
        System.out.println("El número más bajo: " + NumeroMenor(sorted));
        System.out.println("los números pares son: "); NumerosPares(arreglo);
        System.out.println("Los números impares son: "); NumerosImpares(arreglo);
        System.out.println("Orden ascendente"); OrdenarMenAMay(arreglo); 
        System.out.println("Orden descendente"); OrdenarMayorAMenor(arreglo); 

    }

    public static double NumeroMayor(double[] arreglo) {
        Arrays.sort(arreglo);
        double highest = arreglo[arreglo.length-1];
        return highest;
    }
    public static double NumeroMenor(double[] arreglo) {
        Arrays.sort(arreglo);
        double lowest = arreglo[0];
        return lowest;
    }
    public static void NumerosPares(double[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            if(arreglo[i]%2==0){
                System.out.println(arreglo[i]);
            }
        }
    }
    public static void NumerosImpares(double[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            if(!(arreglo[i]%2==0)){
                System.out.println(arreglo[i]);
            }
        }
    }
    public static void OrdenarMenAMay(double[] arreglo){
        Arrays.sort(arreglo);
        MostrarArreglo(arreglo);
    }

    public static void OrdenarMayorAMenor(double[] arreglo){
        int longitud = arreglo.length;
        for (int i=0; i<longitud/2; i++){
            double temporalVariable = arreglo[i];
            arreglo[i] = arreglo[longitud - i -1];
            arreglo[longitud-i-1] = temporalVariable;

        }
        MostrarArreglo(arreglo);
    }
    public static void MostrarArreglo(double[]arreglo){
        for (int i=0; i<arreglo.length;i++){
            System.out.println("["+arreglo[i]+"]");
        }
    }



    }


