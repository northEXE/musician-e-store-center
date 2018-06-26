package br.qxd.ufc.musician_estore_center.model;

import java.util.ArrayList;

public class Carrinho {
	private ArrayList<Produto> produtos;
	private Double precoTotal;

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

}