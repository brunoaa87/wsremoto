package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {

	/*
	 * Dados a serem capturados:
	 * - Nome do Produto (notebooks)
	 * - Qtde
	 * - Imposto (10%, 5,8%)
	 * - Valor Unit�rio
	 * No final dever� exibir
	 * - o valor acrescido com o imposto
	 * - o valor do imposto isolado
	 * - o total com imposto
	 * - o total sem imposto
	 */
	
	public static void main(String[] args) {
	
		String produto = JOptionPane.showInputDialog("Digite o nome do produto.");
		short quantidade = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de notebooks."));
		float porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Porcentagem"));
		float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite valor do notebook."));
		float imposto = preco * (porcentagem/100);
		
		
		System.out.println("o valor com o imposto foi de: R$ " + (preco+imposto));
		System.out.println("o valor do imposto isolado � de: " + imposto);
		System.out.println("o total com imposto � de: R$ " + (preco+imposto)*quantidade);
		System.out.println("o total sem imposto � de: R$ " + (preco*quantidade));
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
