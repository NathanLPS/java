package aula_05;

import java.util.Scanner;

public class Exe04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		double [][] notas = new double[10][4];
		double [] media = new double [10];
		double total; 
		
		for(int linha=0; linha< notas.length;linha++) {
			for(int coluna=0; coluna < notas[linha].length; coluna++) {
				System.out.println("Digite a nota do participante " + (linha + 1) + " no bimestre " + (coluna + 1) + ": ");
				notas[linha][coluna] = leia.nextDouble();
			}
		}
		for(int linha=0; linha< notas.length; linha++) {
			total=0;
			for(int coluna=0; coluna< notas[linha].length; coluna++) {
				total+=notas[linha][coluna];
			}
			media[linha]= total/4;
		}
		
		System.out.println("Médias: ");
		for(int i=0; i<media.length; i++)
			System.out.printf(" %.2f", media[i]);
		

	}

}
