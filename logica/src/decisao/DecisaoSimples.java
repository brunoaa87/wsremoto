package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		/*
		 * Capturar:
		 * 	- nome da disciplina
		 * 	- NOTA1
		 * 	- nota2
		 * 	No final exibir a m�dia entre as duas notas
		 * 	Exibir "Parab�ns" somente se a media for maior ou igual a 6.
		 */
		
		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		float media = (nota1 + nota2)/2;
		System.out.println("M�dia: " + media);
		if (media>=6) {
			System.out.println("Parab�ns!\nAprovado na disciplina: " + disciplina);
		}
		if (media<4) {
			System.out.println("Infelizmente voc� foi reprovado.");
		}
		// && => and
		// || => or
		if (media<6 && media>=4) {
			System.out.println("Voc� ter� mais uma chance");
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
