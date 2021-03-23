package br.com.lojaxpto.implementacao;

import javax.swing.JOptionPane;

import br.com.lojaxpto.modelo.Cliente;
import br.com.lojaxpto.modelo.PessoaFisica;
import br.com.lojaxpto.modelo.PessoaJuridica;

public class TesteCliente {
	
	public static void main(String[] args) {
		//Criei pela sub e instanciei pela sub
	//	PessoaFisica pf = new PessoaFisica();
		
		//Criei pela super e instanciei pela sub
	//	Cliente cli = new PessoaFisica();
		
		Cliente cliente = new Cliente();
		
		if (JOptionPane.showInputDialog("Digite <F> para fisica ou qqer coisa para Juridica").toUpperCase().equals("F")) {
			
			cliente = new PessoaFisica(
					"NOME PF",
					"EMAIL@PF.COM.BR",
					"12345678900",
					"1149146-x"
					);
		}else {
			cliente = new PessoaJuridica(
					"NOME PJ",
					"EMAIL@PJ.COM.BR",
					"112223334444/55",
					"CONTATO",
					"123.123.123"
					);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
