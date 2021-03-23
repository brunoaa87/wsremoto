package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	public static void main(String[] args) {
		
		/*
		 * Sintaxe For:
		 * - contador e o valor inicial
		 * - condição
		 * - como vai ocorrer o incremento (contagem)
		 */
		short tabuada = Short.parseShort(JOptionPane.showInputDialog("Tabuada"));
		for (int contador=1;contador<11;contador+=1) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		}























	}
}
