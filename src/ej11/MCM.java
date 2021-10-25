package ej11;

import java.util.Scanner;

public class MCM {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero 1: ");
		int num1 = entrada.nextInt();
		System.out.print("Numero 2: ");
		int num2 = entrada.nextInt();

		entrada.close();
		
		int mcm = 0;
		//for(int i = 1; i <= num1; i++) if(num1 % i == 0) for(int j = 1; j <= num2; j++) if(num2 % i == 0) mcd = i;
		
		for(int i = 1; i <= num1 * num2; i++) {
			if(i % num1 == 0) {
				for(int j = 1; j <= i; i++) {
					if(j % num2 == 0) {
						if(i == j) {
							mcm = i;
							break;
						}
					}
				}
			}
		}
		
		System.out.println("MCD = " + mcm);
	}

}
