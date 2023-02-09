package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Creacion de arrays
		String[] tablero= {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
		String[] auxiliar= {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"};
		
		//Creamos la posicion que quiere descubrir el usuario
		int pos;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Generamos las minas en el array auxiliar
		Funciones.tablero(auxiliar);
		
		//Mostramos el tablero al usuario
		System.out.println(Arrays.toString(tablero));
		System.out.println(Arrays.toString(auxiliar));
		
		//Le pedimos la posición al usuario
		System.out.print("Introduce la posicion que quieres descubrir: ");
		pos=sc.nextInt();
		
		//LLamamos a la funcion par mostrar si ha tocado una mina y si hay alguna cerca o no
		Funciones.posicionUsuario(tablero, auxiliar, pos);

		//Mostramos el tablero con la posicion ya descubierta
		System.out.println(Arrays.toString(tablero));
	}

}
