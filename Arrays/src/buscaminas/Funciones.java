package buscaminas;

public class Funciones {
	
	static final int numMinas=6;
	
	static void tablero(String[] auxiliar) {
		
		//Insertamos las minas
		for(int i = 1; i <= numMinas; i++) {
			int posMinas=(int)(Math.random()*auxiliar.length);
			if(auxiliar[posMinas].equals("*")) {
				i--;
			}
			auxiliar[posMinas]="*";
		}
		
		for(int i=0; i < auxiliar.length; i++) {
			
		}
	}
	
	static void posicionUsuario(String[] tablero, String[] auxiliar, int posicion) {
		
		//Le quitamos uno a la poscion para que sea funcional como indice
		posicion-=1;
		
		//Si la posicion anterior o posterior es una mina
		if(auxiliar[posicion-1].equals("*") || auxiliar[posicion+1].equals("*")) {
			
			//Mostramos que la posicion del usuario esta en contacto con una mina
			tablero[posicion]="1";
		
			//	
		}if(auxiliar[posicion-1].equals("*") && auxiliar[posicion+1].equals("*")){
			tablero[posicion]="2";
		}if(auxiliar[posicion].equals("*")){
			tablero[posicion]="*";
			System.out.println("¡¡¡BOOOOOM!!! Tocaste una mina");
		} else {
			tablero[posicion]="0";
		}
	}

}
