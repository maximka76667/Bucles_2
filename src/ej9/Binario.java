package ej9;

import java.util.Scanner;

public class Binario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime tu numero: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		String result = "";
		
		// Para numeros menor de 0
		String accion = numero < 0 ? "-" : "";
		
		// Calculacion binario
		while(numero != 0) {
			result = Math.abs(numero % 2) + result;
			numero /= 2;
		}
		
		System.out.println(accion + result);
	}

}
