package buscaminas;

public class Funciones {
	
	static void tablero(String[] tablero, String[] auxiliar) {
		
		//Insertamos las minas
		int numMinas=6;
		for(int i = 1; i <= numMinas; i++) {
			int posMinas=(int)(Math.random()*tablero.length);
			auxiliar[posMinas]="*";
			if(auxiliar[posMinas].equals("*")) {
				i--;
			}
		}
	}

}
