package Negócio;

public class Aguia extends Ave {
// propriedades da classe
	private double autonomia = 0;

// métodos construtores da classe
	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, int quantidadeOvos, double autonomia) {
		super(peso, altura, nome, quantidadeOvos);
		this.autonomia = autonomia;
	}

// métodos de acesso da classe
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
//métodos da classe

	public void voar() {
		System.out.println("Fly like an eagle ! Into the Future !");
	}

}
