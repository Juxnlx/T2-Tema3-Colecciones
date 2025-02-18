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

		// Creamos la variable paisFinal como String para guardar el nombre del pais que
		// mas se repite.
		String paisFinal = "";

		// Creamos la variable contFinal como int para almacenar la cantidad de veces
		// que se repite el pais con mas repeticiones.
		int contFinal = 0;

		// Creamos la variable repeticion como int para contabilizar si hay dos paises
		// con la misma cantidad de veces repetidas.
		int repeticion = 0;

		// Creamos el Scanner para leer los paises
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un pais y la leemos. Usamos el metodo
		// trim para eliminar los espacios de delante y atras.
		System.out.println("Introduce un pais: ");
		pais = sc.nextLine().trim();

		// Comprobamos si el pais introducido por el usuario es distinto de end, si es
		// así ejecutamos el bucle.
		while (!pais.equalsIgnoreCase("END")) {

			// Comprobamos si el pais existe en el mapa, si es así solo incrementamos su
			// valor a +1.
			if (contPaises.containsKey(pais)) {

				contPaises.put(pais, contPaises.get(pais) + 1);

				// Si no, añadimos el pais al mapa y con una repetición de una vez, porque es la
				// primera vez que se introduce un pais.
			} else {
				contPaises.put(pais, cont);
			}

			// Le pedimos al usuario que introduzca un pais y la leemos. Usamos el metodo
			// trim para eliminar los espacios de delante y atras.
			System.out.println("Introduce un pais: ");
			pais = sc.nextLine().trim();
		}

		// Recorremos el mapa por paises.
		for (String paises : contPaises.keySet()) {

			// Comprobamos si el valor del pais que estamos recorriendo es mayor que el
			// contador final, si es así asigamos a contFinal y paisFinal el pais y el valor
			// con el valor mas alto.
			if (contPaises.get(paises) > contFinal) {
				contFinal = contPaises.get(paises);
				paisFinal = paises;
			}

		}

		// Recorremos el mapa por los valores de cada pais.
		for (int puntos : contPaises.values()) {
			// Comprobamos si los puntos del pais que estamos recorriendo son iguales a los
			// del pais con mas repeticiones, si es así la variable repetición se incrementa
			// en +1.
			if (puntos == contFinal) {
				repeticion++;
			}
		}

		// Comprobamos si repeticion esta a 2 en ese caso es que hay dos paises con la
		// misma puntuación y por ello se podruce un empate.
		if (repeticion == 2) {
			System.out.println("EMPATE");
			// Si no, imprimimos el pais con mas repeticiones.
		} else {
			System.out.println(paisFinal + " " + contFinal);
		}

		// Cierre de Scanner
		sc.close();

	}
}