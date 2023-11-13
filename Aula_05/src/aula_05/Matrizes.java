package aula_05;

import java.util.Scanner;

public class Matrizes {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		double [][] matrizDouble = new double [3][3]; 
		//matriz irregular
		int [][] matrizIrregular = {{1,2,3}, {4,5,6}};
		
		/*
		// Contrrolar a linha
		for(int indiceI = 0; indiceI < matriz.length; indiceI++){
			
			//Controlar a coluna
			for(int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				System.out.println("Matriz[" + indiceI +"][" + indiceJ +"] = " + matriz[indiceI][indiceJ]);
				matrizDouble[indiceI][indiceJ]= leia.nextDouble();
				
				
			}
		}*/
		for (int indiceI =0; indiceI < matrizIrregular.length; indiceI++) {
			for (int indiceJ= 0; indiceJ < matrizIrregular[indiceI].length; indiceJ++) {
				System.out.println("Matriz[" + indiceI +"]["+ indiceJ +"] = " + matrizIrregular[indiceI][indiceJ] );
			}
		}
		System.out.println("\n");
		for(int[] vetor: matrizIrregular) {
			for(int elemento: vetor) {
				System.out.println(elemento);
				
				
			}
		}

	}

}
