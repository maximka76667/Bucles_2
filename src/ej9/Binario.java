package ej9;

import java.util.Scanner;

public class Binario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime tu numero: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		String result = "";
		
		if(numero <= 0) System.out.println(numero);
		
		while(numero >= 1) {
			result = (numero % 2) + result;
			numero = numero / 2;
		}
		
		System.out.println(result);
	}

}
