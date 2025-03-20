package negócio;

public class Gerente extends Colaborador {
 // Propriedades da classe
	private double bonus = 0;
// Métodos construtores da classe
	public Gerente() {
		super();
	}
public Gerente(int matricula, String nome, double salario, double bonus) {
	super(matricula, nome, salario);
	this.bonus = bonus;
}
// métodos de acesso da classe
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
// métodos sobrescritos da hierarquia
 public double getSalario() {
   return (super.getSalario() + this.getBonus());
  }
 }

