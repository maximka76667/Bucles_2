package ej10;

import java.util.Scanner;

public class MCD {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero 1: ");
		int num1 = entrada.nextInt();
		System.out.print("Numero 2: ");
		int num2 = entrada.nextInt();

		entrada.close();

		int mcd = 0;
		for(int i = 1; i <= num1; i++) if(num1 % i == 0 && num2 % i == 0) mcd = i;

		System.out.println("MCD = " + mcd);
	}
}
