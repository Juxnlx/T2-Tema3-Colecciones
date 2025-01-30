package exingles;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		// Creamos un HashMap para almacenar los nombres de los paises y las veces que
		// se repite.
		HashMap<String, Integer> contadorVotos = new HashMap<String, Integer>();

		// Creamos la variable pais como String para almacenar el nombre del pais
		// introducido por el usuario.
		String pais = "";

		// Creamos la variable votos como int para contabilizar las veces que se vota el
		// pais.
		int votos;

		// Creamos el Scanner para leer el nombre del pais y el número del pais.
		Scanner sc = new Scanner(System.in);

		do {
			// Le pedimos al usuario que introduzca un pais y la leemos. Usamos el metodo
			// trim para eliminar los espacios de delante y atras.
			System.out.println("Introduce una frase: ");
			pais = sc.nextLine().trim();

			// Comprobamos si el pais es distintao de end, si es así volvemos a pedir otro
			// pais.
		} while (!pais.equalsIgnoreCase("END"));

		while (!pais.equalsIgnoreCase("end") && !pais.isEmpty()) {

		}
	}

}
