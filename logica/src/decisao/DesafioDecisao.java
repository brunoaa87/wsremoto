package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao {
	
	public static void main(String[] args) {
		
		short diaria = Short.parseShort(JOptionPane.showInputDialog("Informe o n� de di�rias utilizadas no hotel"));
		double valor = 80.00;
		if (diaria>15) {
			double conta = (valor + 5.50) * diaria;
			System.out.println("O valor da conta �: R$" + conta);
		}else if (diaria==15) {
			double conta = (valor + 6.00) * diaria;
			System.out.println("O valor da conta �: R$" + conta);
		}else {
			double conta = (valor + 8.00) * diaria;
			System.out.println("O valor da conta �: R$" + conta);
		}
		
	}

}
