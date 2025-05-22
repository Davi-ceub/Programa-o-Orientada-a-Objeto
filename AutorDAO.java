package Persistência;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import Negócio.Autor;

public class AutorDAO {
// propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

// métodos da classe
	public Collection<Autor> getTodos() throws Exception {
		ArrayList<Autor> colecao = new ArrayList<Autor>();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM AUTOR");
		objCursor = objExecucao.executeQuery();

		while (objCursor.next()) {  // while vai buscar todas as linhas da tabela
			colecao.add(new Autor(objCursor.getInt("idAutor"), objCursor.getString("Nome")));
		}
		objBanco.desconectar();

		return colecao;
	}
}
