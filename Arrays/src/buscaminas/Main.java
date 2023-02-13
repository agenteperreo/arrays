package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creacion de arrays
		String[] tablero = { "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",
				"#", "#" };
		String[] auxiliar = { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-",
				"-", "-" };

		// Creamos la posicion que quiere descubrir el usuario
		int pos = -1;
		
		//Cantidad de huecos abiertos
		int movimientos = 0;
		
		//Codigo de retorno
		int returnCode=0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Generamos las minas en el array auxiliar
		Funciones.minas(auxiliar);
		
		//Generamos las pistas en el array auxiliar
		Funciones.pistas(auxiliar);

		// Mostramos el tablero al usuario
		System.out.println(Arrays.toString(tablero));
		System.out.println();

		while (movimientos != (tablero.length - Funciones.numMinas) && returnCode==0) {
			// Le pedimos la posición al usuario
			System.out.print("Introduce la posicion que quieres descubrir: ");
			pos = sc.nextInt();

			// LLamamos a la funcion par mostrar si ha tocado una mina y si hay alguna cerca
			// o no
			returnCode = Funciones.posicionUsuario(tablero, auxiliar, pos);

			if (returnCode == 1) {
				break;
			}

			// Mostramos el tablero con la posicion ya descubierta
			System.out.println(Arrays.toString(tablero));

			// Para que sea mas limpio
			System.out.println();

			// Añadimos 1 a los movimientos hechos
			movimientos++;
		}

		// Si ha hecho los movimientos maximos
		if (returnCode==1)
			System.out.println("¡¡¡Ganaste!!!");
		else
			//Mostramos que le ha explotado
			System.out.println("¡¡¡BOOOOOOM!!! Tas matao");

		System.out.println(Arrays.toString(auxiliar));

		// Mostramos que ha terminado el juego
		System.out.println("Gracias por jugar.");

		// Cerramos el escaner
		sc.close();
	}

}
