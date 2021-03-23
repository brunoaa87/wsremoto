package br.com.inventario.beans;

public class Software {
	
	private String nome;
	private String funcao;
	private float valor;
	private byte licenca;
	
			
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getFuncao() {
		return funcao;
	}



	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}



	public byte getLicenca() {
		return licenca;
	}



	public void setLicenca(byte licenca) {
		this.licenca = licenca;
	}



	public Software() {
		super();
	}



	public Software(String nome, String funcao, float valor, byte licenca) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.valor = valor;
		this.licenca = licenca;
	}



	@Override
	public String toString() {
		return "Software [nome=" + nome + ", funcao=" + funcao + ", valor=" + valor + ", licenca=" + licenca + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
