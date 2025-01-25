package boletin2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos un ArrayList para almacenar una serie de nombres sin ningun orden y
		// pudiendo repetirse.
		ArrayList<String> nombres = new ArrayList<String>();

		// Creamos la variable nombreUsuario como String para almacenar los nombres que
		// se vayan introducendo.
		String nombreUsuario = "";

		// Creamos la variable opc como int para almacenar la opción del menú
		// seleccionada.
		int opc;

		// Creamos el Scannner para leer los nombres introducidos por el usuario y la
		// opción seleccionada del menú.
		Scanner sc = new Scanner(System.in);

		do {
			// Mostramos el menú donde aparecen todos las opciónes.
			System.out.println("---------MENU---------");
			System.out.println("1. Añadir nuevo nombre a la lista.");
			System.out.println("2. Elimina un nombre específico.");
			System.out.println("3. Ordena la lista alfabéticamente.");
			System.out.println("4. Busca si un nombre específico está en la lista.");
			System.out.println("5. Salir. \n");
			// Le pedimos al usuario que introduzca una opción del menú y la leemos.
			System.out.print("Elige una opción del menú --> ");
			opc = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Creamos un switch para controlar todas las opciones posibles introducidas por
			// el usuario.
			switch (opc) {
			case 1 -> {
				// Le pedimos al usuario que introduzca un nombre y lo leemos. Tambien
				// eliminamos los espacios a la deracha y a la izquierda.
				System.out.print("Introduce un nombre: ");
				nombreUsuario = sc.nextLine().trim();

				// Comprobamos si la cadena no esta vacia, si es asi...
				if (!nombreUsuario.isEmpty()) {
					// Hacemos uso del método add para añadir el nombre a la lista de nombres.
					nombres.add(nombreUsuario);
					// Imprimimos que el nombre ha sido añadido con exito.
					System.out.println("Nombre añadido con éxito.");
					// Si no...
				} else {
					// Imprimimos que el nombre no se ha podido añador.
					System.out.println("No se puede añadir un nombre vacío.");
				}
			}

			case 2 -> {
				// Comprobamos si la lista de nombres no esta vacia en ese caso mostramos la
				// lista.
				if (!nombres.isEmpty()) {
					// Le pedimos al usuario que introduzca el nombre que quiere eliminar y lo
					// leemos.
					System.out.print("Introduce un nombre: ");
					nombreUsuario = sc.nextLine();

					// Comprobamos si el nombre que vamos a borrar existe en la lista.
					if (nombres.contains(nombreUsuario)) {
						// Usamos el método remove para eliminar el nombre introducido por el usuario
						nombres.remove(nombreUsuario);
						// Mostramos un mensaje de que el nombre ha sido borrado con exito.
						System.out.println("Nombre eliminado con éxito");

						// Si no...
					} else {
						// Imprimimos un mensaje diciendo que el nombre introducido no existe en la
						// lista.
						System.err.println("El nombre introducido no existe en la lista.");
					}
				} else {
					// Imprimimos que el nombre no se ha podido añador.
					System.out.println("La lista está vacía.");
				}
			}

			case 3 -> {
				// Comprobamos si la lista de nombres no esta vacia en ese caso mostramos la
				// lista.
				if (!nombres.isEmpty()) {
					// Para ordenar la lista usamos el metodo heredado de la interface Collections,
					// sort.
					Collections.sort(nombres);
					// Imprimimos un mensaje de que la lista nombres ha sido ordenada.
					System.out.println("La lista ha sido ordenada");
					// Si no...
				} else {
					// Imprimimos un mesaje de que la lista esta vacia.
					System.err.println("La lista esta vacia");
				}
			}

			case 4 -> {
				// Comprobamos si la lista de nombres no esta vacia en ese caso mostramos la
				// lista.
				if (!nombres.isEmpty()) {
					// Le pedimos al usuario que introduzca el nombre que quiere saber si existe en
					// la lista y lo leemos.
					System.out.print("Introduce un nombre: ");
					nombreUsuario = sc.nextLine();

					// Comprobamos si el nombre introducido por el usuario existe en la lista.
					if (nombres.contains(nombreUsuario)) {
						// Imprimimos un mensaje mostrando que el nombre existe en la lista.
						System.out.println("El nombre introducido EXISTE en nuestra lista");
						// Si no...
					} else {
						// Imprimimos un mensaje diciendo que el nombre introducido no existe en la
						// lista.
						System.err.println("El nombre introducido NO EXISTE en la lista.");
					}
				} else {
					// Imprimimos un mesaje de que la lista esta vacia.
					System.err.println("La lista esta vacia");
				}
			}

			case 5 -> {
				// Imprimimos un mensaje de salida
				System.out.println("Saliendo...");
			}

			default -> {

				// Mostramos un mensaje de que la opción introducida es erronea
				System.out.println("Opción introducida incorrecta");
			}
			}
			
			// Salto de linea
			System.out.println();
			
			//Imprimimos la lista
			System.out.println("Lista de nombres --> " + nombres);
			
			// Salto de linea
			System.out.println();
			
			// Mientras la opción sea distinta de 5 seguiremos preguntando una opción del
			// menú.
		} while (opc != 5);

		

		// Cierre de Scanner
		sc.close();
	}

}
