package Negócio;

public abstract class Mamifero extends Animal {
	// Propriedades da classe
	private int litrosleite = 0;
//métodos construtores da classe

	public Mamifero() {
		super();
	}

	public Mamifero(double peso, double altura, String nome, int litrosleite) {
		super(peso, altura, nome);
		this.litrosleite = litrosleite;
	}

// métodos de acesso da classe
	public int getLitrosleite() {
		return litrosleite;
	}

	public void setLitrosleite(int litrosleite) {
		this.litrosleite = litrosleite;
	}

}
