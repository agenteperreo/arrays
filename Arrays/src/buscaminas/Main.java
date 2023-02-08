package buscaminas;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Creacion de arrays
		String[] tablero= {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
		String[] auxiliar= {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"};

		Funciones.tablero(tablero, auxiliar);
		System.out.println(Arrays.toString(auxiliar));
		System.out.println(Arrays.toString(tablero));
	}

}
