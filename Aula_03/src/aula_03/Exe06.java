package aula_03;

import java.util.Scanner;

public class Exe06 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nomeColab;
		int cargo;
		float salario;
		
		System.out.print("Digite o seu nome: ");
		nomeColab= leia.nextLine();
		
		System.out.println("Cód--Cargo---");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI ");
		
		System.out.print("\nDigite o código do seu cargo: ");
		cargo= leia.nextInt();
		System.out.println("\nInforme seu salário: ");
		salario= leia.nextFloat();
		
		switch(cargo) {
		case 1:
			System.out.printf("\nNome Colaborador: %s%n ", nomeColab);
			System.out.printf("\nCargo: Gerente%n");
			System.out.printf("\nSalário: R$ %.2f%n ", ((salario*0.1)+salario));
			break;
		case 2:
			System.out.printf("\nNome Colaborador:%s%n  ", nomeColab);
			System.out.printf("\nCargo: Vendedor%n");
			System.out.printf("\nSalário: R$ %.2f%n ", ((salario*0.07)+salario));
			break;
		case 3:
			System.out.printf("\nNome Colaborador: %s%n  ", nomeColab);
			System.out.printf("\nCargo: Supervisor%n");
			System.out.printf("\nSalário: R$ %.2f%n ", ((salario*0.09)+salario));
			break;
		case 4:
			System.out.printf("\nNome Colaborador: %s%n  ", nomeColab);
			System.out.printf("\nCargo: Motorista%n");
			System.out.printf("\nSalário: R$ %.2f%n ", ((salario*0.06)+salario));
			break;
		case 5:
			System.out.printf("\nNome Colaborador: %s%n  ", nomeColab);
			System.out.printf("\nCargo: Estoquista%n");
			System.out.printf("\nSalário: R$ %.2f%n ", ((salario*0.05)+salario));
			break;
		case 6:
			System.out.printf("\nNome Colaborador: %s%n  ", nomeColab);
			System.out.printf("\nCargo: Técnico de Ti%n");
			System.out.printf("\nSalário: R$ %.2f%n ", ((salario*0.8)+salario));
			break;
		default:
			System.out.println("Cargo inválido!");
	

		
		}
		

	}

}
