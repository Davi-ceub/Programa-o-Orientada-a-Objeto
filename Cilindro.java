package negócio;

public class Cilindro implements Solido {
	// Propriedades da classe
	private double raio = 0;
	private double altura = 0;

	// métodos construtores da classe
	public Cilindro() {
		super();
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

// métodos de acesso da classe
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

// métodos implementados de interface
	public double CalcularArea() {
		return (2 * Math.PI * Math.pow(getRaio(), 2) + 2 * Math.PI * getRaio() * getAltura());
	}

	public double CalcularVolume() {
		return (Math.PI * Math.pow(getRaio(), 2) * getAltura());
	}
}
