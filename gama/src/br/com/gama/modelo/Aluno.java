package br.com.gama.modelo;
/*
 * Design Pattern => ? um conjunto com as melhores pr?ticas para POO.
 *  - DTO (Data Transfer Object) => ? um pattern, que descreve as melhores pr?ticas para representar uma classe de um
 *  diagrama em uma programa??o.
 *  Regras:
 *  1- TODOS os atributos devem ser privados
 *  2- CADA atributo, deve possuir INDIVIDUALMENTE um m?todo para set e outro metodo para get.
 *  3- TODO classe modelo deve possuir NO MINIMO  dois contrutores:
 *  	- um vazio (n?o faz absolutamente nada)
 *  	- 
 *   
 *  (pacotes com classes originadas do Diagrama)
 *  modelo = model = beans = javabens = to = dto
 *  
 *   (pacotes com a(s) classe(s) que contenha(m) o main())
 *   teste = principal = implementacao
 */
public class Aluno {

	private String nome;
	private int matricula;
	private String email;
	private String fone;
	private Endereco endereco;
		

	public Aluno() {
		super();
	}


	public Aluno(String nome, int matricula, String email, String fone, Endereco endereco) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}


	public String getUsuario() {
		if (email.contains("@")==true) {
			return email.substring(0, email.indexOf("@"));
		}
		return "Email incompleto";
	}


	public void setAll(Endereco endereco, String nome, int matricula, String email, String fone) {
		this.endereco = endereco;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
	}


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", fone=" + fone
				+ ", endereco=" + endereco + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFone() {
		return fone;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}







} // fechar da classe
