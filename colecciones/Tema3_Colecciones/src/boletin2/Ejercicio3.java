package boletin2;

import java.util.HashMap;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Usamos el mapa HashMap para almacenar las letras y las veces que se repiten.
		HashMap<Character, Integer> cantLetras = new HashMap<Character, Integer>();

		// Creamos la cadena frase como String para almacenar una frase.
		String frase = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, "
				+ "sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un "
				+ "agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";

		// Creamos la variable caracter como char para almacenar la letra que estemos
		// recorriendo en ese momento de la frase.
		char caracter;

		// Pasamos todas las letras de frase en minuscula.
		frase = frase.toLowerCase();

		// Creamos este for para recorrer cada letra de la frase.
		for (int i = 0; i < frase.length(); i++) {

			// Guardamos en la variable caracter el caracter de la frase que estamos
			// recorriendo.
			caracter = frase.charAt(i);

			// Comprobamso si el caracter que estamos recorriendo es una letra, si es así...
			if (Character.isLetter(caracter)) {
				// Comprobamos si el caracter ya se encuentra en el mapa.
				if (cantLetras.containsKey(caracter)) {
					// Modificamos el valor de ese caracter a +1, para incremntar 1 vez mas que ha
					// aparecida en la frase.
					cantLetras.put(caracter, cantLetras.get(caracter) + 1);
					// Si no...
				} else {
					// Añadimos por primera vez la letra y 1 porque al ser la primera vez solo ha
					// aparecido 1 vez.
					cantLetras.put(caracter, 1);
				}
			}
		}

		System.out.println("¿Cuantas veces se repiten las letras de nuestra frase?");

		// Con este for-each recorremos todas la claves valor que encotramos en el mapa
		// cantLetras y las mostramos por consola.
		for (Character letras : cantLetras.keySet()) {
			System.out.println(letras + ": " + cantLetras.get(letras) + " veces");
		}
	}

}
