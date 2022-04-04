import java.util.Scanner;

public class promedioNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leer = new Scanner(System.in);

        System.out.println("ingrese Nota 1");
        int nota1 = leer.nextInt();
        System.out.println("ingrese Nota 2");
        int nota2 = (leer.nextInt());
        System.out.println("ingrese Nota 3");
        int nota3 = (leer.nextInt());
		
		float promedio = (nota1 + nota2 + nota3)/3;
		
		if(promedio <= 10) {
			System.out.println("Reprovado, promedio: "+ promedio);
		} else if((promedio > 10) &&  (promedio <= 15)){
			System.out.println("Aprovado, promedio: "+ promedio);
		}else if((promedio > 15)){
			System.out.println("Eximido, promedio: "+ promedio);
			
		}
		leer.close();
	}

}
