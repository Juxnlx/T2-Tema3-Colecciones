package boletin2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos este mapa para agrupar por nombres los números de teléfono que tenga.
		HashMap<String, ArrayList<Integer>> libretaDirec = new HashMap<String, ArrayList<Integer>>();

		// Creamos la variable nombreUsuario como String para almacenar el nombre de la
		// personas que se vayan añadiendo a la libreta.
		String nombreUsuario = "";

		// Creamos la variable numMovil como int para almacenar los números de telefono
		// de una persona.
		int numMovil;

		// Creamos la variable opc como int para almacenar la opción del menú
		// seleccionada.
		int opc;

		// Creamos el Scanner para leer el nombre de las personas y sus números de
		// teléfono.
		Scanner sc = new Scanner(System.in);

		do {
			// Mostramos el menú donde aparecen todos las opciónes.
			System.out.println("---------MENU---------");
			System.out.println("1. Añadir persona.");
			System.out.println("2. Añadir teléfono a una persona dada.");
			System.out.println("3. Mostrar los teléfonos de una persona.");
			System.out.println("4. Eliminar teléfono de una persona.");
			System.out.println("5. Eliminar una persona.");
			System.out.println("6. Salir. \n");
			// Le pedimos al usuario que introduzca una opción del menú y la leemos.
			System.out.print("Elige una opción del menú --> ");
			opc = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Creamos un switch para controlar todas las opciones posibles introducidas por
			// el usuario.
			switch (opc) {
			case 1 -> {

				do {
					// Le pedimos al usuario que introduzca un un nombre de una persona y lo leemos
					System.out.print("Introduce un nombre: ");
					nombreUsuario = sc.nextLine();
					// Comprobamos si la cadena introducida por el usuario esta vacia, en ese caso
					// volvemos a preguntar un nombre.
				} while (nombreUsuario.isEmpty());

				// Comprobamos si ese nombre ya existe en nuestra libreta, si es asi...
				if (libretaDirec.containsKey(nombreUsuario)) {
					// Mostramos un mesaje de que el nombre introducido ya exite en el mapa.
					System.out.println("El nombre introducido ya existe en la libreta de contactos.");
					// Si no...
				} else {
					
					ArrayList<Integer> numeros = new ArrayList<Integer>();
					
					// Añadimos el nombre introducido a la libreta.
					libretaDirec.put(nombreUsuario, numeros);
					// Imprimimos un mensaje mostrandole al usurio que el nombre ha sido introducido
					// correctamente.
					System.out.println("¡Enhorabuena! Un nuevo nombre ha sido agregado a la libreta.");
				}
			}

			case 2 -> {

			}

			case 3 -> {

			}

			case 4 -> {

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
			
			System.out.println(libretaDirec);

			// Mientras la opción sea distinta de 4 seguiremos preguntando una opción del
			// menú.
		} while (opc != 6);

		// Cierre de Scanner
		sc.close();

	}

}
