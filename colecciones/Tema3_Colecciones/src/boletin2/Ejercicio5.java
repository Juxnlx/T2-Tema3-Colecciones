package boletin2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos un HashMap para almacenar el nombres de series y su calificación.
		HashMap<String, Double> calificacionSeries = new HashMap<String, Double>();

		// Creamos la variable serie como String para almacenar el nombre de la serie
		// introducida por el usuario.
		String serie = "";

		// Creamos la variable puntuacion como double para almacenar la calificación de
		// una serie sobre 10.
		double puntuacion;

		// Creamos la variable opc como int para almacenar la opción del menú
		// seleccionada.
		int opc;

		// Creamos el Scanner para leer el nombre de la serie y la puntuacion.
		Scanner sc = new Scanner(System.in);

		do {
			// Mostramos el menú donde aparecen todos las opciónes.
			System.out.println("---------MENU---------");
			System.out.println("1. Agregar serie.");
			System.out.println("2. Buscar serie.");
			System.out.println("3. Eliminar serie.");
			System.out.println("4. Salir. \n");
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
					// Le pedimos al usuario que introduzca el nombre de la serie. Tambien
					// eliminamos los espacios a la deracha y a la izquierda.
					System.out.print("Introduce el nombre de la serie: ");
					serie = sc.nextLine();

					// Le pedimos al usuario que introduzca un valor númerico entre 1 y 10 para
					// calificar la nota y la leemos.
					System.out.println("Introduce la calificación de la serie: ");
					puntuacion = sc.nextDouble();
					sc.nextLine();
					// Mientras la serie sea cadena vacia o la puntación no este en el rango
					// requerido, volvera a preguntar la serie y la puntuación.
				} while (serie.isEmpty() || puntuacion < 1 || puntuacion > 10);

				// Comprobamos mediante el metodo containsKey si la serie aparece en el mapa,
				// si es así le decimos al usuario que no se ha podido insertar la serie
				// porque ya existe.
				if (calificacionSeries.containsKey(serie)) {
					System.out.println("¡Lo siento! La serie ya existe.");
					// Si no...
				} else {
					// Añadimos al calificador la nueva serie.
					System.out.println("¡Perfecto! La serie ha sido calificada correctamente.");
					calificacionSeries.put(serie, puntuacion);
				}
			}

			case 2 -> {
				// Comprobamos si el mapa esta vacio de series.
				if (!calificacionSeries.isEmpty()) {
					// Le pedimos al usuario que introduzca el nombre de la serie que quiere buscar.
					System.out.print("Introduce el nombre de la serie: ");
					serie = sc.nextLine();

					// Comprobamos si la serie introducido por el usuario existe en el mapa.
					if (calificacionSeries.containsKey(serie)) {
						// Imprimimos un mensaje mostrando que la serie existe en el mapa.
						System.out.println("La serie introducida EXISTE en nuestro mapa");
						// Mostramos la calificación de la serie solicitada.
						System.out.println("Puntuación de " + serie + ": " + calificacionSeries.get(serie) + " puntos.");

						// Si no...
					} else {
						// Imprimimos un mensaje diciendo que la serie introducida no existe en el
						// mapa..
						System.err.println("La serie introducida NO EXISTE en el mapa.");
					}
				} else {
					// Imprimimos un mesaje de que la lista esta vacia.
					System.err.println("La lista esta vacia");
				}
			}

			case 3 -> {
				// Comprobamos si el mapa esta vacio de series.
				if (!calificacionSeries.isEmpty()) {
					// Le pedimos al usuario que introduzca la serie que quiere eliminar y la
					// leemos.
					System.out.print("Introduce el nombre de la serie: ");
					serie = sc.nextLine();

					// Comprobamos si la serie que vamos a borrar existe en el mapa.
					if (calificacionSeries.containsKey(serie)) {
						// Usamos el método remove para eliminar la serie introducido por el usuario.
						calificacionSeries.remove(serie);
						// Mostramos un mensaje de que el nombre ha sido borrado con exito.
						System.out.println("Serie eliminada con éxito");

						// Si no...
					} else {
						// Imprimimos un mensaje diciendo que la serie introducida no existe en el
						// mapa.
						System.err.println("La serie introducida no existe en el mapa.");
					}
					//Si no...
				} else {
					// Imprimimos que la serie no se ha podido añadir.
					System.out.println("El mapa está vacío.");
				}
			}

			case 4 -> {
				// Imprimimos un mensaje de salida
				System.out.println("Saliendo...");
			}

			default -> {

				// Mostramos un mensaje de que la opción introducida es erronea
				System.out.println("Opción introducida incorrecta");
			}
			}

			// Mientras la opción sea distinta de 4 seguiremos preguntando una opción del
			// menú.
		} while (opc != 4);

		// Cierre de Scanner
		sc.close();
	}

}
