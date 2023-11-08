package aula_02;

import java.util.Scanner;

public class Exe02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a Nota1: ");
		nota1= leia.nextFloat();
		System.out.println("Digite a Nota2: ");
		nota2= leia.nextFloat();
		System.out.println("Digite a Nota3: ");
		nota3= leia.nextFloat();
		System.out.println("Digite a Nota4: ");
		nota4= leia.nextFloat();
		
		System.out.println("Média é: " + ((nota1+nota2+nota3+nota4)/4));
	}

}
