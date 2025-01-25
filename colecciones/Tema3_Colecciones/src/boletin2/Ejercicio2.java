package boletin2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Usamos el conjunto LinkedHashSet para alamcenar números con un orden segun
		// la inserción.
		LinkedHashSet<Integer> numAleatorios = new LinkedHashSet<Integer>();

		// Creamos el objeto Random para números aleatorios entre 1 y 20.
		Random rand = new Random();

		// Creamos un while para añadir tantas veces un número aleatorio hasta que el
		// tamaño de el conjunto sea 10.
		while (numAleatorios.size() < 10) {
			numAleatorios.add(rand.nextInt(1, 21));
		}

		// Imprimimos el conjunto.
		System.out.println("Conjunto con 10 número entre 1 y 20 --> " + numAleatorios);
	}

}
