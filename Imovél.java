package negócio;

public abstract class Imovél {
// propriedades da classe
 private String endereco = "";
 private double metragem = 0;
 private double valor = 0;
 //métodos construtores da classe
public Imovél() {
	super();
}
public Imovél(String endereco, double metragem, double valor) {
	super();
	this.endereco = endereco;
	this.metragem = metragem;
	this.valor = valor;
}// métodos de acesso da classe
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public double getMetragem() {
	return metragem;
}
public void setMetragem(double metragem) {
	this.metragem = metragem;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}

}
