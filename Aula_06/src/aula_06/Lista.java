package aula_06;

import java.util.ArrayList;


public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		//fila remove o primeiro elemento da fila 
		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);

		for(var nota : notas)
			System.out.println(nota);
		
		System.out.println(notas);
		
		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0));
		
		System.out.println("Existe elemento 7? " + notas.contains(7.0));
		
		System.out.println("Elemento na posição 0: " + notas.get(0));
		
		notas.remove(3);
		
		System.out.println(notas);
		
		notas.forEach(System.out::println);
		
		notas.clear();
		
		System.out.println("A lista está vazia? " + notas.isEmpty());

	}

}
