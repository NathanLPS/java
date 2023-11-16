package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exe01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite a %d° cor: ", (i+1));
			String cor= leia.nextLine();
			cores.add(cor);
		}	
		
	System.out.println("\nListar todas as cores: ");
	cores.forEach(System.out::println);
	
	Collections.sort(cores);
	System.out.println("\nOrdenar Cores: ");
	cores.forEach(System.out::println);
	
	
	
	
	}

}
