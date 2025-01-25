package boletin1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos un TreeMap para almacenar palabras clave - valor de forma ordenada.
		TreeMap<String, String> diccionario = new TreeMap<String, String>();

		// Creamos la variable palabraEsp como String para almacenar una palabra en
		// español introducida por el usuario.
		String palabraEsp = "";

		// Creamos la variable palabraIng como String para almacenar una palabra en
		// ingles introducida por el usuario.
		String palabraIng = "";

		// Creamos la variable opc como int para almacenar a opción seleccionada por el
		// usuario en el menú.
		int opc = 1;

		// Creamos el Scanner para solicitar las palabras y la opción introducida por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Comprobamos si la opción introducida es distinta de 0, si es así volvemos a
		// ejecutar el menú.
		while (opc != 0) {

			// Imprimimos el menú y solicitamos una opción al usuario y lo leemos.
			System.out.println("Seleccione 0 - 1 - 2 en el siguiente menú: ");
			System.out.println("1. Insertar palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Seleccione una opción --> ");
			opc = sc.nextInt();
			sc.nextLine();

			// Con este switch controlamos todas las opciones posibles introducidas por el
			// usuario.
			switch (opc) {
			// En el caso de introducir 1...
			case 1 -> {
				// Le pedimos al usuario que introduzca una palabra en español (la clave) y la
				// leemos.
				System.out.print("Introduce una palabra en español: ");
				palabraEsp = sc.nextLine();
				// Le pedimos al usuario que introduzca una palabra en ingles (el valor) y la
				// leemos.
				System.out.print("Introduce su traducción en ingles: ");
				palabraIng = sc.nextLine();

				// Comprobamos mediante el método isEmpty si las palabras introducidas son
				// cadenas vacias, si es así mostramos un error.
				if (palabraEsp.isEmpty() || palabraIng.isEmpty()) {
					System.err.println("No puedes ingresar una palabra vacía.");
					// Comprobamos si la palabras introducida ya ha sido añadida al diccionario, si
					// es así mostramos un error.
				} else if (diccionario.containsKey(palabraEsp)) {
					System.err.println("¡Lo siento! Esa palabra ya existe en el diccionario.");
					// Si no...
				} else {
					// Hacemos uso del método put para añadir las palabras introducidas por el
					// usuario en el mapa.
					diccionario.put(palabraEsp, palabraIng);
					System.out.println("Palabra añadida correctamente.");
				}

				// Salto de linea
				System.out.println();
			}

			// En el caso de introducir 2...
			case 2 -> {

				// Le pedimos al usuario que introduzca la palabra en español para hacer la
				// busqueda en el mapa por esa palabra y devolver su traducción, el valor.
				System.out.print("Introduce la palabra de la que quieres saber su traducción: ");
				palabraEsp = sc.nextLine();

				// Comprobamos mediante el método isEmpty si las palabras introducidas son
				// cadenas vacias, si es así mostramos un error.
				if (palabraEsp.isEmpty()) {
					System.err.println("No puedes ingresar una palabra vacía.");

					// Comprobamos si esa palabra existe en el mapa con el método containsKey, si
					// existe devolvemos el valor de esa palabra, la traducción en ingles de la
					// palabra introducida.
				} else if (diccionario.containsKey(palabraEsp)) {
					// A la variable palabraIng le asignamos el valor que nos devuelve el método get
					// de la clave introducida.
					palabraIng = diccionario.get(palabraEsp);
					// Imprimimos el valor de la plalabra introducida (palabra en ingles).
					System.out.println("Su traducción es: " + palabraIng);

					// En el caso de que no se encuentre en el mapa, indicamos que la palabra
					// introducida no existe.
				} else {
					System.err.println("La palabra no está en el diccionario.");
				}

				// Salto de linea
				System.out.println();

			}

			// En el caso de introducir 0...
			case 0 -> {
				// Imprimimos un mensaje de salida
				System.out.println("Saliendo...");
			}

			// En el caso de introducir una opción no valida...
			default -> {

				// Mostramos un mensaje de que la opción introducida es erronea
				System.out.println("Opción introducida incorrecta");
			}
			}
		}

		// Cierre de Scanner
		sc.close();
	}

}
