package aula_02;

import java.util.Scanner;

public class Exe01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		double salario, abono;
		
		System.out.println("Digite o salário inicial: ");
		salario= leia.nextDouble();
		System.out.println("Digite o abono: ");
		abono= leia.nextDouble();
		
		System.out.printf("Novo salário é R$ %.2f ", (salario+abono));

	}

}
