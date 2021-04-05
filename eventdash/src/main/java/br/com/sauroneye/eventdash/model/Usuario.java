package br.com.sauroneye.eventdash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	// Indica que a classe usuario é armazenavel no DB, caso contrario ele iria procurar a tabela com o exato nome e campos
@Table(name="itmn_usuario")
public class Usuario {
	@Id // Indica Chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // Gera o auto incremento
	@Column(name="id_usuario") //  De/Para do nome da coluna
	private int id;
	
	@Column(name="nome_usuario",length =100, nullable = false ) //  De/Para do nome da coluna
	private String nome;
	
	@Column(name="email_usuario",length =50, nullable = false, unique = true) //  De/Para do nome da coluna
	private String email;
	
	@Column(name="racf_usuario",length =7, nullable = false, unique = true) //  De/Para do nome da coluna
	private String racf;

	@Column(name="senha_usuario",length =30, nullable = false ) //  De/Para do nome da coluna
	private String senha;
	
	@Column(name="ramal_usuario",length =10) //  De/Para do nome da coluna
	private String ramal;
	
	@Column(name="link_foto",length = 255)
	private String linkFoto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
	
	
}
