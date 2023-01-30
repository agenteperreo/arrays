package eliminacion;

import java.util.Arrays;
import java.util.Scanner;

import inserciones.Inserciones;

public class Ejercicio3 {

	static void menu() {

		// Mostramos el menu
		System.out.println("|-------------------------------|");
		System.out.println("|             MENU              |");
		System.out.println("|      a. Mostrar valores       |");
		System.out.println("|      b. Eliminar valor        |");
		System.out.println("|           c. Salir            |");
		System.out.println("|-------------------------------|");
		System.out.println();
	}

	static void mostrarLista(int lista[]) {
		// Mostramos el array
		System.out.println(Arrays.toString(lista));
	}

	public static void main(String[] args) {

		// Declaración de variables
		int numeros[] = new int[10];
		String opcion = "";

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los 10 numeros al usuario
		System.out.println("Dime 10 numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}

		while (!opcion.equals("c")) {

			// Mostramos el menú
			menu();

			// Pedimos que quiere hacer el usuario
			System.out.print("¿Que quieres hacer?: ");
			opcion = sc.next();

			switch (opcion) {

			case "a" -> {
				mostrarLista(numeros);
			}

			case "b" -> {
				System.out.print("¿Que numero quieres borrar?: ");
				int numBorrar = sc.nextInt();
				numeros = Inserciones.eliminacionEnArraysNumero(numBorrar, numeros);
			}

			case "c" -> {

			}

			default -> {
				System.err.println("ERROR: Opción no encontrada");
			}
			}

		}

		// Nos despedimos
		System.out.println("Hasta pronto.");
		
		//Cerramos el escaner
		sc.close();
	}

}
