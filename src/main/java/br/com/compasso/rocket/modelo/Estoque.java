package br.com.compasso.rocket.modelo;

import java.util.Collection;
import java.util.HashSet;

public class Estoque {

	Collection<Produto> Estoque = new HashSet<Produto>();

	public void AdicionanaNoEstoque(Produto produto) {
		Estoque.add(produto);
	}

	@Override
	public String toString() {
		return "[" + Estoque + "]";
	}
}
