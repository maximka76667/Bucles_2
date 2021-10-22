package ej1;

import java.util.Scanner;

public class Art_de_asterixos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("N: ");
		int N = entrada.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i + 1; j++) System.out.print("*");
			System.out.println();
		}
		
		entrada.close();
	}
}
