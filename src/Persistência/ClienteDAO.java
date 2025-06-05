package Persistência;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import Negócio.Cliente;

public class ClienteDAO {
	// propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

	// métodos da classe
	public Collection<Cliente> getTodos() throws Exception {
		ArrayList<Cliente> colecao = new ArrayList<Cliente>();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CLIENTE");
		objCursor = objExecucao.executeQuery();

		while (objCursor.next()) { // while vai buscar todas as linhas da tabela
			colecao.add(new Cliente(objCursor.getInt("idCliente"), objCursor.getString("Nome"),
					objCursor.getString("CartaoDeCredito")));
		}
		objBanco.desconectar();

		return colecao;
	}
}
