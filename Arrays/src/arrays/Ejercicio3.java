package arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double enteros[]=new double[5];
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Dime 5 numeros");
		
		for(int i=0; i<enteros.length; i++) {
			enteros[i]=scan.nextDouble();
		}
		
		for(double numeros:enteros) {
			System.out.printf("%.2f\n",numeros);
		}
		
		scan.close();

	}

}
