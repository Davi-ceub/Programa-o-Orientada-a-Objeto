package negócio;

public class Moto extends Veiculo {
	// propriedades da classe
	private int cilindrada = 0;

// métodos construtores da classe
	public Moto() {
		super();
	}

	public Moto(String modelo, Fabricante objFabricante, String cor, int cilindrada) {
		super(modelo, objFabricante, cor);
		this.cilindrada = cilindrada;
	}

// métodos de acesso da classe
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
