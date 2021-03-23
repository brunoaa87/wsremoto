package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	/*
	 * Regras para identificadores (nome de variavel, classe..):
	 * 1� N�o usar�s palavras reservadas da linguagem. public (errado)
	 * 2� N�o come�ar�s com n�meros. 1berto (errado) h1berto (certo)
	 * 3� N�o utilizar�s caracteres especiais (@, #, * ....)
	 * 
	 * Padr�es para identificadores:
	 * 1� Use nomes significativos.
	 * 2� Utilize o padr�o CamelCase.
	 * dataNascimento ou data_nascimento
	 * 3� Variaveis e metodos come�am com letra minuscula.
	 * 4� Classes come�am com letra maiuscula
	 * xpto() = > � um metodo
	 * xpto => � uma vari�vel.
	 * Xpto => � uma classe.
	 */
	
	public static void main(String[] args) {
		
		String time1 = JOptionPane.showInputDialog("Digite o Time 1");
		String time2 = JOptionPane.showInputDialog("Digite o Time 2");
		float entrada = Float.parseFloat(JOptionPane.showInputDialog("Digite a entrada"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o p�blico."));
		/*
		Classes Wrappers: s�o classes que apoiam os tipos primitivos
		int => Integer
		double => Double
		Tipos primitivos:
		boolean => true/false (perguntas l�gicas) trabalha? gr�vida?
		char => armazena somente UM caracter. Sempre entre apostrofos. 'a'
		=========================
		byte => -128/+127
		short => -32k/+32k
		int => -2trilh�es/+2trilh�es
		long => -9trilhoes/ +9trilhoes
		=========================
		float => com pouca precis�o nas casas decimais (5 casas).
		double => dobro de precis�o que o float nas casas decimais
		*/
		
		double total = entrada * publico;
		
		System.out.printf("No jogo entre %s x %s a arrecada��o foi de: R$ %.2f", time1, time2, total);
		
		
		
		
		
		
		
		
		
	}
}