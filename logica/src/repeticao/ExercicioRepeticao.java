package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {

	public static void main(String[] args) {

		/*
		 * O jogador 1 ir� digitar um n�mero, o jogador 2
		 * ter� que advinhar o n�mero digitado pelo jogador 1.
		 * Somente quando ele acertar vai dar a mensagem de "Parab�ns"
		 * 
		 * Missao1:
		 * - d� dicas ao Jogador 2, se ele est� chutando alto ou baixo.
		 * 
		 * Missao2:
		 * - acrescentar na mensagem de Parab�ns, quantas tentativas 
		 * foram utilizadas at� que o jogador 2 acertasse.
		 * Dica: vai ter que utilizar uma vari�vel pra contar.
		 Exercicio 2
			Monte um programa que solicite a idade e o nome das pessoas. A aplica��o continuar� perguntando nome e idade enquanto o usu�rio afirmar que deseja continuar.
			Ao terminar, a aplica��o dever� exibir:
			- a quantidade de pessoas maiores de idade e 
			- a m�dia entre todas as idades que foram digitadas. 
			- a pessoa mais experiente (nome e idade)
			- a pessoa mais jovem (nome e idade)
		 */

		int numero=0;
		int chute=0;
		int contador=0;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero :"));
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Acerte o n�mero "));
			contador+=1;
			// contador = contador +1;
			// contador++;
			if (chute>numero) {
				System.out.println("N�mero chutado � alto");
			}else
				System.out.println("N�mero chutado � baixo");
			
		}while(chute!=numero);
		
		System.out.println("Parab�ns voc� acertou com " + contador + " tentativa(s)");






	}
}
