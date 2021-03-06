package br.com.bankofoz.implementacao;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magica;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("CPF"),
				Magica.s("Fone")
				);
		
		Conta conta = new Conta();
		if (Magica.b("Abrir conta corrente?")==true) {
			conta = new Corrente(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("Saldo"),
					cliente,
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
		}else {
			conta = new Poupanca(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("Saldo"),
					cliente,
					Magica.f("Rendimento")
					);
		} // fechamento else
		
		System.out.println(conta);
		conta.sacar(1000);
		System.out.println(conta.verificarSaldo());
		
		/*
		if (conta instanceof Corrente) {
			((Corrente) conta).aumentarLimite(15);
			((Corrente) conta).getLimite();
		}else if (conta instanceof Poupanca) {
			((Poupanca) conta).creditarRendimentos();
			System.out.println("Saldo ap?s creditar rendimento: " + conta.verificarSaldo());
		}
		*/
		
		
		
		
		
		
		
		
		
	} // fechamento main

}
