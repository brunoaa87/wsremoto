package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Email").toLowerCase();

		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Email com @").toLowerCase();
		}

		System.out.println("Usu?rio: " + email.substring(0, email.indexOf("@")));

		String nome = JOptionPane.showInputDialog("Nome").toLowerCase();

		/*
		 * System.out.println("Qtde Caracteres: " + nome.length());
		 */

		while (nome.length()<3 || nome.length()>15) {
			nome = JOptionPane.showInputDialog("Nome com mais de 3 caracteres").toLowerCase();
		}

		System.out.println("Nome: " + nome);







	}

}
