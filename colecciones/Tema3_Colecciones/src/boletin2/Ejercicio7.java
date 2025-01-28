package boletin2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos un HashMap para almacenar unas series de claves númericas y unos
		// valores (palabras con la misma longitud que la clave), el orden no importa.
		HashMap<Integer, HashSet<String>> longitudPalabras = new HashMap<Integer, HashSet<String>>();

		// Creamos la variable palabra como String para ir almacenando palabras
		// introducidas por el usuario.
		String palabra = "";

		// Creamos la variable longPalabra como int para almacenar la longitud de la
		// palabra solicitada al usuario.
		int longPalabra;

		// Creamos la variable salir como String para almacenar la cadena que nos
		// permitira terminar el programa.
		String salir;

		// Creamos el Scanner para leer la frase introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		do {
			do {
				// Le pedimos al usuario que introduzca una palabra y la leemos.
				System.out.print("Introduce una palabra: ");
				palabra = sc.nextLine();
				// Comprobamos si la palabra introducida esta vacia, si es así volvemos a
				// preguntar una palabra.
			} while (palabra.isEmpty());

			// En la variable longPalabra almacenamos la longitud de la palabra introducida.
			longPalabra = palabra.length();

			// Comprobamos si la longitud de la palabra introducida existe en el mapa, si es
			// así...
			if (longitudPalabras.containsKey(longPalabra)) {

				// Hacemos un get de la longitud para obtener el conjunto de esa clave y le
				// añadimos con el metodo add la palabra.
				longitudPalabras.get(longPalabra).add(palabra);

				// Si no...
			} else {
				// Creamos el conjunto Set de esa longitud concreta para esa clave (longitud)
				// concreta.
				HashSet<String> conjPalabras = new HashSet<String>();

				// Añadimos al conjunto la palabra que acaba de introducir el usuario.
				conjPalabras.add(palabra);

				// Añadimos al mapa la clave y ese conjunto de palabras.
				longitudPalabras.put(longPalabra, conjPalabras);
			}

			// Imprimimos un mesaje de que la palabra ha sido añadida correctamente.
			System.out.println("¡ENHORABUENA! La palabra ha sido añadida con exito. \n");

			// Le preguntamos al usuario si desea salir.
			System.out.print("Introduce 'S' si deseas salir del programa: ");
			salir = sc.nextLine();

			// Comprobamos si la letra introducida es distinta de 'S', si es así volvemos a
			// pedir una palabra.
		} while (!salir.equalsIgnoreCase("S"));

		// Mostramos el mapa con todas las palabras.
		System.out.println("\n CLASIFICADOR DE PALABRAS \n");
		for (Integer longitud : longitudPalabras.keySet()) {
			System.out.println("Palabras de " + longitud + " letras: " + longitudPalabras.get(longitud));
		}

		// Cierre de Scanner
		sc.close();
	}

}
