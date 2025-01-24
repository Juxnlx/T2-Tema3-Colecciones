package boletin1;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * ESTA MAL NO SE COMO HACELRO VOY A LLORAR DE VD 😭
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		// Creamos un TreeMap para almacenar los números del euro millón introducidos
		// por el usuario y las veces que se repite cada uno.
		TreeMap<Integer, Integer> numeros = new TreeMap<Integer, Integer>();

		// Creamos un TreeMap para almacenar las estrellas del euro millón introducidos
		// por el usuario y las veces que se repite cada una.
		TreeMap<Integer, Integer> estrellas = new TreeMap<Integer, Integer>();

		// Creamos la variable numEuroMill como int para almacenar el número introducido
		// por el usuario.
		int numEuroMill;

		// Creamos la variable estrellasEM como int para almacenar las estrellas
		// introducidas por el usuario.
		int estrellasEM;

		// Creamos la variable continuar como boolean para para saber cuando salir del
		// bucle o cuando comprobar otros números y estrellas.
		boolean continuar;

		// Creamos la variable opcSalida como char para almacenar la opción de si desea
		// seguir o salir.
		char opcSalida;

		// Creamos el Scanner para leer los números y estrellas.
		Scanner sc = new Scanner(System.in);

		do {

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
					sc.nextLine();
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

			System.out.println("REPETICIÓN DE NÚMEROS");

			// Hacemos uso del método keySet para recorrer las claves y luego con la clave
			// usamos el metodo get para coger el valor de ese número (las veces que se
			// repite).
			for (Integer clave : numeros.keySet()) {
				System.out.println(clave + ": " + numeros.get(clave) + " veces");
			}

			// Salto de linea
			System.out.println();

			System.out.println("REPETICIÓN DE ESTRELLAS");

			// Hacemos uso del método keySet para recorrer las claves de las estrellas y
			// luego con la clave usamos el metodo get para coger el valor de esa estrella
			// (las veces que se repite).
			for (Integer estrella : estrellas.keySet()) {
				System.out.println(estrella + ": " + estrellas.get(estrella) + " veces");
			}

			// Le preguntamos al usuario si quiere seguir o salir y leemos su respuesto.
			System.out.println();
			System.out.println("Si deseas seguir, introduce:");
			System.out.println("T, si quieres continuar");
			System.out.println("Cualquier otro valor para salir \n");
			System.out.println("Introduce una opción: ");
			opcSalida = sc.nextLine().charAt(0);

			// Comprobamos si la opción es 'T', si lo es devolvemos true sino false.
			continuar = opcSalida == 'T' ? true : false;

			// Comprobamos si la opción introducida por el usuario nos ha devuelto true o
			// false.
		} while (continuar);

		// Imprimimos un mensaje de fin de programa.
		System.out.println("Saliendo...");

		// Cierre de Scanner
		sc.close();
	}
}
