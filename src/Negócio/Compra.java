package Negócio;

import Persistência.CompraDAO;

public class Compra {
// propriedades da classe
	private int idCompra = 0;
	private Produto objProduto = null;
	private Cliente objCliente = null;
	private String Data = "";
	private int Quantidade = 0;

	// métodos construtores da classe
	public Compra() {
		super();
	}

	public Compra(int idCompra, Produto objProduto, Cliente objCliente, String data, int quantidade) {
		super();
		this.idCompra = idCompra;
		this.objProduto = objProduto;
		this.objCliente = objCliente;
		Data = data;
		Quantidade = quantidade;
	}

//métodos de acesso da classe
	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public Produto getObjProduto() {
		return objProduto;
	}

	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}

	public Cliente getObjCliente() {
		return objCliente;
	}

	public void setObjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	// métodos da classe
	public String getDataParaBancoDeDados() {
		return getData().substring(6, 10) + "-" + getData().substring(3, 5) + "-" + getData().substring(0, 2);
	}

	public void persistir() throws Exception {
		new CompraDAO().persistir(this);
	}
}
