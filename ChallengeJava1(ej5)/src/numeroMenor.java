import java.util.Scanner;

public class numeroMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
        System.out.println("ingrese n�mero 1");
        int nota1 = leer.nextInt();
        System.out.println("ingrese n�mero 2");
        Integer nota2 = (leer.nextInt());
        System.out.println("ingrese n�mero 3");
        Integer nota3 = (leer.nextInt());
        
        
        
        if((nota1 < nota2) && (nota1 < nota3)) {
        	System.out.println("El N�mero 1 = "+ nota1 + " es menor");
        	
        } else if((nota2 < nota1) && (nota2 < nota3)) {
        	System.out.println("El N�mero 2 = "+ nota2 + " es menor");
        	
        } if((nota3 < nota1) && (nota3 < nota2)) {
        	System.out.println("El N�mero 3 = "+ nota3 + " es menor");
        	
        }
    	leer.close();
	}


}
