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
		System.out.println();
		System.out.println("------EMPEZAMOS-----");
		System.out.println("Turno de " + nombreJ);

	}

	static void pedirCartas(String nombre, Scanner sc, String[] palos, String[] cartas, String pedirCarta,
			int jugador) {
		//Llamamos a la funcion que nos mostrará el menu de inicio
		Funciones.menuTirada(nombre, sc);
		
		//Hacemos un bucle
		while (true) {
			//Le preguntamos si quiere una carta
			System.out.print("¿Quieres una carta?(s/n): ");
			pedirCarta = sc.next();
			
			//Si es el jugador 1
			if (jugador == 1) {
				
				//Si lo introducido por el usuario es una s de si
				if (pedirCarta.equalsIgnoreCase("s")) {
					
					//Mostramos la cadena que nos devuelva la funcion tiradaJ1
					System.out.println(Funciones.tiradaJ1(palos, cartas));
					
					//Mostramos los puntos que tiene el jugador
					System.out.println("Tienes " + Funciones.puntosJ1 + " puntos.");
					
					//Si los puntos del jugador son mayores que 7.5
					if (Funciones.puntosJ1 > 7.5) {
						//Mostramos que se ha pasado del limite
						System.out.println("¡Te has pasado!");
					}
					
					//Si la respuesta del usuario es no
				} else if (pedirCarta.equalsIgnoreCase("n")) {
					//Nos salimos del bucle
					break;
					
					//Si no
				} else {
					//Mostramos que la respuesta del usuario no es valida
					System.err.println("Opción no valida");
				}
				
				//Ponemos una linea para que no este todo junto
				System.out.println();
				
				//Si no, es el jugador 2
			} else {
				//Si lo introducido por el usuario es una s de si
				if (pedirCarta.equalsIgnoreCase("s")) {
					
					//Mostramos la cadena que nos devuelva la funcion tiradaJ2
					System.out.println(Funciones.tiradaJ2(palos, cartas));
					
					//Mostramos los puntos que tiene el jugador
					System.out.println("Tienes " + Funciones.puntosJ2 + " puntos.");
					
					//Si los puntos del jugador son mayores que 7.5
					if (Funciones.puntosJ2 > 7.5) {
						//Mostramos que se ha pasado del limite
						System.out.println("¡Te has pasado!");
					}
					
					//Si la respuesta del usuario es no
				} else if (pedirCarta.equalsIgnoreCase("n")) {
					//Nos salimos del bucle
					break;
					
					//Si no
				} else {
					//Mostramos que la respuesta del usuario no es valida
					System.err.println("Opción no valida");
				}
				
				//Ponemos una linea para que no este todo junto
				System.out.println();
			}
		}

	}
}
