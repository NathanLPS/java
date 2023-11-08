package aula_02;

import java.util.Scanner;

public class Exe03 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float sal_bruto, adc_noturno, hora_ext, desc;
		
		System.out.println("Digite o Salário bruto: ");
		sal_bruto= leia.nextFloat();
		System.out.println("Digite o Adicional noturno: ");
		adc_noturno= leia.nextFloat();
		System.out.println("Digite a Hora extra: ");
		hora_ext= leia.nextFloat();
		System.out.println("Digite o Desconto: ");
		desc= leia.nextFloat();
		
		System.out.printf("Slário Líquido R$%.2f " , (sal_bruto+adc_noturno+(hora_ext*5)-desc));
		

	}

}
