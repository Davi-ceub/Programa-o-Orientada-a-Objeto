package negócio;

public class Novo extends Imovél {
// propriedades da classe
	private double adicional = 0;

// métodos construtores da classe
	public Novo() {
		super();
	}

	public Novo(String endereco, double metragem, double valor, double adicional) {
		super(endereco, metragem, valor);
		this.adicional = adicional;
	}// métodos de acesso da classe

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	// métodos sobrescritos da hierarquia
	public double getValor() {
	return(super.getValor() + this.getAdicional());
	}
}
