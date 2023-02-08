package funcionesarrays;

import java.util.Scanner;

public class Ejercicio1 {
	
	static int sumatorio(int[] enteros) {
		//Declaración de variables
		int suma=0;
		
		//Sumamos el array
		for (int i=0; i<enteros.length; i++) {
			suma+=enteros[i];
		}
		
		//Devolvemos la suma
		return suma;
	}

	public static void main(String[] args) {
		
		//Declaración de variables
		int enteros[]=new int [10];
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los numeros al usuario
		System.out.println("Dime 10 numeros: ");
		for(int i = 0; i < enteros.length; i++) {
			enteros[i]=sc.nextInt();
		}
		
		//Mostramos la suma
		System.out.println("La suma de los huecos del array es " + sumatorio(enteros));

		//Cerramos el escaner
		sc.close();
	}

}
