package Negócio;

public class Cachorro extends Mamifero {
// propriedades da classe
	private double forcaMordida = 0;

// métodos construtores da classe
	public Cachorro() {
		super();
	}

	public Cachorro(double peso, double altura, String nome, int litrosleite, double forcaMordida) {
		super(peso, altura, nome, litrosleite);
		this.forcaMordida = forcaMordida;
	}

// métodos de acesso da classe
	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}

// métodos da classe
	public void morder() {
		System.out.println("Wolf! Wolf!");
	}

}
