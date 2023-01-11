package copiaeinsercion;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int numeros[]=new int[20];
		
		//Generamos los 20 numeros aleatorios
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(numeros));
		
		int pares[]=new int[20];
		int impares[]=new int[20];
		
		int indicePares=0;
		int indiceImpares=0;
		
		for(int numero : numeros) {
			if (numero % 2 == 0) {
				pares[indicePares] = numero;
				indicePares++;
			} else {
				impares[indiceImpares] = numero;
				indiceImpares++;
			}
		}
	}

}
