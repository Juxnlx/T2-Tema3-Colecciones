package boletin1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos un TreeMap para almacenar palabras clave - valor de forma ordenada.
		TreeMap<String, String> diccionario = new TreeMap<String, String>();

		// Creamos la variable palabraEsp como String para almacenar una palabra en
		// español introducida por el usuario.
		String palabraEsp = "";

		// Creamos la variable palabraIng como String para almacenar una palabra en
		// ingles introducida por el usuario.
		String palabraIng = "";

		// Creamos la variable opc como int para almacenar a opción seleccionada por el
		// usuario en el menú.
		int opc = 1;

		// Creamos el Scanner para solicitar las palabras y la opción introducida por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		while (opc != 0) {
			
			// Imprimimos el menú
			System.out.println("Seleccione 0 - 1 - 2 en el siguiente menú: ");
			System.out.println("1. Insertar palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Introduce la opción a ejecutar --> ");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1 -> {
				System.out.print("Introduce una palabra en español: ");
				palabraEsp = sc.nextLine();
				System.out.print("Introduce su traducción en ingles: ");
				palabraIng = sc.nextLine();

				diccionario.put(palabraEsp, palabraIng);
				
				System.out.println();
			}
			case 2 -> {
				System.out.print("Introduce la palabra de la que quieres saber su traducción: ");
				palabraEsp = sc.nextLine();

				if (diccionario.containsKey(palabraEsp)) {
					palabraIng = diccionario.get(palabraEsp);
					System.out.println("Su traducción es: " + palabraIng);
				} else {
					System.out.println("La palabra introducida no se encuentra en el mapa");
				}
				
				System.out.println();

			}
			default -> {
				System.out.println("Saliendo...");
			}
			}
		}
		
		
		//Cierre de Scanner
		sc.close();
	}

}
