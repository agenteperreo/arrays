package ejercicioschetaos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		final int TAMAÑO = 10;
		int array1[] = new int[TAMAÑO];
		int array2[] = new int[TAMAÑO];

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {

			if (i <= 9) {
				array1[i] = sc.nextInt();
			}
			if (i > 9) {
				array2[i - TAMAÑO] = sc.nextInt();
			}
		}

		System.out.println("Los 10 primeros numeros y los 10 ultimos numeros"
				+ (Arrays.equals(array1, array2) ? " son iguales" : " no son iguales"));
		
		//Cerramos el escaner
		sc.close();
	}

}
