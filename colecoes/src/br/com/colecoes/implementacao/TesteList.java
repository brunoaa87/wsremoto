package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {
	
	public static void main(String[] args) {
		/*
		 *Collection Framework: são classes voltadas para a manipulação de um conjunto de dados.
		 *São muito mais flexiveis quando comparadas aos vetores.
		 *Principais aspectos:
		 * - sua alocação é dinâmica
		 * - dados podem ser heterogeneos ou homogeneos
		 * - não precisa da variável pra controlar o indice   
		 * - posso remover uma posição
		 * - ordenação simplificada
		 */
		
		/* Exemplo Vetor
		 *  int[] numeros = new int[3];
		 *  int indice=0;
		 *  numeros[indice] = 500;
		 *  indice++;
		 *  numeros[indice] = 700;
		 */
		
		
		// Exemplo Collection
		List<String> lista = new ArrayList<String>(); // lista generics "<>"
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("ANALISTA");
		System.out.println("Lista original: " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(3);
		System.out.println("Lista sem quarto elemento: " + lista);
		Collections.sort(lista);
		System.out.println("Lista ordenada[A-Z]: " + lista);
		Collections.reverse(lista);
		System.out.println("Lista ordenada[Z-A]: " + lista);
		
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Cargo: " + (contador+1) + "-" + lista.get(contador));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
