package eliminacion;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaración de variables
		int numeros[] = new int[20];
		int contador = 0;

		// Rellenamos el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100 + 1);
		}
		
		//Mostramos el array inicial
		System.out.println("Array inicial: "+Arrays.toString(numeros));

		//Mientras el contador sea menor que la longitud del array numeros
		while (contador < numeros.length) {
			
			//Si el resto de la posición contador del array numeros entre 2 no es 0
			if (numeros[contador] % 2 != 0) {
				
				//Movemos los numeros de atras una posicion hacia adelante
				System.arraycopy(numeros, contador + 1, numeros, contador, numeros.length - (1 + contador));
				
				//Le quitamos uno de longitud al array
				numeros = Arrays.copyOf(numeros, numeros.length - 1);
				
			//Si no	
			} else {
				
				//Le añadimos 1 al contador
				contador++;
			}
		}
		
		//Mostramos el array final
		System.out.println("Array final: "+Arrays.toString(numeros));

	}

}
