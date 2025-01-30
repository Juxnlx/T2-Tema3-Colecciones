package exingles;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exercise1 {

	public static void main(String[] args) {

		// Nos creamos un arrayList para almacenar las frases que nos va introduciendo
		// el usuario.
		ArrayList<String> frases = new ArrayList<String>();

		// Nos creamos un TreeMap para almacenar de forma alfabetica cada palabra de las
		// frases y donde aparecen.
		TreeMap<String, TreeSet<Integer>> encontrarPalabras = new TreeMap<String, TreeSet<Integer>>();

		// Nos creamos un TreeSet para almacenar en las frases donde aparece cada
		// palabra.
		TreeSet<Integer> numeros;

		// Declaramos el array tablaPalabras como String para almacenar las frases de
		// una palabra.
		String[] tablaPalabras;

		// Nos creamos la variable frase como String para almacenar la palabra
		// introducida por el usuario.
		String frase = "";

		// Nos creamos la variable palabra como String para almacenar la palabra que
		// vamos a ir recorriendo de cada frase.
		String palabra = "";

		// Nos creamos el Scanner para leer las frase introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		do {
			// Le pedimos al usuario que introduzca una frase y la leemos. Usamos el metodo
			// trim para eliminar los espacios de delante y atras.
			System.out.println("Introduce una frase: ");
			frase = sc.nextLine().trim();
			// Comprobamos si la frase es distinta de end, si es así la añadimos a nuestra
			// lista frases.
			if (!frase.equalsIgnoreCase("END")) {
				// Añadimos la frase a la lista.
				frases.add(frase);
			}
			// Comprobamos si la frase es distinta de end, si es así volvemos a pedir otra
			// frase.
		} while (!frase.equalsIgnoreCase("END"));

		// Añadimos en el array cada palabra de la frase.
		tablaPalabras = frase.split(" ");

		// Recorremos la lista de frases para saber que frase estamos recorriendo en
		// cada momento.
		for (int numLinea = 0; numLinea < frases.size(); numLinea++) {

			// Almacenamos en la variable frase, la frase que estamos recorriendo en este
			// momento.
			frase = frases.get(numLinea).toLowerCase();
			// En el array tablaPalabras almacenamos cada palabra con el metodo split.
			tablaPalabras = frase.split(" ");

			// Recorremos el array tablaPalabras para recorrer cada palabra.
			for (int i = 0; i < tablaPalabras.length; i++) {
				// Almacenamos en palabra la palabra que estamos recorriendo en este momento de
				// la frase.
				palabra = tablaPalabras[i];

				// Comprobamos si la palabra es mayor que 2, si es así comprobamos
				if (palabra.length() > 2) {

					// Comprobamos si la palabra existe en el mapa, si es así...
					if (encontrarPalabras.containsKey(palabra)) {

						// Almacenamos en el conjunto número el conjunto que nos devuelve el mapa con
						// esa clave.
						numeros = encontrarPalabras.get(palabra);
						// Almacenamos en el conjunto el número de frase.
						numeros.add(numLinea + 1);

						// Si no...
					} else {
						// Creamos el cojunto numeros.
						numeros = new TreeSet<Integer>();
						// Añadimos el número de la frase.
						numeros.add(numLinea + 1);
						// Añadimos el conjunto a la frase concreta.
						encontrarPalabras.put(palabra, numeros);

					}
				}

			}
		}

		System.out.println("\n ¿Donde aparece cada palabra?");
		//Imprimimos el mapa con cada palabra y su conjunto.
		for (String fraseJuego : encontrarPalabras.keySet()) {
			System.out.println(fraseJuego + ": " + encontrarPalabras.get(fraseJuego));
		}

		// Cierre de Scanner
		sc.close();
	}

}
