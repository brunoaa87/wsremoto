package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoBasico;

public class Corrente extends Conta implements PadraoBasico{
	
	private float limite;
	private float taxa;
	
	
	public void aumentarLimite(float porc) {
		limite = limite + limite * (porc/100);
	}
	
	public void debitarTaxa() {
		setSaldo(getSaldo()-taxa);
	}
	
	public boolean sacar(float valor) {
		if ((getSaldo()+limite)>=valor) {
			setSaldo(getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "," + super.toString() + "]";
	}


	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}


	public Corrente() {
		super();
	}


	public float getLimite() {
		return limite;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}


	public float getTaxa() {
		return taxa;
	}


	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	

}
