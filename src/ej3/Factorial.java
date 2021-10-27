package ej3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("N: ");
		
		int N = entrada.nextInt();
		double fact = 1;

		for(int i = N; i > 0; i--) fact *= i;
		
		System.out.println("Factorial: " + fact);

		entrada.close();
	}

}
