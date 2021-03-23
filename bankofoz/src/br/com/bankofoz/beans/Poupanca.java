package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoBasico;

public class Poupanca extends Conta implements PadraoBasico{
	
	private float rendimento;
	
	public void creditarRendimentos() {
		setSaldo(getSaldo() + getSaldo() * (rendimento/100));	
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "," + super.toString() + "]";
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
