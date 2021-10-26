package ej8;

import java.util.Scanner;

public class Pares_o_impares_hasta_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Pares o impares (p/i): ");
		char decision = entrada.nextLine().charAt(0);
		
		entrada.close();
		
		int i = 0;
		if(decision == 'i') i += 1;
		
		for(; i <= 10; i += 2) System.out.println(i);
	}

}
