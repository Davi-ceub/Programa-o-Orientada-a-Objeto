package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.LinkedList;

import Negócio.Disciplina;

public class DisciplinaDAO {
	// propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

	// métodos da classe
	public Collection<Disciplina> getTodos() throws Exception {
		LinkedList<Disciplina> colecao = new LinkedList<Disciplina>();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM DISCIPLINA");
		objCursor = objExecucao.executeQuery();

		while (objCursor.next()) { // while vai buscar todas as linhas da tabela
			colecao.add(new Disciplina(objCursor.getInt("idDisciplina"), objCursor.getString("Nome")));
		}
		objBanco.desconectar();

		return colecao;
	}
}
