package sieteymedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Creamos los arrays con los palos y las cartas
		String[] cartas = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
		String[] palos = {"Oro", "Basto", "Espada", "Copa"};
		
		//Nombres de los jugadores
		String nombreJ1, nombreJ2, pedirCarta="";
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos los nombres al usuario
		System.out.println("¿Cuales son vuestros nombres?: ");
		System.out.print("J1 ");
		nombreJ1= sc .nextLine();
		System.out.print("J2 ");
		nombreJ2=sc.nextLine();
		
		Funciones.menuTirada(nombreJ1, sc);
		while(true) {
			System.out.print("¿Quieres una carta?(si/no): ");
			pedirCarta=sc.next();
			
			if(pedirCarta.equalsIgnoreCase("si")) {
				System.out.println(Funciones.tiradaJ1(palos, cartas)); 
			} else if(pedirCarta.equalsIgnoreCase("no")) {
				break;
			} else {
				System.out.println();
			}
		}

	}

}
