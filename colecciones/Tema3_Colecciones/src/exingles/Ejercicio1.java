package exingles;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Nos creamos un arrayList para almacenar las frases que nos va introduciendo
		// el usuario.
		ArrayList<String> frases = new ArrayList<String>();

		// Nos creamos un TreeMap para almacenar de forma alfabetica cada palabra de las
		// frases y donde aparecen.
		TreeMap<String, TreeSet<Integer>> encontarPalabras = new TreeMap<String, TreeSet<Integer>>();

		// Nos creamos un TreeSet para almacenar en las frases donde aparece cada
		// palabra.
		TreeSet<Integer> numeros;

		// Nos creamos la variable frase como String para almacenar la palabra
		// introducida por el usuario.
		String frase = "";

		// Nos creamos la variable palabra como String para almacenar la palabra que
		// vamos a ir recorriendo de cada frase.
		String palabra = "";

		// Nos creamos el Scanner para leer las frase introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		do {
			// Le pedimos al usuario que introduzca una frase y la leemos por teclado.
			System.out.println("Introduce una frase: ");
			frase = sc.nextLine();
			// Comprobamos si la frase introducida esta vacia, si es así se vuelve a
			// preguntar por una frase
		} while (frase.isEmpty());

		// Comprobamos si la frase no esta vacia y si la frase es distinto a end, en ese
		// caso salimos del bucle.
		while (!frase.isEmpty() && !frase.equalsIgnoreCase("end")) {

			// Añadimos la frase a la lista frase.
			frases.add(frase);

			//Recorremos la lista para frases para ir recorriendo frase por frase.
			for (int i = 0; i < frases.size(); i++) {
				//Almacenamos en palabra la frase que vamos a recorrer.
				palabra = frases.get(i);

				for (int j = 0; j < palabra.length(); j++) {

					if (palabra.length() > 2) {

						if (encontarPalabras.containsKey(palabra)) {
							
						} else {
							numeros = new TreeSet<Integer>();
							
						}
					}

				}

			}

			// Le pedimos al usuario que introduzca una frase y la leemos por teclado.
			System.out.println("Introduce una frase: ");
			frase.length();
		}

		// Cierre de Scanner
		sc.close();
	}

}
