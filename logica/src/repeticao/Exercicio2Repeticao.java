package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2Repeticao {

	public static void main(String[] args) {
		/*
		 *Exercicio 2
		Monte um programa que solicite a idade e o nome das pessoas.
		A aplica??o continuar? perguntando nome e idade enquanto o usu?rio afirmar que deseja continuar.
			Ao terminar, a aplica??o dever? exibir:
			- a quantidade de pessoas maiores de idade e 
			- a m?dia entre todas as idades que foram digitadas. 
			- a pessoa mais experiente (nome e idade)
			- a pessoa mais jovem (nome e idade)
		 */
		String nome="";
		short idade=0;
		short totalIdades=0;
		short qtdePessoas=0;
		float media=0;
		short maior=0;
		String nomeMaisExperiente="";
		short idadeMaisExperiente=0;
		String nomeMaisJovem="";
		short idadeMaisJovem=0;
		String resp="";

		do {
			nome = JOptionPane.showInputDialog("Digite o nome. ");
			System.out.println("O nome ?: " + nome);
			idade = Short.parseShort(JOptionPane.showInputDialog("Qual a idade? "));
			if (idade<idadeMaisJovem || qtdePessoas==0) {
				idadeMaisJovem = idade;
				nomeMaisJovem = nome;
			}
			
			if (idade>idadeMaisExperiente) {
				idadeMaisExperiente = idade;
				nomeMaisExperiente = nome;
			}
			
			qtdePessoas+=1;
			totalIdades+=idade;
			if (idade>18) {
				maior+=1;	
			}
			resp=JOptionPane.showInputDialog("Digite <S> para continuar.").toUpperCase();
		}while(resp.equals("S"));
		media=totalIdades/qtdePessoas;
		JOptionPane.showMessageDialog(null, "Maiores de idade: " + maior);
		//System.out.println("Quatidade de pessoas maiores de idade: " + maior);
		System.out.println("A m?dia entre as idades ?: " + media);
		JOptionPane.showMessageDialog(null, "Nome mais experiente: " + nomeMaisExperiente + "\nIdade mais experiente: " + idadeMaisExperiente);







	}
}
