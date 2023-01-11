package ejercicioschetaos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int tamaño;
		int valor;
		int num[];
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos el tamaño al usuario
		System.out.print("¿De que tamaño quieres el array?: ");
		tamaño=sc.nextInt();
		
		//Le pedimos el valor de inicializacion al usuario
		System.out.print("¿Con que valor quieres inicializarlo?: ");
		valor=sc.nextInt();
		
		//Iniciamos con la variable tamaño
		num=new int[tamaño];
		
		//Rellenamos el array con la variable valor
		Arrays.fill(num, valor);
		
		//Mostramos el array
		System.out.println(Arrays.toString(num));
		
		//Cerramos el escaner
		sc.close();
	}

}
