package eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	static boolean esPrimo(int num) {
		// Creamos la variable para saber si es primo
		boolean esPrimo = true;

		// Recorremos los números desde 2 hasta número-1
		for (int i = 2; i < num; i++) {
			// Si el número es divisible por i deja de ser primo
			if (num % i == 0) {
				esPrimo = false;
				break;
			}
		}

		// Devovlemos la variable al main()
		return esPrimo;
	}

	public static void main(String[] args) {

		// Declaración de variables
		int numeros[] = new int[10];
		int contador = 0;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el array al usuario
		System.out.println("Dime 10 numeros: ");
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=sc.nextInt();
		}
		

		// Mostramos el array inicial
		System.out.println("Array inicial: " + Arrays.toString(numeros));

		// Mientras el contador sea menor que la longitud del array numeros
		while (contador < numeros.length) {

			// Si el resto de la posición contador del array numeros entre 2 no es 0
			if (!esPrimo(numeros[contador])) {

				// Movemos los numeros de atras una posicion hacia adelante
				System.arraycopy(numeros, contador + 1, numeros, contador, numeros.length - (1 + contador));

				// Le quitamos uno de longitud al array
				numeros = Arrays.copyOf(numeros, numeros.length - 1);

				// Si no
			} else {

				// Le añadimos 1 al contador
				contador++;
			}
		}

		// Mostramos el array final
		System.out.println("Array final: " + Arrays.toString(numeros));
		
		//Cerramos el escaner
		sc.close();

	}

}
