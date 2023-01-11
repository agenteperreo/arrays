package copiaeinsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaracion de variables
		int tabla[]=new int[15];
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los 15 numeros
		System.out.println("Dime 15 numeros: ");
		for(int i=0; i<15; i++) {
			tabla[i]=sc.nextInt();
		}
		
		//Mostramos el array antes de los cambios
		System.out.println(Arrays.toString(tabla));
		
		//Guardamos el ultimo numero en una variable
		int fin=tabla[tabla.length-1];
		
		//Avanzamos cada numero una posicion hacia adelante
		for(int i=tabla.length-1; i>0; i--) {
			tabla[i]=tabla[i-1];
		}
		
		//La primera posicion es ahora el ultimo numero antes
		tabla[0]=fin;
		
		//Mostramos la tabla con los cambios
		System.out.println(Arrays.toString(tabla));
		
		//Cerramos el escaner
		sc.close();
	}

}
