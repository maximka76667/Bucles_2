package ej12;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int guess = 0;
		
		double answer = Math.floor(1 + Math.random() * 100);
		
		do {
			System.out.print("Tu numero: ");
			guess = entrada.nextInt();
			if(guess > answer) System.out.println("Mi numero es menor");
			else if(guess < answer) System.out.println("Mi numero es mayor");
		} while (guess != answer);
		
	    System.out.println("Has ganado!");
	    
		entrada.close();
	}
}
