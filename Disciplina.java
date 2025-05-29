package Negócio;

import java.util.Collection;

import Persistencia.DisciplinaDAO;

public class Disciplina {
// propriedades da classe
	private int id = 0;
	private String nome = "";

	// métodos construtores da classe
	public Disciplina() {
		super();
	}

	public Disciplina(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	// métodos de acesso da classe
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// métodos da classe
	public static Collection<Disciplina> getTodos() throws Exception {
		return new DisciplinaDAO().getTodos();
	}
}
