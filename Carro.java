package negócio;

public class Carro extends Veiculo {
	// propriedades da classe
	private boolean tetoSolar = false;
// métodos construtores da classe

	public Carro() {
		super();
	}

	public Carro(String modelo, Fabricante objFabricante, String cor, boolean tetoSolar) {
		super(modelo, objFabricante, cor);
		this.tetoSolar = tetoSolar;
	}

// métodos de acesso da classe
	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

}
