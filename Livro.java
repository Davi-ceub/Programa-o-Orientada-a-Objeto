package Negócio;

import Persistência.LivroDAO;

public class Livro {
// propriedades da classe
	private int id = 0;
	private String titulo = "";
	private Autor objAutor = null;

	// métodos construtores da classe
	public Livro() {
		super();
	}

	public Livro(int id, String titulo, Autor objAutor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.objAutor = objAutor;
	}
// métodos de acesso da classe

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getObjAutor() {
		return objAutor;
	}

	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}

	// métodos da classe
	public void persistir() throws Exception {
		new LivroDAO().persistir(this);
	}
}
