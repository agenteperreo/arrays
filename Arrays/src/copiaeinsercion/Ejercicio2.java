package copiaeinsercion;

import java.util.Arrays;
import inserciones.Inserciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int numeros[]=new int[20];
		
		//Generamos los 20 numeros aleatorios
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(numeros));
		
		int pares[]=new int[0];
		int impares[]=new int[0];
		
		
		for(int i=0; i<numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares = Arrays.copyOf(pares, pares.length+1);
				pares[pares.length-1] = numeros[i];
			} else {
				impares = Arrays.copyOf(impares, impares.length+1);
				impares[impares.length-1] = numeros[i];
			}
		}
		
		System.out.println(Arrays.toString(Inserciones.unionArrays(pares,impares)));

	}

}
