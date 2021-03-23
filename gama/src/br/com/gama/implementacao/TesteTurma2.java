package br.com.gama.implementacao;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;
import br.com.gama.util.Magica;

public class TesteTurma2 {
	
	public static void main(String[] args) {
		Turma turma = new Turma(
				Magica.s("Sigla turma"),
				Magica.s("Periodo"),
				new Curso(
						Magica.s("Sigla curso"),
						"JAVA GAMA",
						true,
						Magica.f("Valor do curso"),
						(byte) 6
						),
				new Aluno(
						"REGINA",
						Magica.i("Matricula"),
						"bruna@gama.academy",
						"1234-4567",
						new Endereco(
								
								)
						),
				new Professor(
						"CLEBERSON",
						"ENGENHEIRO",
						"EXATAS",
						new Endereco(
								
								)
						)
				);
		
		System.out.println(turma.toString());		
		
		
		
	}

}
