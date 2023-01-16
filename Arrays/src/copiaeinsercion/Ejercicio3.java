package copiaeinsercion;

import java.util.Arrays;
import java.util.Scanner;

import inserciones.Inserciones;

public class Ejercicio3 {

	static boolean esPrimo(int a) {

		// Creamos un booleano para saber si es primos
		boolean esPrimo = true;

		if (a == 0 || a == 1) {
			esPrimo = false;
		} else {
			// Recorremos los números desde 2 hasta número-1
			for (int i = 2; i < a; i++) {
				// Si el número es divisible por i deja de ser primo
				if (a % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		// Devolvemos el boleano
		return esPrimo;
	}

	public static void main(String[] args) {
		// Declaracion de variables
		int numeros[] = new int[10];
		int primos[] = new int[0];
		int noPrimos[] = new int[0];

		// Abrimos el es escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos 10 numeros
		System.out.println("Dime 10 numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {

			// Si el numero de la posicion i del array es primo
			if (esPrimo(numeros[i])) {
				// Aumentamos en uno el espacio del array y añadimos el numero primo
				primos = Arrays.copyOf(primos, primos.length + 1);
				primos[primos.length - 1] = numeros[i];
			} else {
				noPrimos = Arrays.copyOf(noPrimos, noPrimos.length + 1);
				noPrimos[noPrimos.length - 1] = numeros[i];
			}
		}

		// Mostramos la union de los 2 arrays
		System.out.println(Arrays.toString(Inserciones.unionArrays(primos, noPrimos)));

		// Cerramos el escaner
		sc.close();

	}

}
