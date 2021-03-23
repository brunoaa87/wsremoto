package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {
	
	public static void main(String[] args) {
		/*
		 *Collection Framework: s�o classes voltadas para a manipula��o de um conjunto de dados.
		 *S�o muito mais flexiveis quando comparadas aos vetores.
		 *Principais aspectos:
		 * - sua aloca��o � din�mica
		 * - dados podem ser heterogeneos ou homogeneos
		 * - n�o precisa da vari�vel pra controlar o indice   
		 * - posso remover uma posi��o
		 * - ordena��o simplificada
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
