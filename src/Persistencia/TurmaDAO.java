package Persistencia;

import java.sql.PreparedStatement;

import Negócio.Turma;

public class TurmaDAO {
	// propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;

	// métodos da classe
	public void persistir(Turma objTurma) throws Exception {
		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement(
				"INSERT INTO TURMA" + "(idTurma, idDisciplina,idProfessor,Letra) " + "VALUES " + "(?, ?, ?, ?)");
		objExecucao.setString(1, objTurma.getidTurma());
		objExecucao.setInt(2, objTurma.getObjDisciplina().getId());
		objExecucao.setInt(3, objTurma.getObjProfessor().getId());
		objExecucao.setString(4, objTurma.getLetra());

		objExecucao.executeUpdate();

		objBanco.desconectar();
	}
}
