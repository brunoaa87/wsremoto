package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {

	public static void main(String[] args) {
		
		float numero1=0;
		float numero2=0;
		String operacao="";
		String resp="";
		do {

			numero1 = Float.parseFloat(JOptionPane.showInputDialog("Número 1"));
			numero2 = Float.parseFloat(JOptionPane.showInputDialog("Número 2"));
			operacao = JOptionPane.showInputDialog("Digite Operador");
			if (operacao.equals("+")==true) {
				System.out.println("Resultado: " + (numero1+numero2));
			}else if (operacao.equals("-")) {
				System.out.println("Resultado: " + (numero1-numero2));
			}else if (operacao.equals("/")) {
				System.out.println("Resultado: " + (numero1/numero2));
			}else if (operacao.equals("*")) {
				System.out.println("Resultado: " + (numero1*numero2));				
			}else {
				System.out.println("Você não digitou um operador válido: ");
			}
		resp=JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();		
		}while (resp.equals("S"));
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
