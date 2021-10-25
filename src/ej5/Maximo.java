package ej5;

import java.util.Scanner;

public class Maximo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero: ");
		double numero = entrada.nextDouble();
		double maxNumero = numero;
		
		for(int i = 1; i < 10; i++) {
			System.out.print("Numero: ");
			numero = entrada.nextDouble();
			if(numero > maxNumero) maxNumero = numero;
		}
		
		System.out.println("Valor maximo: " + maxNumero);

		entrada.close();
	}

}
