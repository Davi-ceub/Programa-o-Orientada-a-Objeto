package negócio;

public class Usado extends Imovél{
// propriedades da classe
	private double depreciacao = 0;
// métodos construtores da classe
	public Usado() {
		super();
	}
public Usado(String endereco, double metragem, double valor, double depreciacao) {
	super(endereco, metragem, valor);
	this.depreciacao = depreciacao;
}
// métodos de acesso da classe
public double getDepreciacao() {
	return depreciacao;
}
public void setDepreciacao(double depreciacao) {
	this.depreciacao = depreciacao;
}
// métodos sobrescritos da hierarquia
public double getValor() {
	return(super.getValor() - this.getDepreciacao());
}
}
