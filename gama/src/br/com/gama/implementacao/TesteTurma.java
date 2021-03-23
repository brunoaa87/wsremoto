package br.com.gama.implementacao;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;

public class TesteTurma {
	
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		Curso curso = new Curso();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Turma turma = new Turma();
		
		//Preenchendo Endereco
		endereco.setLogradouro("AVENIDA ITAQUERA");
		endereco.setNumero("385A-Fundos");
		endereco.setComplemento("Viela 321");
		endereco.setBairro("ITAQUERA");
		endereco.setCidade("SÃO PAULO");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
		
		//Preenchendo Curso
		curso.setAtivo(true);
		curso.setDescricao("JAVA");
		curso.setDuracao( (byte) 6);
		curso.setSigla("JV");
		curso.setValor(10000);
		
		//Preenchendo Aluno
		aluno.setEmail("regina@gama.academy");
		aluno.setEndereco(endereco);
		aluno.setFone("1234-5678");
		aluno.setMatricula(1234);
		aluno.setNome("Bruna");
		
		//Preenchendo Professor
		professor.setArea("EXATAS");
		professor.setEndereco(endereco);
		professor.setFormacao("ENGENHARIA");
		professor.setNome("CLEBAO");
		
		//Preenchendo Turma
		turma.setAluno(aluno);
		turma.setCurso(curso);
		turma.setPeriodo("VESPERTINO");
		turma.setProfessor(professor);
		turma.setSigla("J01");
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
