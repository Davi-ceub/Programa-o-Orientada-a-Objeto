package Negócio;

import java.util.Collection;

import Persistência.ColaboradorDAO;

public class Colaborador {
// propriedades da classe
	private int idColaborador = 0;
	private Cargo objCargo = null;
	private String Nome = "";

	// métodos construtores da classe
	public Colaborador() {
		super();
	}

	public Colaborador(int idColaborador, Cargo objCargo, String nome) {
		super();
		this.idColaborador = idColaborador;
		this.objCargo = objCargo;
		this.Nome = nome;
	}

// métodos de acesso da classe
	public int getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public Cargo getObjCargo() {
		return objCargo;
	}

	public void setObjCargo(Cargo objCargo) {
		this.objCargo = objCargo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	// métodos da classe
	public static Collection<Colaborador> getTodos() throws Exception {
		return new ColaboradorDAO().getTodos();
	}

	// métodos de acesso
	public void persistir() throws Exception {
		new ColaboradorDAO().persistir(this);
	}
}
