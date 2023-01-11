package ejercicioschetaos;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		int array[]=new int[55];
		int desde=0;
		final int MAXNUM=10;

		// Iniciamos el array
		for(int i= 1; i<=MAXNUM; i++) {
			Arrays.fill(array, desde, desde+i, i);
			desde+=i;
		}
		
		//Msotramos el array
		System.out.println(Arrays.toString(array));
	}

}
