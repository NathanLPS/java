package aula_03;

import java.util.Scanner;

public class Exe02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero= leia.nextInt();
		
		
		if((numero%2==0) && (numero>=0)) {
			System.out.printf("O número %d é par e positivo", numero);
		}else if((numero%2==0) && (numero<0)) {
			System.out.printf("O número %d é par e negativo", numero);
		}else if((numero%2!=0) && (numero>=0)) {
			System.out.printf("O número %d é ímpar e positivo", numero);
		}else if((numero%2!=0) && (numero<0)) {
			System.out.printf("O número %d é ímpar e negativo", numero);
		}else {
			System.out.println("não foi possivel calcular");
		}
				

	}

}
