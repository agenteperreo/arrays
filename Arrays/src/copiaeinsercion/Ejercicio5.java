package copiaeinsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		int tablaEnteros[] = new int[10];
		int pares[] = new int[0];
		int impares[] = new int[0];
		int numPares = 0, numImpares = 0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos 10 numeros
		System.out.println("Dime 10 numeros: ");
		for (int i = 0; i < 10; i++) {
			tablaEnteros[i] = sc.nextInt();
		}

		// Recorremos el array principal
		for (int i = 0; i < tablaEnteros.length; i++) {

			// Si el valor de la posicion i en la tabla principal es par
			if (tablaEnteros[i] % 2 == 0) {
				
				// Añadimos un hueco en el array de los pares
				pares = Arrays.copyOf(pares, pares.length + 1);
				
				// El valor de la posicion de la cantidad de pares del array pares es ahora el
				// valor de la posición i en la tabla principal
				pares[numPares] = tablaEnteros[i];
				
				//Aumentamos en uno la cantidad de pares que hay en la tabla de los pares
				numPares++;
				
			//Si es impar	
			} else {
				
				// Añadimos un hueco en el array de los impares
				impares = Arrays.copyOf(impares, impares.length + 1);
				
				// El valor de la posicion de la cantidad de impares del array impares es ahora el
				// valor de la posición i en la tabla principal
				impares[numImpares] = tablaEnteros[i];
				
				//Aumentamos en uno la cantidad de impares que hay en la tabla de los impares
				numImpares++;
			}
		}
		
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));
		
		//Cerramos el escaner
		sc.close();

	}

}
