package br.com.rubinhocar.modelo;

import javax.swing.JOptionPane;

public class TesteVeiculo {
	
	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		carro.preencherMontadora(JOptionPane.showInputDialog("Montadora"));
		carro.preencherModelo("uno");
		carro.preencherValor((float)15000.00);
		carro.preencherBasico(false, (short)200);
		System.out.println(carro.retornarTudo());
		System.out.println("Desconto: " + carro.retornarDesconto());
		carro.desligar();
		carro.acelerar((short)15);
		carro.acelerar((short)30);
		carro.desacelerar((short)20);
		System.out.println("Depois de acelerar:" + carro.retornarTudo());
	}

}
