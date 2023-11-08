package aula_02;

import java.util.Scanner;

public class Exe04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float n1, n2, n3, n4;
		
		System.out.println("Digite o Número 1 : ");
		n1= leia.nextFloat();
		System.out.println("Digite o Número 2 : ");
		n2= leia.nextFloat();
		System.out.println("Digite o Número 3 : ");
		n3= leia.nextFloat();
		System.out.println("Digite o Número 4 : ");
		n4= leia.nextFloat();
		
		System.out.println("Diferença: " + ((n1*n2)-(n3*n4)));
	}

}
