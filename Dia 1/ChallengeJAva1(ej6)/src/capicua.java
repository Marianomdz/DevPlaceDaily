import java.util.Scanner;

public class capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Numero, aux, inverso = 0, cifra;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.print("Introduce un n�mero >= 10: ");
			Numero = leer.nextInt();
		} while (Numero < 10);

		// le damos la vuelta al n�mero
		aux = Numero;
		while (aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux / 10;
		}

		if (Numero == inverso) {
			System.out.println("el n�mero " + Numero + " Es capicua");
		} else {
			System.out.println("El n�mero " + Numero + " No es capicua");
		}
		leer.close();
	}

}
