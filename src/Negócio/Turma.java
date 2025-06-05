package Negócio;

import Persistencia.TurmaDAO;

public class Turma {
// propriedades da classe
	private String idTurma = "";
	private Disciplina objDisciplina = null;
	private Professor objProfessor = null;
	private String letra = "";

	// métodos construtores da classe
	public Turma() {
		super();
	}

	public Turma(String idTurma, Disciplina objDisciplina, Professor objProfessor, String letra) {
		super();
		this.idTurma = idTurma;
		this.objDisciplina = objDisciplina;
		this.objProfessor = objProfessor;
		this.letra = letra;
	}

	// métodos de acesso da classe
	public String getidTurma() {
		return idTurma;
	}

	public void setidTurma(String idTurma) {
		this.idTurma = idTurma;
	}

	public Disciplina getObjDisciplina() {
		return objDisciplina;
	}

	public void setObjDisciplina(Disciplina objDisciplina) {
		this.objDisciplina = objDisciplina;
	}

	public Professor getObjProfessor() {
		return objProfessor;
	}

	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	// métodos da classe
	public void persistir() throws Exception {
		new TurmaDAO().persistir(this);
	}
}
