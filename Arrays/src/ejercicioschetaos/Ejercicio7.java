package ejercicioschetaos;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaración de variables
		int primitiva[] = new int[6];
		int premio[] = new int[6];
		int aciertos = 0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la combiancion de la primitiva
		System.out.println("Dime que numeros has maracado en la primitiva: ");

		for (int i = 0; i < primitiva.length; i++) {
			primitiva[i] = sc.nextInt();
		}

		// Pedimos la combinación ganadora
		System.out.println("Dime los numeros ganadores: ");

		for (int i = 0; i < premio.length; i++) {
			premio[i] = sc.nextInt();
		}
		
		for(int i=0; i<6; i++) {
			if(primitiva[i]==premio[i]) {
				aciertos++;
			}
		}
		
		sc.close();

	}

}
