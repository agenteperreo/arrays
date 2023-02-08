package funcionesarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	static int[] rellenaPares(int longitud, int fin) {
		
		//Creamos el array
		int t[] = new int[longitud];
		int contador=0;
		
		while(!(t[longitud-1] % 2 == 0)) {
			int numAle;
			numAle = (int) (Math.random()*fin+1);
			if(numAle % 2 == 0) {
				t[contador]=numAle;
				contador++;
			}
		}
		
		//Devolvemos el array
		return t;
		
	}
	
	public static void main(String[] args) {
		
		// Declaración de variables
		int longitud, fin;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la longitud del array y el numero maximo
		System.out.print("¿De que tamaño quieres el array?: ");
		longitud=sc.nextInt();
		System.out.print("¿Cual va a ser el numero maximo del array?: ");
		fin=sc.nextInt();
		
		//Llamamos a la funcion rellenaPares para crearlo
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		
		//Cerramos el escaner
		sc.close();
	}
	
}
