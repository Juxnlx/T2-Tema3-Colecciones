package boletin1;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos un ArrayList numeros como integer para almacenar números enteros
		// aleatorios.
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Creamos la variable numeroAleatorio como int para almacenar números
		// aleatorios entre 0 y 100.
		int numeroAleatorio;

		// Creamos la variable sizeLista como int para almacenar el tamaño entre 5 y 10.
		int sizeLista;

		// Creamos la variable suma como int para almacenar la suma de todos los valores
		// de la lista.
		int suma = 0;

		// Creamos la variable media como float para almacenar la media de todos los
		// valores de la lista.
		double media;

		// Creamos la variable max como int para almacenar el valor maximo de la lista.
		// Para ello lo inicializamos al valor mas mínimo.
		int max = Integer.MIN_VALUE;

		// Creamos la variable min como int para almacenar el valor mínimo de la lista.
		// Para ello lo inicializamos al valor mas mínimo.
		int min = Integer.MAX_VALUE;

		// Creamos el objeto Random para gerar número aleatorios y un tamaño aleatorio.
		Random rand = new Random();

		// Asignamos a la variable sizeLista un número aleatorio entre 5 y 10.
		sizeLista = rand.nextInt(5, 11);

		// Creamos un for para recorrer la lista entre 5 y 11 veces.
		for (int i = 0; i < sizeLista; i++) {

			// Asignamos a la variable numeroAleatorio un número aleatorio entre 0 y 101.
			numeroAleatorio = rand.nextInt(0, 101);

			// Añadimos a la lista numeros el número aleatorio entre 0 y 100.
			numeros.add(numeroAleatorio);

			// Añadimos a la variable suma la suma de cada de cada aleatorio que se va
			// generando.
			suma += numeroAleatorio;

			// Comprobamos si el número aleatorio es mayor que el max, que es el valor mas
			// bajo. Si es así asignamos a max el número aleatorio.
			if (numeroAleatorio > max) {
				max = numeroAleatorio;
			}

			// Comprobamos si el número aleatorio es menor que el min, que es el valor mas
			// alto. Si es así asignamos a min el número aleatorio.
			if (numeroAleatorio < min) {
				min = numeroAleatorio;
			}
		}

		//Asiganamos a la variable media la ecuación suma entre el número de números que hay.
		media = (suma/sizeLista);
		
		//Mostramos la lista de números aleatorios.
		System.out.print("Lista de números aleatorios --> ");
		
		//Imprimimos la lista recorriendola con un for-each.
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}

		// Salto de linea
		System.out.println();
		System.out.println();

		// Mensaje mostrando las distintas ecuaciones que nos solicita el enunciado.
		System.out.println("ECUACIONES MATEMATICAS");
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Máximo: " + max);
		System.out.println("Mínimo: " + min);

	}

}
