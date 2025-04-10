package Negócio;

import java.util.ArrayList;
import java.util.Collection;

public class Uf {
// propriedades da classe
	private String sigla = "";

// métodos construtores da classe
	public Uf() {
		super();
	}

// métodos de acesso da classe
	public Uf(String sigla) {
		super();
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

// métodos da classe
	public static Collection<Uf> getTodos() throws Exception {
		ArrayList<Uf> colecao = new ArrayList<Uf>();
		colecao.add(new Uf("AC"));
		colecao.add(new Uf("AM"));
		colecao.add(new Uf("AP"));
		colecao.add(new Uf("BH"));
		colecao.add(new Uf("CE"));
		colecao.add(new Uf("DF"));
		colecao.add(new Uf("SP"));
		
		return colecao;
	}
}