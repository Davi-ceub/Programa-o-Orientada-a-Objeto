package negócio;

public class Cadeira {
 // propriedades da classe
	private String nome = "";

// métodos construtores da classe
	public Cadeira() {
		super();
	}

	public Cadeira(String nome) {
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
}
