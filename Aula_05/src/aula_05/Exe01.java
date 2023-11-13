package aula_05;

import java.util.Scanner;

public class Exe01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int x;	
		
		System.out.println("Digite o número que você deseja encontrar: ");
		x = leia.nextInt();
		
		for(int i=0; i < vetor.length; i++) {
			if(x == vetor[i]) {
				System.out.printf("O número %d está na posição %d no vetor. \n", x,i);
			}
		}
		
		System.out.printf("O número %d não foi encontrado no vetor.\n", x);

	}

}
