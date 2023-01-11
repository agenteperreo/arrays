package inserciones;

import java.util.Arrays;

public class Inserciones {

	int[] insercionOrdenada(int num, int tabla[]) {
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

}
