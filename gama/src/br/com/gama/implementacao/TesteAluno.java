package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Endereco;

public class TesteAluno {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setLogradouro("AVENIDA ITAQUERA");
		endereco.setNumero("385A-Fundos");
		endereco.setComplemento("Viela 321");
		endereco.setBairro("ITAQUERA");
		endereco.setCidade("SÃO PAULO");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
				

		Aluno aluno = new Aluno();
		aluno.setEndereco(endereco);
		aluno.setEmail(JOptionPane.showInputDialog("Email ").toLowerCase());
		aluno.setFone(JOptionPane.showInputDialog("Fone"));
		aluno.setNome(JOptionPane.showInputDialog("Nome ").toUpperCase());
		aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula ")));

		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Email: " + aluno.getEmail());
		System.out.println("Telefone: " + aluno.getFone());
		System.out.println("Endereço: " + aluno.getEndereco());
		//OU
		Aluno aluno2 = new Aluno();
		aluno2.setAll(
				endereco,
				JOptionPane.showInputDialog("Nome 2").toUpperCase(), 
				Integer.parseInt(JOptionPane.showInputDialog("Matricula 2")), 
				JOptionPane.showInputDialog("Email 2").toLowerCase(), 
				JOptionPane.showInputDialog("Telefone 2 ")
				);
		System.out.println(aluno2.toString());
		
		System.out.println("Bairo: " + aluno.getEndereco().getBairro());
		System.out.println("Cidade: " + aluno.getEndereco().getComplemento());
		
		
		
		
	}

}
