package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.LinkedList;

import Negócio.Professor;

public class ProfessorDAO {
	// propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

	// métodos da classe
	public Collection<Professor> getTodos() throws Exception {
		LinkedList<Professor> colecao = new LinkedList<Professor>();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PROFESSOR");
		objCursor = objExecucao.executeQuery();

		while (objCursor.next()) { // while vai buscar todas as linhas da tabela
			colecao.add(new Professor(objCursor.getInt("idProfessor"), objCursor.getString("Nome"),
					objCursor.getString("Titulacao")));
		}
		objBanco.desconectar();

		return colecao;
	}
}
