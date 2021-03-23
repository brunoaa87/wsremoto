package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA","JR",5000));
		lista.add(new Cargo("ESTAGIARIO","PL",3000));
		lista.add(new Cargo("DEV","SR",15000));
		lista.add(new Cargo("DBA","SR",15500));
		lista.add(new Cargo("ANALISTA","JR",5500));
		
		System.out.println("Lista original: " + lista); 
		
		float total=0;
		int qtdeJr=0;
		List<CargoReduzido> resultado = new ArrayList<CargoReduzido>();
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Objeto: " + (contador+1));
			System.out.println("Cargo: " + lista.get(contador).getNome());
			System.out.println("Nivel: " + lista.get(contador).getNivel());
			System.out.println("Salário: " + lista.get(contador).getSalario());
			total+=lista.get(contador).getSalario();
			if (lista.get(contador).getNivel().toUpperCase().equals("JR")) {
				qtdeJr++;
				resultado.add(new CargoReduzido
						(lista.get(contador).getNome())
						)
			}
			
		}
		System.out.println("Total: " + total);
		System.out.println("Média: " + (total/lista.size()));
		System.out.println("Qtde Jrs: " + qtdeJr);
		
		/*
		 *  - Exibir o total de todos os salarios
		 *  - Exibir a média
		 *  - Exibir quantos cargos nível JR existem
		 */
		
		
			
		
		
		
		
		
	}

}
