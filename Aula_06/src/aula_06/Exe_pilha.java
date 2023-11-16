package aula_06;

import java.util.Stack;
import java.util.Scanner;

public class Exe_pilha {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		int opcao= 1;
		String nomeLivro;
		
		while(opcao != 0) {
			System.out.println("*************************************");
			System.out.println("\n    1 - Adicionar Livro a pilha   ");
			System.out.println("    2 - Listar todos os livros     ");
			System.out.println("    3 - Retirar livro da Pilha     ");
			System.out.println("    0 - Sair                         ");
			System.out.println("\n*************************************");
		
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite o nome do livro: ");
				leia.skip("\\R");
				nomeLivro = leia.nextLine();
				pilha.add(nomeLivro);
				System.out.println("Pilha:");
				pilha.forEach(System.out::println);
				System.out.println("Livro adicionado!");
				break;
			
			case 2:
				if(pilha.isEmpty())
					System.out.println("\nA pilha está vazia!");
				else
					System.out.println("Lista de livros na pilha: ");
					pilha.forEach(System.out::println);
				break;
			
			case 3:
				if(pilha.isEmpty())
					System.out.println("\nA pilha está vazia!");
				else {
					String cliente = pilha.pop();
					System.out.println("O livro " + cliente + " foi retirado!");
					pilha.forEach(System.out::println);
				}
				break;
			
			case 0:
				System.out.println("programa finalizado!");
				
			default:
				System.out.println("Opção inválida");
				
			}
		
		}			

		

	}

}
