package aula_06;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Exe_fila {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		int opcao = 1;
		String nome;
		
		while(opcao != 0) {
			System.out.println("*************************************");
			System.out.println("\n    1 - Adicionar Cliente na Fila    ");
			System.out.println("    2 - Listar todos os Clientes      ");
			System.out.println("    3 - Retirar cliente da fila      ");
			System.out.println("    0 - Sair                         ");
			System.out.println("\n*************************************");
		
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite o nome do cliente: ");
				nome = leia.next();
				fila.add(nome);
				System.out.println("Fila:");
				fila.forEach(System.out::println);
				System.out.println("Cliente adicionado!");
				break;
			
			case 2:
				if(fila.isEmpty())
					System.out.println("\nA fila está vazia!");
				else
					System.out.println("Lista de clientes na fila: ");
					fila.forEach(System.out::println);
				break;
			
			case 3:
				if(fila.isEmpty())
					System.out.println("\nA fila está vazia!");
				else {
					String cliente = fila.remove();
					System.out.println("O(a) cliente " + cliente + " foi chamado!");
					fila.forEach(System.out::println);
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
