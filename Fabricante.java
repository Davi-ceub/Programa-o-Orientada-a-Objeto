package negócio;

import java.util.ArrayList;
import java.util.Collection;

public class Fabricante {
	// propriedades da classe
	private String nome = "";
	// métodos construtores da classe

	public Fabricante() {
		super();
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}

	// métodos de acesso da classe

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

// métodos da classe
	public static Collection<Fabricante> getTodos() throws Exception {
		ArrayList<Fabricante> colecao = new ArrayList<Fabricante>();

		colecao.add(new Fabricante("Audi"));
		colecao.add(new Fabricante("BMW"));
		colecao.add(new Fabricante("Chevrolet"));
		colecao.add(new Fabricante("Ford"));
		colecao.add(new Fabricante("Honda"));
		colecao.add(new Fabricante("Jaguar"));
		colecao.add(new Fabricante("Maseratti"));
		colecao.add(new Fabricante("Toyota"));

		return colecao;

	}
}
