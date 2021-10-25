package ej3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("N: ");
		
		double N = entrada.nextDouble();
		double fact = 1;

		for(int i = 0; i < N; i++) fact *= N - i;
		
		System.out.println("Suma: " + fact);

		entrada.close();
	}

}
