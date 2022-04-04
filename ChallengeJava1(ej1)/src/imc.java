import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		
        System.out.println("ingrese su peso");
        float peso = (leer.nextFloat());
        System.out.println("ingrese su peso");
        float altura = (leer.nextFloat());
        
        float imc = peso/(altura*altura);
        
        if(imc <= 20 ) {
        	System.out.println("Usted esta en mal estado");
        	
        } else  if (imc > 20 && imc <= 22 ) {
        
        	System.out.println("Usted esta con Bajo Peso");
        } else if (imc > 22 && imc <= 25 ) {
        	System.out.println("Usted esta en Peso Normal");
        } else if (imc > 25 && imc <= 30 ) {
        	System.out.println("Usted esta con Sobrepeso");
        } else if (imc > 30 && imc <= 40 ) {
        	System.out.println("Usted esta con Sobrepeso crónico");
        } else if (imc > 40 ) { 
        	System.out.println("Usted esta debe ser Hospitalizado");
        }
    	leer.close();
	}

}
