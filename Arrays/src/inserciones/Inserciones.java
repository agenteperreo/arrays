package inserciones;

import java.util.Arrays;

public class Inserciones {

	public static int[] insercionOrdenada(int num, int tabla[]) {
		int indiceInsercion=Arrays.binarySearch(tabla, num);
		int copia[]=new int[tabla.length+1];
		
		if (indiceInsercion < 0) {
			indiceInsercion = -indiceInsercion - 1;
		}
		
		System.arraycopy(tabla, 0, copia, 0, indiceInsercion);
		System.arraycopy(tabla, indiceInsercion, copia, indiceInsercion+1, tabla.length - indiceInsercion);
		copia[indiceInsercion]=num;
		
		tabla=copia;
		
		return tabla;
	}
	
	public static int[] unionArrays(int tabla1[], int tabla2[]) {
		int tablaUnida[]= new int[tabla1.length+tabla2.length];
		
		System.arraycopy(tabla1, 0, tablaUnida, 0, tabla1.length);
		System.arraycopy(tabla2, 0, tablaUnida, tabla1.length, tabla2.length);
		
		return tablaUnida;
	}

}
