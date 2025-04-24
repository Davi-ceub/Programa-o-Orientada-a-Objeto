package Negócio;

import java.util.ArrayList;
import java.util.Collection;

public class Tipo {
// propriedades da classe
	private String descricao = "";

// métodos construtores da classe
	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
// métodos de acesso da classe
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// métodos da classe
	public static Collection<Tipo> getTodos() throws Exception {
		ArrayList<Tipo> colecao = new ArrayList<Tipo>();

		colecao.add(new Tipo("Livro"));
		colecao.add(new Tipo("Eletrônico"));
		colecao.add(new Tipo("Alimentação"));
		colecao.add(new Tipo("Brinquedo"));
		colecao.add(new Tipo("Eletrodoméstico"));
		colecao.add(new Tipo("Periféricos"));

		return colecao;
	}
}
