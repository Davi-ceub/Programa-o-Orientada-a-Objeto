package Negócio;

public abstract class Ave extends Animal {
// propriedades da classe
	private int quantidadeOvos = 0;

// métodos construtores da classe
	public Ave() {
		super();
	}

	public Ave(double peso, double altura, String nome, int quantidadeOvos) {
		super(peso, altura, nome);
		this.quantidadeOvos = quantidadeOvos;
	}

// métodos de acesso da classe
	public int getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(int quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}

}
