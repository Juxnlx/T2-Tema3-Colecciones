package boletin1;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * ESTA MAL NO SE COMO HACELRO VOY A LLORAR DE VD 😭 
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		TreeMap<Integer, Integer> numeros = new TreeMap<Integer, Integer>();

		TreeMap<Integer, Integer> estrellas = new TreeMap<Integer, Integer>();

		// Creamos la variable numEuroMill como int para almacenar el número introducido
		// por el usuario.
		int numEuroMill;

		// Creamos la variable estrellasEM como int para almacenar las estrellas
		// introducidas por el usuario.
		int estrellasEM;

		// Creamos el Scanner para leer los números y estrellas.
		Scanner sc = new Scanner(System.in);

		// Creamos este for para solicitar 5 múmeros al usuario.
		for (int i = 0; i < 5; i++) {
			// Creamos este bucle para en el caso de que el número introducido sea
			// incorrecto (no se encuentre entre 1 y 50) volver a preguntarlo.
			do {
				// Le pedimos al usuario que introduzca el número y lo leemos.
				System.out.println("Introduce el número (entre 1 y 50): ");
				numEuroMill = sc.nextInt();
			} while (numEuroMill < 1 || numEuroMill > 50);

			// Comprobamos si el número introducido se encuentra en el mapa, si lo esta
			// incrementamos su valor en +1.
			if (numeros.containsKey(numEuroMill)) {
				numeros.put(numEuroMill, numeros.get(numEuroMill) + 1);
				// Si no, lo añadimos y le ponemos el valor a 1.
			} else {
				numeros.put(numEuroMill, 1);
			}
		}

		// Creamos este for para solicitar 2 estrellas al usuario.
		for (int i = 0; i < 2; i++) {
			// Creamos este bucle para en el caso de que la estrella introducida sea
			// incorrecta (no se encuentre entre 1 y 12) volver a preguntarla.
			do {
				// Le pedimos al usuario que introduzca las estrellas y las leemos.
				System.out.println("Introduce la estrella (entre 1 y 12): ");
				estrellasEM = sc.nextInt();
			} while (estrellasEM < 1 || estrellasEM > 12);

			// Comprobamos si la estrella introducida se encuentra en el mapa, si lo esta
			// incrementamos su valor en +1.
			if (estrellas.containsKey(estrellasEM)) {
				estrellas.put(estrellasEM, estrellas.get(estrellasEM) + 1);
				// Si no, la añadimos y le ponemos el valor a 1.
			} else {
				estrellas.put(estrellasEM, 1);
			}
		}
		
		// Cierre de Scanner
		sc.close();
	}
}
