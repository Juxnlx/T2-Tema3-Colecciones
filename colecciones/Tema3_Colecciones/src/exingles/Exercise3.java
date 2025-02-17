package exingles;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		// Creamos un HashMap para almacenar los nombres de los paises y las veces que
		// se repite.
		HashMap<String, Integer> contPaises = new HashMap<String, Integer>();

		// Creamos la variable pais como String para almacenar el pais introducido por
		// el usuario.
		String pais;

		// Creamos un cont como int para contabilizar las veces que se repite cada pais.
		int cont = 1;

		String paisFinal = "";

		int contFinal = 0;

		// Creamos el Scanner para leer los paises
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un pais y la leemos. Usamos el metodo
		// trim para eliminar los espacios de delante y atras.
		System.out.println("Introduce una frase: ");
		pais = sc.nextLine().trim();

		while (!pais.equalsIgnoreCase("END")) {

			if (contPaises.containsKey(pais)) {

				contPaises.put(pais, contPaises.get(pais) + 1);

			} else {
				contPaises.put(pais, cont);
			}

			// Le pedimos al usuario que introduzca un pais y la leemos. Usamos el metodo
			// trim para eliminar los espacios de delante y atras.
			System.out.println("Introduce una frase: ");
			pais = sc.nextLine().trim();
		}

		for (String paises : contPaises.keySet()) {

			if (contPaises.get(paises) > contFinal) {
				contFinal = contPaises.get(paises);
				paisFinal = paises;
			}

		}

		if (contPaises.containsValue(contFinal)) {
			System.out.println("EMPATE");
		} else {
			System.out.println(paisFinal + " " + contFinal);
		}

		// Cierre de Scanner
		sc.close();

	}
}