package sieteymedia;

import java.util.Scanner;

public class Funciones {

	static double puntosJ1 = 0;
	static double puntosJ2 = 0;

	static String tiradaJ1(String[] palos, String[] cartas) {

		// Generamos una carta y un palo aleatorio
		int carta = (int) (Math.random() * cartas.length);
		int palo = (int) (Math.random() * palos.length);

		// Si las cartas son la sota, caballo o rey
		if (carta == 8 || carta == 9 || carta == 10) {
			// Sumamos 0.5 a los puntos del jugador
			puntosJ1 += 0.5;
			// Si no
		} else {
			// Sumamos el valor de la carta a los puntos del jugador
			puntosJ1 += Integer.parseInt(cartas[carta]);
		}

		// Devolvemos la cadena
		return "Tu carta es: " + cartas[carta] + " de " + palos[palo];
	}

	static String tiradaJ2(String[] palos, String[] cartas) {

		// Generamos una carta y un palo aleatorio
		int carta = (int) (Math.random() * cartas.length);
		int palo = (int) (Math.random() * palos.length);

		// Si las cartas son la sota, caballo o rey
		if (carta == 8 || carta == 9 || carta == 10) {
			// Sumamos 0.5 a los puntos del jugador
			puntosJ2 += 0.5;
			// Si no
		} else {
			// Sumamos el valor de la carta a los puntos del jugador
			puntosJ2 += Integer.parseInt(cartas[carta]);
		}

		// Devolvemos la cadena
		return "Tu carta es: " + cartas[carta] + " de " + palos[palo];
	}

	static void menuTirada(String nombreJ, Scanner sc) {
		// Menu de incio
		System.out.println("------EMPEZAMOS-----");
		System.out.println("Turno de " + nombreJ + "\nPresiona intro");
		sc.nextLine();
		
		
	}

}
