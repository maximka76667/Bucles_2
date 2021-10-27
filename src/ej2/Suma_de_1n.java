package ej2;

import java.util.Scanner;

public class Suma_de_1n {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("N: ");
		
		double N = entrada.nextDouble();
		double suma = 0;

		for(int i = 1; i <= N; i++) suma += 1d / i;
		
		System.out.println("Suma: " + suma);

		entrada.close();
	}

}
