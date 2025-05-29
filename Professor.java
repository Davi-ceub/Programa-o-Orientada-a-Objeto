package Negócio;

import java.util.Collection;

import Persistencia.ProfessorDAO;

public class Professor {
// propriedades da classe
	private int id = 0;
	private String nome = "";
	private String titulacao = "";
	
	// métodos construtores da classe
	public Professor() {
		super();
	}

	public Professor(int id, String nome, String titulacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.titulacao = titulacao;
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

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	// métodos da classe
		public static Collection<Professor> getTodos() throws Exception {
			return new ProfessorDAO().getTodos();
		}

}
