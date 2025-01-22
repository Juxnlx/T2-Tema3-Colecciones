package boletin1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos un ArrayList como Integer para almacenar números enteros aleatorios.
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Creamos la variable numAleatorios como int para almacenar números aleatorios
		// entre 1 y 10.
		int numAleatorios;

		// Creamos la constante cantNumeros como int para almacenar la cantidad de
		// números que hay que generar.
		final int CANTNUMEROS = 30;

		// Creamos el objeto Random para generar números aleatorios entre 1 y 10 (ambos
		// incluidos).
		Random rand = new Random();

		// Creamos este for para generar 30 veces un número aleatorio.
		for (int i = 0; i < CANTNUMEROS; i++) {

			// En la variable numAleatorios almacenamos un número aleatorio entre 1 y 10.
			numAleatorios = rand.nextInt(1, 11);

			// Añadimos en la lista numeros el número aleatorio generado anteriormente y
			// almacenado en numAleatorios.
			numeros.add(numAleatorios);
		}

		// Utilizamos el método sort de Collection para ordenar una lista.
		Collections.sort(numeros);

		// Imprimimos el ArrayList numeros.
		System.out.println("Lista con números aleatorios ordenada: ");
		System.out.println(numeros);

	}

}
