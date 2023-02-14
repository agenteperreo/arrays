package buscaminas;

public class Funciones {

	// Cantidad de minas que hay en la partida
	static final int numMinas = 6;

	static void minas(String[] auxiliar) {

		// Insertamos las minas
		for (int i = 1; i <= numMinas; i++) {
			int posMinas = (int) (Math.random() * auxiliar.length);
			if (auxiliar[posMinas].equals("*")) {
				i--;
			}
			auxiliar[posMinas] = "*";
		}

	}

	static void pistas(String[] auxiliar) {

		// Si en la primera posicion no hay mina y en la segunda si
		if (auxiliar[0].equals("-") && auxiliar[1].equals("*")) {
			// Ponemos 1 en la primera posicion
			auxiliar[0] = "1";
			// Si no
		} else {
			// Ponemos 0 en la primera posicion
			auxiliar[0] = "0";
		}

		// Si la ultima posicion no es una mina y la penultima posicion es una mina
		if (auxiliar[auxiliar.length - 1].equals("-") && auxiliar[auxiliar.length - 2].equals("*")) {
			//Ponemos 1 en la ultima poscion
			auxiliar[auxiliar.length - 1] = "1";
		//Si no	
		} else {
			//Ponemos 0 en la ultima posicion
			auxiliar[auxiliar.length - 1] = "0";
		}
		
		// Recorremos el array auxiliar
		for (int i = 1; i < auxiliar.length - 1; i++) {

			if (auxiliar[i].equals("*")) {

			} else if (auxiliar[i - 1].equals("*") && auxiliar[i + 1].equals("*")) {
				auxiliar[i] = "2";
			} else if (auxiliar[i - 1].equals("*") || auxiliar[i + 1].equals("*")) {
				auxiliar[i] = "1";
			} else {
				auxiliar[i] = "0";
			}
		}
	}

	static int posicionUsuario(String[] tablero, String[] auxiliar, int posicion) {

		// Para transformar la posicion en indice para que sea funcional
		posicion -= 1;

		// Codigo de retorno de la funcion
		int returnCode = 0;

		// Si la posicion puesta por el usuario es una bomba
		if (auxiliar[posicion].equals("*")) {

			// Cambiamos el codigo de vuelta
			returnCode = 1;
		}

		// Cambiamos la posicion del tablero por la posicion del auxiliar
		tablero[posicion] = auxiliar[posicion];

		// Cambiamos el codigo
		return returnCode;
	}

}
