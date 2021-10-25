package ej7;

public class Primos_hasta_1000 {

	public static void main(String[] args) {
		for(int i = 0; i <= 1000; i++) System.out.println(i + (esPrimo(i) ? " es primo" : " no es primo"));
	}

	public static boolean esPrimo(int numero) {
		if(numero <= 3) return true;
		for(int i = 3; i < numero; i++) if(numero % i == 0) return false;
		return true;
	}

}
