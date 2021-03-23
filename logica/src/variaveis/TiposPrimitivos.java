package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	/*
	 * Regras para identificadores (nome de variavel, classe..):
	 * 1° Não usarás palavras reservadas da linguagem. public (errado)
	 * 2° Não começarás com números. 1berto (errado) h1berto (certo)
	 * 3° Não utilizarás caracteres especiais (@, #, * ....)
	 * 
	 * Padrões para identificadores:
	 * 1° Use nomes significativos.
	 * 2° Utilize o padrão CamelCase.
	 * dataNascimento ou data_nascimento
	 * 3° Variaveis e metodos começam com letra minuscula.
	 * 4° Classes começam com letra maiuscula
	 * xpto() = > é um metodo
	 * xpto => é uma variável.
	 * Xpto => é uma classe.
	 */
	
	public static void main(String[] args) {
		
		String time1 = JOptionPane.showInputDialog("Digite o Time 1");
		String time2 = JOptionPane.showInputDialog("Digite o Time 2");
		float entrada = Float.parseFloat(JOptionPane.showInputDialog("Digite a entrada"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o público."));
		/*
		Classes Wrappers: são classes que apoiam os tipos primitivos
		int => Integer
		double => Double
		Tipos primitivos:
		boolean => true/false (perguntas lógicas) trabalha? grávida?
		char => armazena somente UM caracter. Sempre entre apostrofos. 'a'
		=========================
		byte => -128/+127
		short => -32k/+32k
		int => -2trilhões/+2trilhões
		long => -9trilhoes/ +9trilhoes
		=========================
		float => com pouca precisão nas casas decimais (5 casas).
		double => dobro de precisão que o float nas casas decimais
		*/
		
		double total = entrada * publico;
		
		System.out.printf("No jogo entre %s x %s a arrecadação foi de: R$ %.2f", time1, time2, total);
		
		
		
		
		
		
		
		
		
	}
}