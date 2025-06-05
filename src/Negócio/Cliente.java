package Negócio;

import java.util.Collection;

import Persistência.ClienteDAO;

public class Cliente {
// propriedades da classe
	private int idCliente = 0;
	private String Nome = "";
	private String CartaoDeCredito = "";

	// métodos construtores da classe
	public Cliente() {
		super();
	}

	public Cliente(int idCliente, String nome, String cartaoDeCredito) {
		super();
		this.idCliente = idCliente;
		Nome = nome;
		CartaoDeCredito = cartaoDeCredito;
	}

// métodos de acesso da classe
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCartaoDeCredito() {
		return CartaoDeCredito;
	}

	public void setCartaoDeCredito(String cartaoDeCredito) {
		CartaoDeCredito = cartaoDeCredito;
	}

	// métodos da classe
	public static Collection<Cliente> getTodos() throws Exception {
		return new ClienteDAO().getTodos();
	}
}
