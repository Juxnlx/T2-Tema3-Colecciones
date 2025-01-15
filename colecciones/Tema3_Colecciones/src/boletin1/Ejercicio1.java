package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos un ArrayList numeros para almacenar números enteros hasta introducir
		// uno negativo.
		ArrayList<Integer> numero = new ArrayList<Integer>();

		// Creamos la variable numeroUsuario como int para almacenar los números
		// introduucidos por el usurio.
		int numeroUsuario;

		// Creamos el Scanner para leer los números introducidos por el usuario.
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número positivo y lo leemos.
		System.out.print("Introduce un número: ");
		numeroUsuario = reader.nextInt();

		// Mientras el número de usuario sea mayor o igual a 0, lo añadimos y volvemos a
		// preguntar otra vez.
		while (numeroUsuario >= 0) {
			// Añadimos el número a la lista.
			numero.add(numeroUsuario);

			// Le pedimos al usuario que introduzca un número positivo y lo leemos.
			System.out.print("Introduce un número: ");
			numeroUsuario = reader.nextInt();
		}

		// Imprimimos un mensaje mostrando lo que vamos a imprimir por consola.
		System.out.println();
		System.out.print("Indices de valores pares introducidos --> ");

		// Recorremos la lista de numero.
		for (int i = 0; i < numero.size(); i++) {

			// Comprobamos si el número que estamos recorriendo es par, si es así imprimimos
			// el indice de ese número.
			if (numero.get(i) % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		// Cierre de Scanner
		reader.close();
	}

}
