package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	
	public static void main(String[] args) {
		
		/*
		 * Capturar o nome de uma pessoa e idade
		 * e irão exibir as mensagens de acordo com a regra
		 * 
		 * "Voto obrigatório" = pessoas entre 18 e 70
		 * 
		 * "Voto facultativo" = 16 , 17 e acima de 70
		 * 
		 * "Não pode votar" = menores de 16 anos
		 */
		
		
		String nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade: "));
		
		if (idade>=18 && idade<70) {
			System.out.println(nome + "\nO voto é obigatório na sua idade!!!");
		}
		
		if (idade>=16 && idade==17 || idade>=70) {
			System.out.println(nome + "\nO voto é facultativo na sua idade!!");
		}
		
		if (idade<16) {
			System.out.println(nome + "\nVocê ainda não pode votar!!!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
