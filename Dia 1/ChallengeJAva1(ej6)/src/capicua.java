import java.util.Scanner;

public class capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Numero, aux, inverso = 0, cifra;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.print("Introduce un número >= 10: ");
			Numero = leer.nextInt();
		} while (Numero < 10);

		// le damos la vuelta al número
		aux = Numero;
		while (aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux / 10;
		}

		if (Numero == inverso) {
			System.out.println("el número " + Numero + " Es capicua");
		} else {
			System.out.println("El número " + Numero + " No es capicua");
		}
		leer.close();
	}

}
