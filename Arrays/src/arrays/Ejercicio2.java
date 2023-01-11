package arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int enteros[] = new int[10];
		int suma=0;

		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.random() * 100);
		}
		
		for(int i=0; i<enteros.length; i++) {
			suma+=enteros[i];
		}
		
		for(int numeros:enteros) {
			System.out.print(numeros+", ");
		}
		System.out.println();
		
		System.out.println("La suma del array es "+suma);

	}

}
