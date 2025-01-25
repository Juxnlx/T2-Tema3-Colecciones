package boletin1;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioA10 {

	public static void main(String[] args) {

		// Creamos un HashMap ya que el orden no es importante para almacenar nombre de
		// productos y su precio.
		HashMap<String, Double> almacen = new HashMap<String, Double>();

		// Creamos la variable opc como int para almacenar la opción del menú
		// introducida por el usuario.
		int opc = 1;

		// Creamos la variable producto como String para almacenar el producto que
		// queremos añadir en nuestro mapa.
		String producto = "";

		// Creamos la variable precio como double para almacenar el precio de cada
		// producto en nuestro mapa.
		double precio;

		// Creamos el Scanner para leer los productos y los precios introducidos por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Comprobamos si la opción introducida es distinta de 0, si es así volvemos a
		// ejecutar el menú.
		do {

			// Mostramos el menú con las distintas opciones que puede elegir el usuario.
			System.out.println("PRODUCTOS");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Listar existencias");
			System.out.println("0. Salir");
			System.out.println();

			// Le pedimos al usuario que introduzca una opción y la leemos.
			System.out.println("Introduce la opción a ejecutar --> ");
			opc = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Con este switch controlamos todas las opciones introducidas por el usuario.
			switch (opc) {

			// En el caso de introducir 1...
			case 1 -> {
				do {
					// Le pedimos al usuario que introduzca un producto y lo leemos.
					System.out.print("Introduce un producto: ");
					producto = sc.nextLine();
					// Le pedimos al usuario que introduzca un precio y lo leemos.
					System.out.print("Introduce un precio: ");
					precio = sc.nextDouble();
					sc.nextLine();

					// Comprobamos si el producto es cadena vacias y el precio negativo, en ese caso
					// volvemos a preguntar por un producto y precio.
				} while (producto.isEmpty() || precio <= 0);

				// Comprobamos mediante el metodo containsKey si el producto aparece en el mapa,
				// si es así le decimos al usuario que no se ha podido insertar el producto
				// porque ya existe.
				if (almacen.containsKey(producto)) {
					System.out.println("¡Lo siento! El producto ya existe.");
					// Si no...
				} else {
					// Añadimos al almacen el nuevo producto.
					System.out.println("¡Perfecto! El producto ha sido añadido correctamente.");
					almacen.put(producto, precio);
				}
			}

			// En el caso de introducir 2...
			case 2 -> {
				// Le pedimos al usuario que introduzca el producto a buscar y lo leemos.
				System.out.print("Introduce el producto a buscar: ");
				producto = sc.nextLine();

				// Comprobamos si el producto existe en el almacen, si es así lo eliminamos.
				if (almacen.containsKey(producto)) {
					System.out.println("¡Perfecto! El producto ha sido eliminado correctamente.");
					almacen.remove(producto);
					// Si no...
				} else {
					// Indicamos que el producto no existe y por lo tanto no se ha podido eliminar.
					System.out.println("¡Lo siento! El producto que quieres eliminar no existe.");
				}
			}

			// En el caso de introducir 3...
			case 3 -> {

				// Comprobamos si el almacen no esta vacio, en ese caso lo imprimimos.
				if (!almacen.isEmpty()) {
					// Hacemos uso del método keySet para recorrer las claves y luego con la clave
					// usamos el metodo get para coger el valor de ese número (las veces que se
					// repite).
					for (String productos : almacen.keySet()) {
						System.out.println(productos + ": " + almacen.get(productos) + " euros");
					}
					// Si no...
				} else {
					// Mostramos un mensaje informando que la lista esta vacia.
					System.out.println("La lista esta vacia");
				}
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

			// Salto de linea.
			System.out.println();

			// Comprobamos si la opción introducida es distinta de 0, si es así volvemos a
			// ejecutar el bucle.
		} while (opc != 0);

		// Cierre de Scanner
		sc.close();
	}

}
