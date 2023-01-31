package inserciones;

import java.util.Arrays;

public class Inserciones {

	public static void insercionEnArrays(int nuevoElemento, int tabla[]) {

		// Le añadimos un hueco a la tabla
		tabla = Arrays.copyOf(tabla, tabla.length + 1);

		// Añadimos el nuevo elemento
		tabla[tabla.length - 1] = nuevoElemento;
	}

	public static int[] insercionPorPosicion(int valor, int posicion, int[] tabla) {

		// Añadimos un hueco a la tabla
		Arrays.copyOf(tabla, tabla.length + 1);

		// Movemos los numeros detras de la posicion marcada
		System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);

		// Insertamos el nuevo valor en su posicion
		tabla[posicion] = valor;

		// Devolvemos la tabla
		return tabla;
	}

	public static int[] insercionOrdenada(int num, int tabla[]) {
		int indiceInsercion = Arrays.binarySearch(tabla, num);
		int copia[] = new int[tabla.length + 1];

		if (indiceInsercion < 0) {
			indiceInsercion = -indiceInsercion - 1;
		}

		System.arraycopy(tabla, 0, copia, 0, indiceInsercion);
		System.arraycopy(tabla, indiceInsercion, copia, indiceInsercion + 1, tabla.length - indiceInsercion);
		copia[indiceInsercion] = num;

		tabla = copia;

		return tabla;
	}

	public static int[] unionArrays(int tabla1[], int tabla2[]) {
		int tablaUnida[] = new int[tabla1.length + tabla2.length];

		System.arraycopy(tabla1, 0, tablaUnida, 0, tabla1.length);
		System.arraycopy(tabla2, 0, tablaUnida, tabla1.length, tabla2.length);

		return tablaUnida;
	}

	public static void eliminacionEnArrays(int numABorrar, int[] tabla) {

		// Posicionamiento del numero a borrar
		int indiceBorrado;

		// Buscamos la posicion del numero
		indiceBorrado = Arrays.binarySearch(tabla, numABorrar);

		// Si el indice es mayor o igual que 0
		if (indiceBorrado >= 0) {
			// Desplazamos los elementos de la derecha una posición a la izquierda
			System.arraycopy(tabla, indiceBorrado + 1, tabla, indiceBorrado, tabla.length - indiceBorrado - 1);

			// Lo copiamos en otra tabla con una posicion menos
			tabla = Arrays.copyOf(tabla, tabla.length - 1);

			// Mostramos la tabla con el numero borrado
			System.out.println(Arrays.toString(tabla));

			// Si es menor que 0
		} else {
			// Mostramos que no existe el numero en la tabla
			System.out.println("No se encuentra el numero de la busqueda");
		}
	}

	public static void eliminacionEnArraysNumeroNO(int numABorrar, int[] tabla) {
		
		

		//Recorremos el array
		for(int i=0; i<tabla.length; i++) {
			if(tabla[i]==numABorrar) {
				//Movemos los numeros de atras una posicion hacia adelante
				System.arraycopy(tabla, i + 1, tabla, i, tabla.length - (1 + i));
				
				//Le quitamos uno de longitud al array
				Arrays.copyOf(tabla, tabla.length - 1);
			}
		}
		
	}

}
