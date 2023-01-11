package arrays;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		//Creamos el array de 10 huecos
		int num[] = new int[10];
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los 10 numeros al usuario
		System.out.println("Dime 10 numeros");
		for(int i=0; i<10; i++) {
			num[i]=sc.nextInt();
		}
		
		//Creamos el valor maximo con el minimo del int
		int valMax=(int) Double.MIN_VALUE;
		//Creamos el valor minimo con el maximo del int
		int valMin=(int) Double.MAX_VALUE;
		
		//Recorremos el array y calculamos los valores maximos y minimos
		for(int i=0;i<num.length; i++) {
			//Si el valor de la posicion i es menor que el valor minimo
			if(num[i]<valMin) {
				//El valor minimo es el valor de la posicion i del array
				valMin=num[i];
			}
			//si el valor de la posicion i es mayor que el valor maximo
			if(num[i]>valMax) {
				//El valor maximo es el valor de la posicion i del array
				valMax=num[i];
			}
		}
		
		//Mostramos cuales el valor maximo y minimo
		System.out.printf("El valor mayor es %d y el menor %d",valMax,valMin);
		
		//Cerramos el escaner
		sc.close();
	}
}
