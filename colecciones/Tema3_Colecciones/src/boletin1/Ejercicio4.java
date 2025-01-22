package boletin1;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos un TreeSet para generar una lista de enteros ordenados segun se vayan
		// generando y no deben de repetirse.
		TreeSet<Integer> numerosAleatorios = new TreeSet<Integer>();

		// Creamos la variable numAleatorio como int para almacenar números aleatorios
		// entre 0 y 99.
		int numAleatorio;

		// Creamos el objeto Random para generar números aleatorios.
		Random rand = new Random();

		// Seguimos generando números aleatorios hasta que el tamaño de la lista no sea
		// 20.
		while (numerosAleatorios.size() < 20) {

			// Generamos un número aleatorio entre 0 y 99 y lo almacenamos en la variable
			// numAleatorio.
			numAleatorio = rand.nextInt(0, 100);
			
			//Añadimos en la lista el número generado aleatoriamente y almacenado en numAleatorio.
			numerosAleatorios.add(numAleatorio);
		}

		// Imprimimos la lista numerosAleatorios.
		System.out.println(numerosAleatorios);
	}
}
