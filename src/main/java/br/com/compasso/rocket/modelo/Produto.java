package br.com.compasso.rocket.modelo;

public class Produto {

	private double preco;
	private String descricao;
	private int estoque;

	public Produto(double preco, String descricao, int estoque) {
		this.preco = preco;
		this.descricao = descricao;
		this.estoque = estoque;
	}

	public double getPreco() {
		return preco;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return System.getProperty("line.separator") + "[Produto: " + descricao + " Preço: " + preco + "]";
	}

	public int getEstoque() {
		return estoque;
	}

	public void tiraEstoque(int quantidade) {
		this.estoque -= quantidade;
	}

}
