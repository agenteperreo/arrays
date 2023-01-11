package arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enteros[] = new int[10];
		
		for(int i=0; i<enteros.length; i++) {
			enteros[i]=(int)(Math.random()*100);
		}
		
		for(int entero:enteros) {
			System.out.println(entero);
		}

	}

}
