package br.com.inventario.beans;

import java.util.List;

public class Servidor {
	
	private String nome;
	private String descricao;
	public List<Software> software;
	
		
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public List<Software> getSoftware() {
		return software;
	}



	public void setSoftware(List<Software> software) {
		this.software = software;
	}



	public Servidor() {
		super();
	}



	public Servidor(String nome, String descricao, List<Software> software) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.software = software;
	}



	@Override
	public String toString() {
		return "Servidor [nome=" + nome + ", descricao=" + descricao + ", software=" + software + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
