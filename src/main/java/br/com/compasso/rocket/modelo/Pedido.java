package br.com.compasso.rocket.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Pedido {
	
	private Collection<Produto> Compras = new ArrayList<Produto>();
	private Cliente cliente;
	
	
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}


	public void AdicionanaSacola(Produto produto) {
		Compras.add(produto);
	}


	@Override
	public String toString() {
		return "Opa";
	}
	

}
