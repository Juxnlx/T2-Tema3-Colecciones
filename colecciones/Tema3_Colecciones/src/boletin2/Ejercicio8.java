package boletin2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos un HashMap para almacenar las categorias y las listas introducidas
		// por el usuario
		HashMap<String, HashSet<String>> tareasPorCatg = new HashMap<String, HashSet<String>>();

		// Declaramos el conjunto números donde almacenaremos los números de telefono.
		HashSet<String> conjuntoTarea;

		// Creamos la variable catg como Sring para almacenar la categoria introducida
		// por el usuario
		String catg = "";

		// Creamos la variable tarea como String para almacenar la tarea que queremos
		// guardar en una categoría.
		String tarea = "";

		// Creamos la variable opc como int para almacenar la opción del menú
		// introducida por el usuario.
		int opc;

		// Creamos el Scanner para leer la catg y la tarea introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("----------MENU----------");
			System.out.println("1. Añadir tarea.");
			System.out.println("2. Eliminar tarea.");
			System.out.println("3. Listar tarea por categoria.");
			System.out.println("0. Salir.");
			System.out.print("Introduce una opción: ");
			opc = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Creamos un switch para controlar todas las opciones posibles introducidas por
			// el usuario.
			switch (opc) {

			// Añadimos una tarea.
			case 1 -> {
				do {
					// Le pedimos al usuario que introduzca una categoria y la leemos.
					System.out.print("Introduce una categoria: ");
					catg = sc.nextLine();
					// Le pedimos al usuario que introduzca una tarea para esa categoria y la
					// leemos.
					System.out.print("Introduce una tarea: ");
					tarea = sc.nextLine();
					// Comprobamos si la categoria o la tarea estan vacias, si es así las volvemos a
					// preguntar.
				} while (catg.isEmpty() || tarea.isEmpty());

				// Asignamos al conjuntoTarea el conjunto de dicha categoria.
				conjuntoTarea = tareasPorCatg.get(catg);

				// Si la categoria existe en el mapa...
				if (tareasPorCatg.containsKey(catg)) {

					// Llamamos al conjunto de la categoria introducida por el usuario y le añadimos
					// la nueva tarea
					conjuntoTarea.add(tarea);

					// Si no existe.
				} else {
					// Creamos un ArrayList para almacenar todas las tareas de una categoria en un
					// conjunto.
					conjuntoTarea = new HashSet<String>();

					// Añadimos en el conjutno la tarea intoducida por el usuario.
					conjuntoTarea.add(tarea);

					// Añadimos a el mapa la nueva categoria y el conjunto recien creado.
					tareasPorCatg.put(catg, conjuntoTarea);
				}

				// Imprimos un mensaje de que la tarea ha sido añadida correctamente.
				System.out.println("La tarea ha sido introducida con EXITO");
			}

			// Eliminar tarea
			case 2 -> {
				// Le pedimos al usuario que introduzca una categoria y la leemos.
				System.out.print("Introduce una categoria: ");
				catg = sc.nextLine();
				// Le pedimos al usuario que introduzca una tarea para esa categoria y la
				// leemos.
				System.out.print("Introduce una tarea: ");
				tarea = sc.nextLine();

				// Asignamos al conjuntoTarea el conjunto de dicha categoria.
				conjuntoTarea = tareasPorCatg.get(catg);

				// Comprobamos si la categoria introducida existe en el mapa.
				if (tareasPorCatg.containsKey(catg)) {
					// Comprobamos si tarea introducida se ha borrado en en el conjunto.
					if (conjuntoTarea.remove(tarea)) {
						// Mostramos un mensaje de que se ha eliminado con existo
						System.out.println("La tarea se ha eliminado con EXITO");

						// Si no...
					} else {
						System.err.println("La tarea introducida NO EXISTE");
					}
					// Si no...
				} else {
					System.err.println("La categoria introducida NO EXISTE.");
				}

			}
			// Listar tarea por categoria.
			case 3 -> {
				// Le pedimos al usuario que introduzca una categoria y la leemos.
				System.out.print("Introduce una categoria: ");
				catg = sc.nextLine();

				// Asignamos al conjuntoTarea el conjunto de dicha categoria.
				conjuntoTarea = tareasPorCatg.get(catg);

				// Imprimimos la categoria y todos sus tareas.
				System.out.println("----------" + catg + "-----------");
				// Recorremos cada tarea y la vamos mostrando de linea en linea.
				for (String tareas : conjuntoTarea) {
					System.out.println("- " + tareas + "\n");
				}

			}

			// Salir
			case 0 -> {
				// Imprimimos un mensaje de salida
				System.out.println("Saliendo...");
			}

			// Opción incorrecta.
			default -> {

				// Mostramos un mensaje de que la opción introducida es erronea
				System.err.println("Opción introducida incorrecta");
			}
			}

			// Salto de linea
			System.out.println();

			// Mientras la opción sea distinta de 0 seguiremos preguntando una opción del
			// menú.
		} while (opc != 0);

		// Cierre de Scanner
		sc.close();

	}

}
