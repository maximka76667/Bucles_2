package ej6;

import java.util.Scanner;

public class Numero_primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime tu numero: ");
		int numero = entrada.nextInt();
		System.out.println(esPrimo(numero) ? "Numero es primo" : "Numero no es primo");

		entrada.close();
	}

	public static boolean esPrimo(int numero) {
		if(numero <= 3) return true;
		for(int i = 3; i < numero; i++) if(numero % i == 0) return false;
		return true;
	}
}
