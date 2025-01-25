package boletin2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos una lista con ArrayList para almacenar números enteros entre 1 y 10.
		ArrayList<Integer> numAleatorios = new ArrayList<Integer>();

		// Añadimos los números del 1 al 10 a la lista.
		for (int i = 1; i <= 10; i++) {
			numAleatorios.add(i);
		}

		// Imprimimos la lista ordenada
		System.out.println("LISTA ORDENADA");
		System.out.println(numAleatorios);

		// Usamos el método shuffle para desordenar aleatoriamente los elementos de la
		// lista.
		Collections.shuffle(numAleatorios);

		// Imprimimos la lista con los valores desordenados.
		System.out.println("LISTA DESORDENADA");
		System.out.println(numAleatorios);
	}

}
