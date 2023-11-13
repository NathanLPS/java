package aula_04;

import java.util.Scanner;

public class Exe01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
	int x,y;
	
	System.out.println("Digite o primeiro número: ");
	x= leia.nextInt();
	System.out.println("Digite o segundo número: ");
	y= leia.nextInt();
	
	if(x<y){
		System.out.printf("No Intervalo entre %d e %d:\n\n", x, y);
		for(int i = x; i <= y; i+=5) {
			if(i % 3 == 0 && i % 5 ==0) {
				System.out.printf("%d é multiplo de 3 e 5\n", i);
			}
			
	}
	

	}
	else {
		System.out.println("Intervalo inválido!");
	}

}
}
