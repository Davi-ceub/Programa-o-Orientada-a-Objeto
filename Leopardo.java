package Negócio;

public class Leopardo extends Mamifero {
// propriedades da classe
	private double velocidade = 0;

// métodos construtores da classe
	public Leopardo() {
		super();
	}

	public Leopardo(double peso, double altura, String nome, int litrosleite, double velocidade) {
		super(peso, altura, nome, litrosleite);
		this.velocidade = velocidade;
	}

// métodos de acesso da classe
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

// métodos da classe
	public void correr() {
		System.out.println("Run Forest !");
	}

}
