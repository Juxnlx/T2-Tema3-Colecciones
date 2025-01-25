package boletin1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		HashMap<String, String> programaBD = new HashMap<String, String>();

		// Creamos la variable nombreUsuario como String para almacenar el nombre de un
		// posible nuevo usaurio.
		String nombreUsuario = "";

		// Creamos la variable password como String para almacenar la contraseña del
		// usuario.
		String password = "";

		// Creamos la variable contIntentos como int para contabilizar los intentos que
		// le quedan al usuario para iniciar sesión antes de bloquearle el acceso.
		int contIntentos = 3;

		// Creamos la variable opc como int para almacenar a opción seleccionada por el
		// usuario en el menú.
		int opc = 1;

		// Creamos la variable registroCorrecto como boolean para identificar cuando el
		// usuario ha iniciado sesión y cuando no.
		boolean registroCorrecto = false;

		// Creamos el Scanner para solicitar el nombre y la contraseña del usuario.
		Scanner sc = new Scanner(System.in);

		// Comprobamos si la opción introducida es distinta de 0, si es así volvemos a
		// ejecutar el menú.
		while (opc != 0) {

			// Imprimimos el menú y solicitamos una opción al usuario y lo leemos.
			System.out.println("Seleccione 0 - 1 - 2 en el siguiente menú: ");
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Introduce la opción a ejecutar --> ");
			opc = sc.nextInt();
			sc.nextLine();

			// Con este switch controlamos todas las opciones posibles introducidas por el
			// usuario.
			switch (opc) {
			// En el caso de introducir 1...
			case 1 -> {
				// Le pedimos al usuario que introduzca un nuevo nombre de usuario y lo leemos.
				System.out.print("Introduce tu nombre de usuario: ");
				nombreUsuario = sc.nextLine();
				// Le pedimos al usuario que introduzca una contraseña y la leemos.
				System.out.print("Introduce una contraseña: ");
				password = sc.nextLine();

				// Comprobamos mediante el método isEmpty si el usuario y la contraseña
				// introducidas no son cadenas vacias.
				if (nombreUsuario.isEmpty() || password.isEmpty()) {
					System.err.println("No puedes ingresar una palabra vacía.");

					// Comprobamos si el usuario introducido existe en el programa.
				} else if (programaBD.containsKey(nombreUsuario)) {
					System.err.println("¡Lo siento! Este usuario ya ha sido registrado.");

					// Si no...
				} else {
					// Hacemos uso del método put para añadir el nuevo usuario y la contraseña al
					// programa.
					programaBD.put(nombreUsuario, password);
					System.out.println("Usuario añadido correctamente.");
				}

				// Hacemos uso del método put para añadir el usuario y la contraseña en la base
				// de datos del programa.
				programaBD.put(nombreUsuario, password);

				// Salto de linea
				System.out.println();
			}

			// En el caso de introducir 2...
			case 2 -> {

				// Comprobamos si el números de intentos no se ha agotado o si aun no se ha
				// iniciado sesión en ese caso volvemos a ejecutar el bucle.
				while (contIntentos > 0 && !registroCorrecto) {
					// Le pedimos al usuario que introduzca un nuevo nombre de usuario y lo leemos.
					System.out.print("Introduce tu nombre de usuario: ");
					nombreUsuario = sc.nextLine();
					// Le pedimos al usuario que introduzca una contraseña y la leemos.
					System.out.print("Introduce una contraseña: ");
					password = sc.nextLine();

					// Comprobamos si el nombre de usuario existe en el mapa y luego comprobamos si
					// la clave devuelta por el nombre de usuario es la misma que la introducida por
					// el usuario, si es así se inicia sesión en el programa.
					if (programaBD.containsKey(nombreUsuario) && programaBD.get(nombreUsuario).equals(password)) {
						System.out.println("Ha accedido al área restringida. ¡Bienvenido " + nombreUsuario + "!");
						// Ponemos la variable registroCorrecto como true, para indicar que se ha
						// iniciado sesión y no volver a preguntar mas.
						registroCorrecto = true;
						// Reiniciamos intentos para futuros inicios de sesión.
						contIntentos = 3;

						// En el caso de que el usuario o contraseña sean incorrectos, lo indicamos y le
						// mostramos al usuario los intentos que le quedan.
					} else {
						// Decrementamos el número de intentos en -1.
						contIntentos--;
						System.out.println("Usuario o contraseña incorrectos.");

						// Si el contador de intentos es mayor que 0, mostramos el número de intentos.
						if (contIntentos > 0) {
							System.out.println("Intentos restantes: " + contIntentos);
							// Si no...
						} else {
							//Le restringimos el acceso.
							System.out.println("Lo siento, no tiene acceso al área restringida.");
						}

					}
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
