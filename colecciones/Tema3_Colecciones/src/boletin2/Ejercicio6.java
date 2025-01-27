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
			System.out.println("\033[37m ---------MENU---------");
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
					// Le pedimos al usuario que introduzca un nombre de una persona y lo leemos
					System.out.print("Introduce un nombre: ");
					nombreUsuario = sc.nextLine();
					// Comprobamos si la cadena introducida por el usuario esta vacia, en ese caso
					// volvemos a preguntar un nombre.
				} while (nombreUsuario.isEmpty());

				// Comprobamos si ese nombre ya existe en nuestra libreta, si es asi...
				if (libretaDirec.containsKey(nombreUsuario)) {
					// Mostramos un mesaje de que el nombre introducido ya exite en el mapa.
					System.err.println("El nombre introducido ya existe en la libreta de contactos.");
					// Si no...
				} else {
					// Creamos una nueva lista vacía de números.
					ArrayList<Integer> numeros = new ArrayList<>();
					// Añadimos el nombre introducido a la libreta.
					libretaDirec.put(nombreUsuario, numeros);
					// Imprimimos un mensaje mostrandole al usurio que el nombre ha sido introducido
					// correctamente.
					System.out.println("\033[32m ¡Enhorabuena! Un nuevo nombre ha sido agregado a la libreta.");
				}
			}

			case 2 -> {
				// Le pedimos al usuario que introduzca un nombre de una persona y lo leemos
				System.out.print("Introduce un nombre: ");
				nombreUsuario = sc.nextLine();

				// Comprobamos si ese nombre ya existe en nuestra libreta, si es asi...
				if (libretaDirec.containsKey(nombreUsuario)) {
					// Le pedimos al usuario que introduzca un número y lo leemos.
					System.out.print("Introduce el número de teléfono: ");
					numMovil = sc.nextInt();
					// Limpiar el buffer
					sc.nextLine();

					// Obtener la lista de teléfonos de esa persona y añadir el número nuevo.
					libretaDirec.get(nombreUsuario).add(numMovil);
					//Mostramos un mensaje de que el número ha sido introducido con exito.
					System.out.println("\033[32m El número ha sido agregado correctamente.");
				} else {
					// Imprimimos un mensaje diciendole al usuario que el nombre no esta en la
					// agenda.
					System.err.println("¡Lo siento! El nombre introducido no se encuentra en la lista.");
				}
			}

			case 3 -> {
				// Le pedimos al usuario que introduzca un nombre de una persona y lo leemos.
				System.out.print("Introduce un nombre: ");
				nombreUsuario = sc.nextLine();

				// Comprobamos si ese nombre ya existe en nuestra libreta, si es asi...
				if (libretaDirec.containsKey(nombreUsuario)) {

					// Obtenemos la lista de números de la persona introducida por el usuario.
					ArrayList<Integer> numeros = libretaDirec.get(nombreUsuario);

					// Si la lista no tiene ningun número, avisamos al usuario.
					if (numeros.isEmpty()) {
						System.err.println("No hay ningun número asociado a " + nombreUsuario);
					} else {
						// Si no, mostramos los números de esa persona.
						System.out.println(nombreUsuario + ": " + numeros);
					}

				} else {
					// Imprimimos un mensaje diciendole al usuario que el nombre no esta en la
					// agenda.
					System.err.println("¡Lo siento! El nombre introducido no se encuentra en la lista.");
				}
			}

			case 4 -> {
				// Le pedimos al usuario que introduzca un nombre de una persona y lo leemos.
				System.out.print("Introduce un nombre: ");
				nombreUsuario = sc.nextLine();

				// Comprobamos si ese nombre ya existe en nuestra libreta, si es asi...
				if (libretaDirec.containsKey(nombreUsuario)) {

					// Obtenemos la lista de números de la persona introducida por el usuario.
					ArrayList<Integer> numeros = libretaDirec.get(nombreUsuario);

					// Si la lista no tiene ningun número, avisamos al usuario.
					if (numeros.isEmpty()) {
						System.err.println("No hay ningun número asociado a " + nombreUsuario);
						// Si no, mostramos los números de esa persona.
					} else {
						System.out.println(nombreUsuario + ": " + numeros);

						// Le pedimos al usuario que introduzca un número y lo leemos.
						System.out.print("Introduce el número de teléfono: ");
						numMovil = sc.nextInt();
						// Limpiar el buffer
						sc.nextLine();

						// Comprobamos si el número introducido por el usuario aparece en la lista, si
						// existe
						if (numeros.contains(numMovil)) {
							// Eliminamos ese número con el metodo remove, le hacemos un casteo para que no
							// trate el valor introducido como un indice sino como un valor.
							numeros.remove((Integer) numMovil);
							// Mostramos un mensaje de que el número ha sido eliminado.
							System.out.println("\033[32m Número eliminado con exito");
							// Si no, aparece en la lista se lo indicamos al usuario.
						} else {
							System.err.println("El número introducido no se asocia a " + nombreUsuario);
						}
					}

					// Si no..
				} else {
					// Imprimimos un mensaje diciendole al usuario que el nombre no esta en la
					// agenda.
					System.out.println("¡Lo siento! El nombre introducido no se encuentra en la lista.");
				}
			}

			case 5 -> {
				// Le pedimos al usuario que introduzca un nombre de una persona y lo leemos.
				System.out.print("Introduce un nombre: ");
				nombreUsuario = sc.nextLine();

				// Comprobamos si ese nombre ya existe en nuestra libreta, si es asi...
				if (libretaDirec.containsKey(nombreUsuario)) {
					// Eliminamos la persona con todos sus números de telefono con el método remove.
					libretaDirec.remove(nombreUsuario);
					System.out.println(nombreUsuario + " ha sido eliminado de la libreta.");

				} else {
					// Imprimimos un mensaje diciendole al usuario que el nombre no esta en la
					// agenda.
					System.err.println("¡Lo siento! El nombre introducido no se encuentra en la lista.");
				}
			}

			case 6 -> {
				// Imprimimos un mensaje de salida
				System.out.println("Saliendo...");
			}

			default -> {

				// Mostramos un mensaje de que la opción introducida es erronea
				System.err.println("Opción introducida incorrecta");
			}
			}

			// Salto de linea
			System.out.println();

			// Mientras la opción sea distinta de 4 seguiremos preguntando una opción del
			// menú.
		} while (opc != 6);

		// Cierre de Scanner
		sc.close();

	}

}
