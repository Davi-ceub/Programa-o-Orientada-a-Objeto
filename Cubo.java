package negócio;

public class Cubo implements Solido {
	// Propriedades da classe
	private double aresta = 0;

// métodos construtores da classe
	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}

// métodos de acesso da classe
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

// métodos implementados da interface
	public double CalcularArea() {
		return (6 * Math.pow(getAresta(), 2));
	}

	public double CalcularVolume() {
		return (Math.pow(getAresta(), 3));
	}
}
