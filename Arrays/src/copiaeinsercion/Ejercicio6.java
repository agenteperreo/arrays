package copiaeinsercion;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int ascendente[] = new int[100];
		int descendente[] = new int[100];
		int posicion=0;
		
		//Generamos el primer array
		for(int i=0; i<100; i++) {
			ascendente[i]=i+1;
		}
		
		//Generamos el segundo array
		for(int i=ascendente.length-1; i>0; i--, posicion++) {
			descendente[posicion]=ascendente[i];
		}
		System.out.println(Arrays.toString(ascendente));
		System.out.println(Arrays.toString(descendente));

	}

}
