package ej4;

public class Suma_pares_hasta_1000 {

	public static void main(String[] args) {
		int suma = 0;
		int N = 1000;
		for(int i = 0; i <= N; i += 2) suma += i;
		
		System.out.println("Suma de los pares hasta " + N + ": " + suma);
	}

}
