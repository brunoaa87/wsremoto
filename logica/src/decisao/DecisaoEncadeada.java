package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		
		/*
		 * Capturar as faltas
		 * O aluno estar? aprovado em rela??o a media e se as faltas forem menor que 20
		 * O mesmo vale para exame
		 */
		
		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		short falta = Short.parseShort(JOptionPane.showInputDialog("Digite o n?mero de faltas"));
		float media = (nota1 + nota2)/2;
		System.out.println("M?dia: " + media);
		if (media>=6 && falta<20) {
			System.out.println("Parab?ns!\nAprovado na disciplina: " + disciplina);
		} else if (media<4 || falta>=20) {
			System.out.println("Infelizmente voc? foi reprovado.");
		} else {
			System.out.println("Voc? ter? mais uma chance. \nEst");
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
