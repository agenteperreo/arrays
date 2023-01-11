package ejercicioschetaos;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int num[]= new int[1000];
		int numBusq, contNum=0;
		
		//Abrimos el escaner
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100);
		}
		
		//Pedimos el valor a buscar
		System.out.print("¿Que valor quieres buscar?: ");
		numBusq=sc.nextInt();
		
		for(int i=0; i<num.length; i++) {
			if(num[i]==numBusq) {
				contNum++;
			}
		}

		//Mostramos cuantas veces esta el numero en el array
		System.out.printf("El numero %d se repite %d",numBusq,contNum);
		
		//Cerramos el escaner
		sc.close();
	}

}
