package br.com.inventario.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.inventario.beans.Servidor;
import br.com.inventario.beans.Software;

public class TesteServidor {

	public static void main(String[] args) {

		List<Software> lista = new ArrayList<Software>();
		
		Servidor servidor = new Servidor(
				"SERV01",
				"XPTO DESC",
				lista
				);
		
		do {
			lista.add(new Software(
					JOptionPane.showInputDialog("NOME"),
					JOptionPane.showInputDialog("FUNCAO"),
					Float.parseFloat(JOptionPane.showInputDialog("VALOR")),
					Byte.parseByte(JOptionPane.showInputDialog("LICENÇAS"))
					
					));
			
		}while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0);
			
			
			int qtdeSO=0;
			String nome="";
		
			
			for (int contador=0;contador<servidor.getSoftware().size();contador++) {
				System.out.println("Total de software: " + 
						(servidor.getSoftware().get(contador).getValor() * 
						servidor.getSoftware().get(contador).getLicenca())
						+ "(" + servidor.getSoftware().get(contador).getNome() + ")"
						);
				if (servidor.getSoftware().get(contador).getFuncao().toUpperCase().equals("SO")) {
					qtdeSO++;
				}
				
				if (servidor.getSoftware().get(contador).getLicenca()==1) {
					nome+=servidor.getSoftware().get(contador).getNome() + "\n";
				}
									
	}
			System.out.println("Softwares com uma licença: " + nome);
			System.out.println("Total de SO´s: " + qtdeSO);
	
}
}