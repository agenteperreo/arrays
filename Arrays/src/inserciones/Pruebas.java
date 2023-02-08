package inserciones;

import java.util.Scanner;

public class Pruebas {

	static void menu() {
		// Mostramos el menu
		System.out.println("|---------------------------------|");
		System.out.println("|             MENU                |");
		System.out.println("|      		a. Sumar              |");
		System.out.println("|     		b. Restar             |");
		System.out.println("|         	c. Dividir            |");
		System.out.println("|         	d. Multiplicar        |");
		System.out.println("|         	e. Salir              |");
		System.out.println("|---------------------------------|");
		System.out.println();
	}

	public static void main(String[] args) {

		// Declaración de variables
		int num1, num2;
		String opcion="";

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los 2 numeros
		System.out.println("Dime los 2 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while(!opcion.equals("e")) {
			menu();
			
			System.out.println("Que quieres hacer?: ");
			opcion=sc.next();
		}
		

	}

}
