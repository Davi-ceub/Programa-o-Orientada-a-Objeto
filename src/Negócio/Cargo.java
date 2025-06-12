package Negócio;

import java.util.Collection;

import Persistência.CargoDAO;

public class Cargo {
// propriedades da classe
	private int idCargo = 0;
	private String Nome = "";
	private double Salario = 0;

	// métodos construtores da classe
	public Cargo() {
		super();
	}

	public Cargo(int idCargo, String nome, double salario) {
		super();
		this.idCargo = idCargo;
		this.Nome = nome;
		this.Salario = salario;
	}

// métodos de acesso da classe
	public int getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		this.Salario = salario;
	}

	// métodos da classe
	public static Collection<Cargo> getTodos() throws Exception {
		return new CargoDAO().getTodos();
	}
}
