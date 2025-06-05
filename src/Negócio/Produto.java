package Negócio;

import java.util.Collection;

import Persistência.ProdutoDAO;

public class Produto {
// propriedades da classe
	private int idProduto = 0;
	private String Nome = "";
	private double Preco = 0;

	// métodos construtores da classe
	public Produto() {
		super();
	}

	public Produto(int idProduto, String nome, double preco) {
		super();
		this.idProduto = idProduto;
		Nome = nome;
		Preco = preco;
	}

// métodos de acesso da classe
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	// métodos da classe
	public static Collection<Produto> getTodos() throws Exception {
		return new ProdutoDAO().getTodos();
	}
}
