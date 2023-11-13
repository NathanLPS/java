package aula_04;

import java.util.Scanner;

public class Exe05 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int x, soma=0;
		
		do {
			System.out.println("Digite um número: ");
			x = leia.nextInt();
			if(x >= 0) {
				soma += x;
			}
		} while (x != 0);

		System.out.printf("A soma dos números positivos é: %d", soma);
	}

	}

