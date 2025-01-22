package boletin1;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos un TreeSet para almacenar cadenas en orden alfabetico y sin
		// cadenas repetidas.
		TreeSet<String> conjuntoNombres = new TreeSet<String>();

		// Creamos la variable nombre como String para almacenar los nombres
		// introducidos por el usuario.
		String nombre = "";

		// Creamos el Scanner para leer los nombres introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un nombre y lo leemos
		System.out.print("Introduce un nombre: ");
		nombre = sc.nextLine();

		// Comprobamos si el nombre introducido por el usuario no es fin, en ese caso se
		// añade al conjunto.
		while (!nombre.equals("fin")) {

			// Añadimos el nombre al conjunto.
			conjuntoNombres.add(nombre);

			// Le pedimos al usuario que introduzca un nombre de nuevo y lo leemos
			System.out.print("Introduce un nombre: ");
			nombre = sc.nextLine();
		}

		// Imprimimos el conjunto.
		System.out.println("Conjunto de nombre: ");
		System.out.println(conjuntoNombres);

		// Cierre de Scanner
		sc.close();
	}

}
