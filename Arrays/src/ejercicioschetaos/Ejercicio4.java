package ejercicioschetaos;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int array[]=new int[30];
		
		for(int i=0; i<array.length; i++) {
			array[i]=(int)(Math.random()*10);
		}
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
