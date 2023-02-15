package sieteymedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creamos los arrays con los palos y las cartas
		String[] cartas = { "1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey" };
		String[] palos = { "Oro", "Basto", "Espada", "Copa" };

		// Nombres de los jugadores
		String nombreJ1, nombreJ2, pedirCarta = "";

		// Diferencia respevto a 7.5
		double difJ1, difJ2;

		// Para saber que jugador es
		int jugador = 1;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Le pedimos los nombres al usuario
		System.out.println("¿Cuales son vuestros nombres?: ");
		System.out.print("J1 ");
		nombreJ1 = sc.next();
		System.out.print("J2 ");
		nombreJ2 = sc.next();

		// LLamamos a la funcion que nos va a dar las cartas y los puntos de cada una
		// con el nombre del primer jugador
		Funciones.pedirCartas(nombreJ1, sc, palos, cartas, pedirCarta, jugador);

		// LLamamos a la funcion que nos va a dar las cartas y los puntos de cada una
		// con el nombre del segundo jugador
		Funciones.pedirCartas(nombreJ2, sc, palos, cartas, pedirCarta, jugador + 1);

		// Mostramos los puntos de cada jugador
		System.out.println(nombreJ1 + " tiene " + Funciones.puntosJ1 + " puntos y " + nombreJ2 + " tiene "
				+ Funciones.puntosJ2 + " puntos.");

		// Si el jugador 1 tiene mas de 7.5 puntos y el jugador 2 menos o 7.5
		if (Funciones.puntosJ1 > 7.5 && Funciones.puntosJ2 <= 7.5) {
			// Mostramos que el jugador 2 ha ganado la partida
			System.out.println("Enhorabuena, " + nombreJ2 + ", has ganado la partida.");

			// Si el jugador 2 tiene mas de 7.5 puntos y el jugador 1 menos o 7.5
		} else if (Funciones.puntosJ2 > 7.5 && Funciones.puntosJ1 <= 7.5) {
			//// Mostramos que el jugador 2 ha ganado la partida
			System.out.println("Enhorabuena, " + nombreJ1 + ", has ganado la partida.");

			// Si los 2 jugadores tienen mas de 7.5 puntos
		} else if (Funciones.puntosJ1 > 7.5 && Funciones.puntosJ2 > 7.5) {

			// Calculamos la diferencia de cada jugador respecto a 7.5
			difJ1 = Funciones.puntosJ1 - 7.5;
			difJ2 = Funciones.puntosJ2 - 7.5;

			// Si la diferencia del jugador 1 es mayor que la del jugador 2
			if (difJ1 > difJ2) {
				// Mostramos que el jugador 2 ha ganado la partida
				System.out.println("Enhorabuena, " + nombreJ2 + ", has ganado la partida.");

				// Si la diferencia del jugador 1 es menor que las del jugador 2
			} else if (difJ1 < difJ2) {
				// Mostramos que el jugador 1 ha ganado la partida
				System.out.println("Enhorabuena, " + nombreJ1 + ", has ganado la partida.");

				// Si no
			} else {
				// Msotramos que han quedado empate
				System.out.println("Vaya, habeis quedado empate.");
			}

			// Si no
		} else {
			// Msotramos que han quedado empate
			System.out.println("Vaya, habeis quedado empate.");
		}

		//Mostramos el mensaje final
		System.out.println();
		System.out.println("Gracias por jugar");

	}

}
