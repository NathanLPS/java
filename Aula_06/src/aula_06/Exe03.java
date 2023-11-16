package aula_06;

import java.util.HashSet;
import java.util.Scanner;

public class Exe03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i<10; i++) {
			System.out.printf("Digite o %d número:", (i+1));
			int numero= leia.nextInt();
			numeros.add(numero);
		}
	System.out.println("\nListar dados do Set: ");
	for(var numero : numeros) {
		System.out.println(numero);
	}
	leia.close();

	}

}
