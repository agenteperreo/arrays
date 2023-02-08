package funcionesarrays;

import java.util.Scanner;

public class Ejercicio2 {

	static int maximo(int[] t) {
		// Declaración de variables
		int maximo = Integer.MIN_VALUE;

		// Recorremos el array comprobando si los numeros son mayores al maximo
		for (int i = 0; i < t.length; i++) {
			if (t[i] > maximo) {
				maximo = t[i];
			}
		}

		// Devolvemos el valor maximo
		return maximo;
	}

	public static void main(String[] args) {

		// Declaración de variables
		int[] enteros = new int[10];
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los numeros al usuario
		System.out.println("Dime 10 numero: ");
		for(int i = 0; i < enteros.length; i++) {
			enteros[i]=sc.nextInt();
		}
		
		//Mostramos el valor maximo de la tabla
		System.out.println("El valor maximo de la tabla es " + maximo(enteros));

		//Cerramos el escaner
		sc.close();
	}

}
