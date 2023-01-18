package copiaeinsercion;

import java.util.Arrays;
import java.util.Scanner;

import inserciones.Inserciones;

public class Ejercicio7 {

	static void mostrarTabla(int[] tabla) {

		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
	}

	public static void main(String[] args) {

		// Declaración de variables
		String opc;
		int numeros[] = new int[10];

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Rellenamos el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}

		// Mostramos el menu
		System.out.println("|-------------------------------|");
		System.out.println("|             MENU              |");
		System.out.println("|      a. Mostrar valores       |");
		System.out.println("|      b. Introducir valor      |");
		System.out.println("|           c. Salir            |");
		System.out.println("|-------------------------------|");
		System.out.println();

		// Le preguntamos que quiere hacer
		System.out.print("¿Que quieres hacer?: ");
		opc = sc.nextLine();

		//Mientras la opcion no sea c
		while (!opc.equals("c")) {
			
			//Si la opcion es a
			if (opc.equals("a")) {
				
				//Llamamos a la funcion mostrarTabla
				mostrarTabla(numeros);
				
			//Si la opcion es b	
			} else if (opc.equals("b")) {
				
				// Pedimos el valor
				System.out.print("¿Que valor quieres insertar?: ");
				int valor = sc.nextInt();

				// Pedimos la posicion
				System.out.print("¿En que posición?: ");
				int posicion = sc.nextInt();

				// Copiamos en el array numeros el array devuelto de la funcion
				// insercionPorPosicion
				Arrays.copyOf(numeros, Inserciones.insercionPorPosicion(valor, posicion, numeros).length);
				
			//Si no	
			} else {
				//Mostramos que la opcion no es valida
				System.err.println("\nERROR: Opción no valida.");
			}
			
			// Mostramos el menu
			System.out.println("|-------------------------------|");
			System.out.println("|             MENU              |");
			System.out.println("|      a. Mostrar valores       |");
			System.out.println("|      b. Introducir valor      |");
			System.out.println("|           c. Salir            |");
			System.out.println("|-------------------------------|");
			System.out.println();

			// Le preguntamos que quiere hacer
			System.out.print("¿Que quieres hacer?: ");
			opc = sc.next();
		}
		
		//Mostramos que ha finalizado el programa
		System.out.println("Hasta pronto");
		
		//Cerramos el escaner
		sc.close();

	}

}
